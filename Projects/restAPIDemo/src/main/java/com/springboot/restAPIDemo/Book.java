package com.springboot.restAPIDemo;

public class Book {
	private long bookID;
	private String bookName;
	private String bookAuthor;

	public Book(long bookID, String bookName, String bookAuthor) {
		super();
		this.bookID = bookID;
		this.bookName = bookName;
		this.bookAuthor = bookAuthor;
	}

	public long getBookID() {
		return bookID;
	}

	public String getBookName() {
		return bookName;
	}

	public String getBookAuthor() {
		return bookAuthor;
	}
}
