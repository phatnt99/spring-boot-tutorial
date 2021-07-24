package com.phatng.tutorial.projection.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phatng.tutorial.projection.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {
	<T> List<T> findBy(Class<T> classType);

	// findById with Projection
	<T> T findById(Long id, Class<T> type);
}
