package com.phatng.tutorial.projection.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.phatng.tutorial.projection.entity.Author;

public interface AuthorRepository extends JpaRepository<Author, Long> {

}
