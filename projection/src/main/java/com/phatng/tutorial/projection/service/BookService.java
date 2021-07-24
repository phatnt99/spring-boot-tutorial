package com.phatng.tutorial.projection.service;

import java.util.List;

import com.phatng.tutorial.projection.dto.BookSlimDTO;
import com.phatng.tutorial.projection.dto.BookSlimWithVerId;
import com.phatng.tutorial.projection.entity.Book;

public interface BookService {

	Book createOne(Book book);

	List<Book> getAll();

	List<BookSlimWithVerId> getAllWithSlim();
	
	BookSlimDTO getOneWithDTO();
}