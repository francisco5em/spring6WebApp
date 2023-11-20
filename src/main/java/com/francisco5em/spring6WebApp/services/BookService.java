/**
 * 
 */
package com.francisco5em.spring6WebApp.services;

import com.francisco5em.spring6WebApp.domain.Book;

/**
 * 
 */
public interface BookService {
	
	Iterable<Book> findAll();

}
