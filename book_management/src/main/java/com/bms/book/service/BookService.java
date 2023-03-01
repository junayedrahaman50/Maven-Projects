package com.bms.book.service;

import java.util.ArrayList;
import java.util.List;

import com.bms.book.entity.Book;

public class BookService {
// ArrayList
private List<Book> book = new ArrayList<>();
public void addBook(long bookId, String authorName,String bookName, double bookPrice) {
	book.add(new Book(bookId, authorName,bookName, bookPrice));
}
// method of List type
public List<Book> displayAll(){
	return book;
}
// method to get length of List
public int lengthOfList() {
	return book.size();
}
}
