package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/alunos")
public class AlunoResource {
	
	public AlunoResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Aluno> getAlunos(){
		List<Aluno> lista = new ArrayList<Aluno>();
		lista.add(new Aluno("Janete"));
		return lista;
	}

}
