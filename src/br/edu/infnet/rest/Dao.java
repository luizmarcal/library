package br.edu.infnet.rest;

public interface Dao {
	void salvar(T entity);
	void atualizar(T entity);
}
