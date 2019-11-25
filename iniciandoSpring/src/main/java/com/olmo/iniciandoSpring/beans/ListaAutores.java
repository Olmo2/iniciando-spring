package com.olmo.iniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/*private static EntityManager entityManager = null;
	
	private ConnectionEntityManager() {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("com.olmo.biblioteca.H2");
		entityManager = entityManagerFactory.createEntityManager();
	}
	
	
	public static EntityManager getEntityManager() {
		
		if(entityManager==null) {
			
			new ConnectionEntityManager();
		}
		return entityManager;
	}
	*/

public class ListaAutores {

	private static ArrayList<AutorBean> lista = null;
	
	private ListaAutores() {
		 lista = new ArrayList<AutorBean>();
		 construirLista(lista);
	}
	
	
public static ArrayList<AutorBean> getLista() {
		
		if(lista==null) {
			
			new ListaAutores();
		}
		return lista;
	}
	

	

	public static List<AutorBean> construirLista(ArrayList<AutorBean>lista){
		
		
		
		AutorBean olmo = new AutorBean();
		olmo.setId(random());
		olmo.setNombre("olmo");
		olmo.setNacionalidad("Española");
		getLista().add(olmo);
		
		AutorBean paco = new AutorBean();
		paco.setId(random());
		paco.setNombre("paco");
		paco.setNacionalidad("Española");
		getLista().add(paco);
		
		AutorBean antonio = new AutorBean();
		antonio.setId(random());
		antonio.setNombre("antonio");
		antonio.setNacionalidad("Española");
		getLista().add(antonio);
		
		return lista;
		
	}
	
	
	private static Integer random() {
		List<Integer> used =  new ArrayList<Integer>();
		used.add(0);
		Random r = new Random();
		int num = 0;
		
		boolean usado;
		while(used.contains(num)) {
			num= r.nextInt(100-1) + 1;
		}
		used.add(num);
		
		return num;
		
		
		
		
	}
	
	
}

