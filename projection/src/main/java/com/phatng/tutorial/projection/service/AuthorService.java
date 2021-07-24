package com.phatng.tutorial.projection.service;

import java.util.List;

import com.phatng.tutorial.projection.entity.Author;

public interface AuthorService {

	Author createOne(Author author);

	List<Author> getAll();

}