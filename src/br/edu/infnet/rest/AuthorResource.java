package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/authors")
public class AuthorResource {
	
	public AuthorResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Author> getBooks(){
		List<Author> lista = new ArrayList<Author>();
		lista.add(new Author("Lazaro", "Ramos"));
		return lista;
	}

}
