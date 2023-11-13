/**
 * 
 */
package com.francisco5em.spring6WebApp.bootstrap;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.francisco5em.spring6WebApp.domain.Author;
import com.francisco5em.spring6WebApp.domain.Book;
import com.francisco5em.spring6WebApp.domain.Publisher;
import com.francisco5em.spring6WebApp.repositories.*;

/**
 * Creado por Francisco E.
 */
@Component
public class BootstrapData implements CommandLineRunner{

	private final AuthorRepository authorRepo;
	private final BookRepository bookRepo;
	private final PublisherRepository publisherRepo;
	
	/**
	 * @param authorRepo
	 * @param bookRepo
	 */
	public BootstrapData(AuthorRepository authorRepo, BookRepository bookRepo, PublisherRepository publisherRepo) {
		this.authorRepo = authorRepo;
		this.bookRepo = bookRepo;
		this.publisherRepo= publisherRepo;
		
	}



	@Override
	public void run(String... args) throws Exception {
		Author juan=new Author();
		juan.setFirstName("Juan");
		juan.setLastName("Moreno");
		
		Book oneM= new Book();
		oneM.setTitle("Un Millon de estrellas");
		oneM.setIsbn("123456789");
		
		
		Author juanGuardado= authorRepo.save(juan);
		Book oneMGuardado = bookRepo.save(oneM);
		
		Author pedro=new Author();
		pedro.setFirstName("Pedro");
		pedro.setLastName("Vautista");
		
		Book musicaL= new Book();
		musicaL.setTitle("Musica Libre de emocion");
		musicaL.setIsbn("987654321");
		
		
		Author pedroGuardado= authorRepo.save(pedro);
		Book musicaLGuardado = bookRepo.save(musicaL);
		
		juanGuardado.getBooks().add(oneMGuardado);
		pedroGuardado.getBooks().add(musicaLGuardado);
		oneMGuardado.getAuthors().add(juanGuardado);
		musicaLGuardado.getAuthors().add(pedroGuardado);
		
		Publisher publisher = new Publisher();
        publisher.setPublisherName("My Publisher");
        publisher.setAddress("123 Main");
        Publisher publisherGuardado = publisherRepo.save(publisher);
        
        oneMGuardado.setPublisher(publisherGuardado);
        musicaLGuardado.setPublisher(publisherGuardado);
        
		authorRepo.save(juanGuardado);
		authorRepo.save(pedroGuardado);
		bookRepo.save(oneMGuardado);
		bookRepo.save(musicaLGuardado);
		
		System.out.println("En Bootstrap");
		System.out.println("Numero de Autores: "+authorRepo.count());
		System.out.println("Numero de Libros: "+bookRepo.count());
		


        System.out.println("Publisher Count: " + publisherRepo.count());
		
	}

	
}
