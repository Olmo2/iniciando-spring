package com.olmo.iniciandoSpring.rutas;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.olmo.iniciandoSpring.beans.AutorBean;
import com.olmo.iniciandoSpring.beans.ListaAutores;

@Controller
public class RutasBasicas {
	
	
	ListaAutores lista = ListaAutores.getLista();
	
	//@GetMapping("/start/{nombre}/{edad}") @PathVariable String nombre,
	//@PathVariable Integer edad,
	
	
	
	@GetMapping("/")
	public String rutaBasicaInicial(Model model) {
		
//		List<AutorBean> listaAutores = ListaAutores.construirLista();
		
		model.addAttribute("autores",lista.getDatos());

		return "respuesta";
		
	}
	
	@GetMapping("/autores/{id}")
	public String verAutor(@PathVariable Integer id,
							Model model) {
		
		AutorBean autor = lista.getAutor(id);
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
	
	@GetMapping("/borrar/{id}")
	public String rutaBorrar( @PathVariable Integer id,
			Model model) {
		System.out.println("He llegado");
	
		lista.del(id);
		model.addAttribute("autores",lista.getDatos());
		return "respuesta";
	}
	
	@GetMapping("/nuevoAutor")
	public String nuevoAutor(Model model) {
		
		model.addAttribute("autor", new AutorBean());
		return "nuevoAutor"; // HTML del formulario nuevo autor
		
	}
	
	@PostMapping("/addAutor")
	public String nuevoAutor(@ModelAttribute AutorBean autor) {
		

		System.out.println(autor);
		System.out.println(lista);
		lista.addAutor(autor);
		
		return "redirect:/"; // HTML del formulario nuevo autor
		
	}
	
	@GetMapping("/editarAutor/{id}")
	public String editarAutor(@PathVariable Integer id,
								Model model) {
		
		AutorBean autor = lista.getAutor(id);
		lista.updateAutor(autor);
	return "editarAutor";
		
		
	}
	
	@PostMapping("/updateAutor")
	public String updateAutor(@ModelAttribute AutorBean autor) {
		
		
		lista.updateAutor(autor);
		
		return "redirect:/"; // HTML del formulario nuevo autor
		
	}
}
