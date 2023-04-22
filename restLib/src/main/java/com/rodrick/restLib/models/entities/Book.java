package com.rodrick.restLib.models.entities;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Book {
	private String isbn;
	private String title;
	private Date publishDate;
	private String image;
}

//Data es para crear mis setters y getters
//@AllArgsConstructor me crea mis argumentos para mi constructor y no hacerlo yo
//se debe de importar de java.util el tipo Date
