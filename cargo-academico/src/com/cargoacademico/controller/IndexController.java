package com.cargoacademico.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;


/*el dispatcher se encargar de recibir todas las peticiones http en spring, un handler mapping detecta
 * la peticion la envia al dispatcher y este buscara un controlador spring con la anotacion @Controller
 * y buscara un controlador para la peticion el controlador returnara un nombre logico de la vista
 * de vuelta a distpatcher y la enviara a un viewResolver que le dara un prefijo y sufijo y se renderiza la vista
 * 
 *  con el nombre log anotacion controller recibira las peticiones desde el dispatcher
 *  y las enviara a surespectivo controalador
 */
@Controller
/*
 * anotacion sessionAtributes aceptara una lista de atributos desde el modelo
 * este mantendra los atributos en session en todas las paginas para el usuario
 * en httpSession
 */
@SessionAttributes("mensaje")
public class IndexController {
	@RequestMapping("/")
	public String mostrarIndex(Model model) {
		model.addAttribute("modelo", "eleccion");
		model.addAttribute("mensaje", "Elije la opcion que desea ver");
		return "index";
	}


}
