package com.phatng.tutorial.ngtut.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phatng.tutorial.ngtut.entity.Book;

public interface BookRepository extends JpaRepository<Book, Long> {

}
