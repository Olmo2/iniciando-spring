package com.olmo.iniciandoSpring.rutas;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import com.olmo.iniciandoSpring.beans.AutorBean;
import com.olmo.iniciandoSpring.beans.ListaAutores;

@Controller
public class RutasBasicas {
	
	
	//@GetMapping("/start/{nombre}/{edad}") @PathVariable String nombre,
	//@PathVariable Integer edad,
	@GetMapping("/start")
	public String rutaBasicaInicial(Model model) {
		
		List<AutorBean> listaAutores = ListaAutores.construirLista();
		model.addAttribute("autores",listaAutores);

		return "respuesta";
		
	}
	
	@GetMapping("/autores/{id}")
	public String verAutor(@PathVariable Integer id,
							Model model) {
		
		AutorBean autor = ListaAutores.getAutor(id);
		model.addAttribute("autor",autor);
		return "autor";
		
	}
	
	@GetMapping("/comienzo")
	public String rutaCero(@RequestParam(required=false) Integer id,
							@RequestParam(required=false) String nombre) {
		System.out.println("id: " + id);
		System.out.println("nombre: "+ nombre);
		return "cero";
	}
	
	@GetMapping("/olmo")
	public String rutaOlmo() {
		System.out.println("Olmo ha llegado");
		return "hola";
	}
}
