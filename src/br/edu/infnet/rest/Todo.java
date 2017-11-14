package br.edu.infnet.rest;

public class Todo {
	
	private Integer id;
	
	private String descricao;
	
	private Integer prioridade;

	public Todo() {
	}
	
	public Todo(int id, String descricao, int prioridade) {
		this.id = id;
		this.descricao = descricao;
		this.prioridade = prioridade;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Integer getPrioridade() {
		return prioridade;
	}

	public void setPrioridade(Integer prioridade) {
		this.prioridade = prioridade;
	}
	

}
