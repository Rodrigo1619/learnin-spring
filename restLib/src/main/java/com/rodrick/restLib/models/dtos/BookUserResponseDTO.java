package com.rodrick.restLib.models.dtos;

import com.rodrick.restLib.models.entities.Book;
import com.rodrick.restLib.models.entities.User;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class BookUserResponseDTO {
	private Book book;
	private User user;
}

//Como es un POJO solo es una clase sencilla y lo bueno de que es un DTO es que 
//no obtenemos toda la informacion del libro y usuario solo para mostrar un libro y usuario
