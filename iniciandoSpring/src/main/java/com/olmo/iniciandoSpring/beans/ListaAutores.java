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
		 construirLista();
	}
	
	
public static ArrayList<AutorBean> getLista() {
		
		if(lista==null) {
			
			new ListaAutores();
		}
		return lista;
	}
	

	

	public List<AutorBean> construirLista(){
		
		
		
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
		
		while(used.contains(num)) {
			num= r.nextInt(100-1) + 1;
		}
		used.add(num);
		
		return num;
		
	}
	
	
	
public static void del(int idBuscado) {
		
		int dondeEsta = buscarDondeEsta(idBuscado);
		if(dondeEsta>=0) {
			
			lista.remove(dondeEsta);
		}
	}
	
public static AutorBean getAutor(int idBuscado) {
		
		int dondeEsta = buscarDondeEsta(idBuscado);
		if(dondeEsta>=0) {
			
			return lista.get(dondeEsta);
		}
		else return null;
	}
	
private static int buscarDondeEsta(int idBuscado) {
		
		boolean encontrado = false;
		
		int indice = 0;
		while((!encontrado)&&(indice<lista.size())) {
			
			if(lista.get(indice).getId()==idBuscado) {
				
				encontrado = true;
			}
			else indice ++;
		}
		if(encontrado) return indice; else return -1;
	}
	
}

