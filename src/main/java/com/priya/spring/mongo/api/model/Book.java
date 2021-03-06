package com.priya.spring.mongo.api.model;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString

@Document(collection = "Book")
public class Book {
	private int id;
	private String bookName;
	private String authorName;
	
}
