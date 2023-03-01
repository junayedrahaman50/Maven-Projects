package com.bms.book.entity;

public class Book {
	//instance variables
	private long bookID;
	private String bookName;
	private String authorName;
	private double bookPrice;
    //constructor
	public Book(long bookID, String authorName,String bookName, double bookPrice) {
		super();
		this.bookID = bookID;
		this.authorName = authorName;
		this.bookName = bookName;
		this.bookPrice = bookPrice;
	}
	//getter methods
	public long getBookID() {
		return bookID;
	}
	public String getAuthorName() {
		return authorName;
	}
	public String getbookName() {
		return bookName;
	}
	
	public double getBookPrice() {
		return bookPrice;
	}
	
}
