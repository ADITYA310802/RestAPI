package com.api.proj.services;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.api.proj.dao.BookRepo;
import com.api.proj.entities.Book;

@Component
public class BookService {
	/*
	 * static private List<Book> list = new ArrayList<>(); static { list.add(new
	 * Book(123, "Game of Thrones", "George RR Martin")); list.add(new Book(231,
	 * "Bridgerton", "Julia Quinn")); list.add(new Book(41, "Harry Potter",
	 * "JK Rowling")); }
	 */
	
	@Autowired
	private BookRepo bookrepo;
	

	public List<Book> getAllBooks() {
		
		List<Book> list= (List<Book>)this.bookrepo.findAll();
		return list;
				
	}

	public Book getBookById(int id) {
		Book book = null;

		try {
			book=this.bookrepo.findById(id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return book;
	}

	// adding a book
	public Book addBook(Book bk) {
		Book res=bookrepo.save(bk);
		return res;
	}

	public void deleteBook(int Bid) {

		bookrepo.deleteById(Bid);
	}

	public void updateBook(Book bk, int id) {

		bk.setId(id);
		bookrepo.save(bk);

	}

}
