package br.edu.infnet.rest;

import org.springframework.stereotype.Repository;

@Repository
public class AuthorDao extends JpaDao<Author> {
	public AuthorDao() {
		super(Author.class);
	}
}
