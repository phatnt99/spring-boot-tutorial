package com.phatng.tutorial.projection.dto;

public interface BookSlim {
	Long getId();

	String getTitle();

	AuthorWithId getAuthor();

	interface AuthorWithId {
		Long getId();
	}
}
