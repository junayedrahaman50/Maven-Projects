package com.bms.book;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.bms.book.service.BookService;

public class BookServiceTest {
BookService bookService; // reference variable
@BeforeEach // Annotation
void setup() {
	bookService = new BookService();
}
@AfterEach // Annotation
void cleanup() {
	bookService = null;
	System.out.println("garbage collected");
}
@Test 
@DisplayName("Test for addBook method")
public void addBookTest() {
	bookService.addBook(100, "Paulo Coelho", "The Alchemist", 378);
	bookService.addBook(101, "Oscar Wilde", "The Canterville Ghost", 125);
	assertEquals(2, bookService.lengthOfList());
}
@Test
@DisplayName("Test for displayAll method")
public void displayAllTest() {
	bookService.addBook(100, "Paulo Coelho", "The Alchemist", 378);	
	assertThat(bookService.displayAll()).isNotNull();
}
}
