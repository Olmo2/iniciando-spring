package com.olmo.iniciandoSpring.beans;

public class AutorBean {
	
	private int id;
	private String nombre;
	private String apellido;
	private String nacionalidad;
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public String getNacionalidad() {
		return nacionalidad;
	}
	public void setNacionalidad(String nacionalidad) {
		this.nacionalidad = nacionalidad;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}

	
	
}
