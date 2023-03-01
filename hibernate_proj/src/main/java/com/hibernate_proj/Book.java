package com.hibernate_proj;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book_info")
public class Book {
	@Id // For Primary Key
	@GeneratedValue(strategy = GenerationType.IDENTITY) // Auto Increment
	// Instance Fields
	
	int bookId;
	@Column(name="bookName", length=50, nullable=false)
	String bookName;
	@Column(name="bookPrice", length=10)
	String bookPrice;
	@Column(name="bookPages", length=5)
	String bookPages;
	
	// Constructor
	public Book(int bookId, String bookName, String bookPrice, String bookPages) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookPages = bookPages;
	}
	
	// Getter Methods
	public int getBookId() {
		return bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public String getBookPrice() {
		return bookPrice;
	}
	public String getBookPages() {
		return bookPages;
	}
	
	
	
}
