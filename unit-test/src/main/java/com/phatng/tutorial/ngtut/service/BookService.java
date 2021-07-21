package com.phatng.tutorial.ngtut.service;

import java.util.List;

import com.phatng.tutorial.ngtut.entity.Book;

public interface BookService {

	List<Book> getAll();

	Book getOne(Long id);

}