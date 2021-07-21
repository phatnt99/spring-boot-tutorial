package com.phatng.tutorial.ngtut.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import com.phatng.tutorial.ngtut.entity.Book;
import com.phatng.tutorial.ngtut.exception.BookNotFoundException;
import com.phatng.tutorial.ngtut.repository.BookRepository;
import com.phatng.tutorial.ngtut.service.impl.BookServiceImpl;

@ExtendWith(MockitoExtension.class)
public class BookServiceTest {

	@Mock
	BookRepository bookRepository;
	
	@InjectMocks
	BookServiceImpl bookService;
	
	@Test
	void whenGetAll_shouldReturnList() {
		// 1. create mock data
		List<Book> mockBooks = new ArrayList<>();
		for(int i = 0; i < 5; i++) {
			mockBooks.add(new Book((long)i));
		}
		
		// 2. define behavior of Repository
		when(bookRepository.findAll()).thenReturn(mockBooks);
		
		// 3. call service method
		List<Book> actualBooks = bookService.getAll();
		
		// 4. assert the result
		assertThat(actualBooks.size()).isEqualTo(mockBooks.size());
		
		// 4.1 ensure repository is called
		verify(bookRepository).findAll();
	}
	
	@Test
	void whenGetInvalidOne_shouldThrowException() {
		Long invalidBookId = 7L;
		
		when(bookRepository.findById(any(Long.class))).thenReturn(Optional.ofNullable(null));
		
		assertThatThrownBy(() -> bookService.getOne(invalidBookId))
		.isInstanceOf(BookNotFoundException.class);
		
		verify(bookRepository).findById(any(Long.class));
	}
}
