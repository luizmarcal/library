package br.edu.infnet.rest;

public class Book {

	private Integer isbn;
	private String bookTitle;
	private String dateOfPublication;

	public Book(String isbn) {
		this.isbn = isbn;
	}

	public Integer getIsbn() {
		return isbn;
	}

	public void setIsbn(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(String bookTitle) {
		this.bookTitle = bookTitle;
	}

	public String getDateOfPublication() {
		return dateOfPublication;
	}

	public void setDateOfPublication(String dateOfPublication) {
		this.dateOfPublication = dateOfPublication;
	}
	
}
