package br.edu.infnet.rest;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

@Repository
public abstract class JpaDao<T> implements Dao<T> {

	@PersistenceContext(unitName="prova")
	private EntityManager em;
	
	public void salvar(T entity) {
		em.persist(entity);
	}

	public void atualizar(T entity) {
		em.getTransaction().begin();
		em.merge(entity);
		em.getTransaction().commit();
	}

}
