package com.olmo.iniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;

public class ListaAutores {

	private static ArrayList<AutorBean> lista = new ArrayList<AutorBean>();
	
	/**
	 * Devuelve un autor en concreto
	 * @param id
	 * @return
	 */
	public static AutorBean getAutor(int id) {
		return lista.get(id);
	}

	

	public static List<AutorBean> construirLista(){
		
		
		
		AutorBean olmo = new AutorBean();
		olmo.setId(0);
		olmo.setNombre("olmo");
		olmo.setNacionalidad("Española");
		lista.add(olmo);
		
		AutorBean paco = new AutorBean();
		paco.setId(1);
		paco.setNombre("paco");
		paco.setNacionalidad("Española");
		lista.add(paco);
		
		AutorBean antonio = new AutorBean();
		antonio.setId(2);
		antonio.setNombre("antonio");
		antonio.setNacionalidad("Española");
		lista.add(antonio);
		
		return lista;
		
	}
	
	
	
}

