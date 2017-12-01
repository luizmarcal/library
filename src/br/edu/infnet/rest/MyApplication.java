package br.edu.infnet.rest;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;


@ApplicationPath("/rest")
public class MyApplication extends Application {

	
	public Set<Class<?>> getClasses(){
		final Set<Class<?>> classes = new HashSet<Class<?>>();
		classes.add(AuthorResource.class);
		classes.add(BookResource.class);
		classes.add(CategoryResource.class);
		return classes;
	}
	
	
}
