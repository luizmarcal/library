package br.edu.infnet.rest;

import org.springframework.stereotype.Repository;

@Repository
public class BookDao extends JpaDao<Book> {
	public BookDao() {
		super(Book.class);
	}
}
