package br.edu.infnet.rest;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/books")
public class BookResource {
	
	public BookResource() {
	}
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Book> getBooks(){
		List<Book> lista = new ArrayList<Book>();
		lista.add(new Book("Na Minha Pele"));
		return lista;
	}

}
