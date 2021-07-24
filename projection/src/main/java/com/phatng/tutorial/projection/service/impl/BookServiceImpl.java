package com.phatng.tutorial.projection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phatng.tutorial.projection.dto.BookSlimDTO;
import com.phatng.tutorial.projection.dto.BookSlimWithVerId;
import com.phatng.tutorial.projection.entity.Book;
import com.phatng.tutorial.projection.repository.BookRepository;
import com.phatng.tutorial.projection.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	@Autowired
	BookRepository bookRepository;

	@Override
	public Book createOne(Book book) {

		return bookRepository.save(book);
	}

	@Override
	public List<Book> getAll() {

		return bookRepository.findAll();
	}

	@Override
	public List<BookSlimWithVerId> getAllWithSlim() {

		return bookRepository.findBy(BookSlimWithVerId.class);
	}

	@Override
	public BookSlimDTO getOneWithDTO() {
		
		return bookRepository.findById(1L, BookSlimDTO.class);
	}
}
