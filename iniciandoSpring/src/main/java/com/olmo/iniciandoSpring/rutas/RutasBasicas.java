package com.olmo.iniciandoSpring.rutas;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class RutasBasicas {

	@GetMapping("/start/{nombre}/{edad}")
	public String rutaBasicaInicial(@PathVariable String nombre,
									@PathVariable Integer edad,
									Model model) {
		model.addAttribute("nombre",nombre);
		model.addAttribute("edad",edad);

		return "respuesta";
		
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
