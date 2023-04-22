package com.rodrick.restLib.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.rodrick.restLib.models.dtos.BookUserResponseDTO;
import com.rodrick.restLib.models.dtos.SearchBookDTO;
import com.rodrick.restLib.models.entities.Book;
import com.rodrick.restLib.models.entities.User;
import com.rodrick.restLib.services.BookService;
import com.rodrick.restLib.services.UserService;

import jakarta.validation.Valid;

@RestController //con esto decimos que es un controlador
@RequestMapping("/library") //nuestra ruta
@CrossOrigin("*") //son los cors, para que una app externa se pueda conectar
public class LibraryController {
	@Autowired //con esto decimos que aqui lo inyectaremos
	private UserService userService;
	
	@Autowired
	private BookService bookService;
	
	@GetMapping("/book")
	public ResponseEntity<?> findOneBookByIsbnAndUser(
			@Valid SearchBookDTO search, BindingResult validations){
		if(validations.hasErrors()) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		User userFound = userService.findOneById(search.getIdentifier());
		if(userFound == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		Book bookFound = bookService.findOneById(search.getIsbn());
		if(bookFound == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		
		BookUserResponseDTO response = 
					new BookUserResponseDTO(bookFound, userFound);
		
		return new ResponseEntity<>(response, HttpStatus.OK);
	}
			
}
