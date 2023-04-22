package com.rodrick.restLib.services;

import java.util.List;

import com.rodrick.restLib.models.entities.Book;

public interface BookService {
	void save(Book book);
	void delete(String isbn);
	Book findOneById(String isbn);
	List<Book> findAll();
}
