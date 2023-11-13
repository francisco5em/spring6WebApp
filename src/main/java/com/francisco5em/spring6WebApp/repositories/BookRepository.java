/**
 * 
 */
package com.francisco5em.spring6WebApp.repositories;

import org.springframework.data.repository.CrudRepository;

import com.francisco5em.spring6WebApp.domain.Book;

/**
 *  Creado por Francisco E.
 */
public interface BookRepository extends CrudRepository<Book, Long>{

}
