package br.edu.infnet.rest;

import org.springframework.stereotype.Repository;

@Repository
public class CategoryDao extends JpaDao<Category> {
	public CategoryDao() {
		super(Category.class);
	}
}
