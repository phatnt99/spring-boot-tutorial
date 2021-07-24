package com.phatng.tutorial.projection.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.phatng.tutorial.projection.service.BookService;

@RestController
@RequestMapping("/books")
public class BookController {

	@Autowired
	BookService bookService;

	@GetMapping
	public ResponseEntity<?> getAll() {

		return ResponseEntity.ok(bookService.getAll());
	}

	@GetMapping("/slim")
	public ResponseEntity<?> getAllWithSlim() {

		return ResponseEntity.ok(bookService.getAllWithSlim());
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getOneWithDTO() {

		return ResponseEntity.ok(bookService.getOneWithDTO());
	}
}
