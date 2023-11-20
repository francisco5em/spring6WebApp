package com.francisco5em.spring6WebApp.services;

import org.springframework.stereotype.Service;
import com.francisco5em.spring6WebApp.domain.Book;
import com.francisco5em.spring6WebApp.repositories.BookRepository;

/**
 * Creado por Francisco E.
 */
@Service
public class BookServiceImple implements BookService {

	private final BookRepository bookRepo;
	
	
	
	/**
	 * @param bookRepo
	 */
	public BookServiceImple(BookRepository bookRepo) {
		super();
		this.bookRepo = bookRepo;
	}



	@Override
	public Iterable<Book> findAll() {
		// TODO Auto-generated method stub
		return bookRepo.findAll();
	}

}
