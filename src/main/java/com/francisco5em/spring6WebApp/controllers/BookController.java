package com.francisco5em.spring6WebApp.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.francisco5em.spring6WebApp.domain.Book;
import com.francisco5em.spring6WebApp.services.BookService;

/**
 * Creado por Francisco E.
 */
@Controller
public class BookController {

	private final BookService bookservice;

	/**
	 * @param bookservice
	 */
	public BookController(BookService bookservice) {
		super();
		this.bookservice = bookservice;
	}
	
	
	@RequestMapping("/books")
	public String getBooks(Model model) {
		 
		model.addAttribute("books",bookservice.findAll());
		return "books";
	}
	
	
	
}
