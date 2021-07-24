package com.phatng.tutorial.projection.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.phatng.tutorial.projection.entity.Author;
import com.phatng.tutorial.projection.repository.AuthorRepository;
import com.phatng.tutorial.projection.service.AuthorService;

@Service
public class AuthorServiceImpl implements AuthorService {
	
	@Autowired
	AuthorRepository authorRepository;
	
	@Override
	public Author createOne(Author author) {
		
		return authorRepository.save(author);
	}
	
	@Override
	public List<Author> getAll() {
		
		return authorRepository.findAll();
	}
}
