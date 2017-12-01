package br.edu.infnet.rest;

public class Category {
	
	private Integer id;
	private String nome;
	
	public Category(String nome) {
		this.nome = nome;
	}
	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
