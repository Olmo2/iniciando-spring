package com.olmo.iniciandoSpring.beans;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class ListaAutores  {

	private static ArrayList<AutorBean> lista = null;
	private static ListaAutores listaAutores =null;
	
	private ListaAutores() {
		
		 lista = new ArrayList<AutorBean>();
	
	}
	
	


public List<AutorBean> getDatos(){
	
	return lista;
}
	

	

	static List<Integer> used =  new ArrayList<Integer>();
	
	
	private static  Integer random() {
		Random r = new Random();
		int num = r.nextInt(100-1) + 1;
		
		while(used.contains(num)) {
			num= r.nextInt(100-1) + 1;
		}
		used.add(num);
		
		return num;
		
	}
	
	
	
public  void del(int idBuscado) {
		
		int dondeEsta = buscarDondeEsta(idBuscado);
		if(dondeEsta>=0) {
			
			lista.remove(dondeEsta);
		}
	}
	
public  AutorBean getAutor(int idBuscado) {
		
		int dondeEsta = buscarDondeEsta(idBuscado);
		if(dondeEsta>=0) {
			
			return lista.get(dondeEsta);
		}
		else return null;
	}
	
private  int buscarDondeEsta(int idBuscado) {
		
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


public static ListaAutores getLista() {
	
	if(listaAutores==null) {
		
		listaAutores=new ListaAutores();
	}
	return listaAutores;
}
/*
 * Añade un autor 
 * 
 * @param autor
 * */
public  void addAutor(AutorBean autor) {
	
	autor.setId(random());
	lista.add(autor);
	
	
}
/*
 * Actualiza un autor 
 * 
 * @param autor
 */
public  void updateAutor(AutorBean autor) {
	
	
	int pos = buscarDondeEsta(autor.getId());
	lista.set(pos, autor);
	
	
	
}

	
}

