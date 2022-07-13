package com.api.proj.dao;

import org.springframework.data.repository.CrudRepository;

import com.api.proj.entities.Book;

public interface BookRepo extends CrudRepository<Book, Integer> {
	public Book findById(int id);

}
