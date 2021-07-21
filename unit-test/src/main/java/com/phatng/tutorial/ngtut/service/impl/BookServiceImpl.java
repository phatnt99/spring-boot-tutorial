package com.phatng.tutorial.ngtut.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phatng.tutorial.ngtut.entity.Book;
import com.phatng.tutorial.ngtut.exception.BookNotFoundException;
import com.phatng.tutorial.ngtut.repository.BookRepository;
import com.phatng.tutorial.ngtut.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	private BookRepository bookRepository;
	
	@Override
	public List<Book> getAll() {
		
		return bookRepository.findAll();
	}
	
	@Override
	public Book getOne(Long id) {
		
		return bookRepository.findById(id).orElseThrow(BookNotFoundException::new);
	}
}
