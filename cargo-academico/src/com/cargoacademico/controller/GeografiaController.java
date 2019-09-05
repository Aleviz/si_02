package com.cargoacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.ui.Model;
import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Facultad;
import com.cargoacademico.service.GeografiaService;
import com.fasterxml.jackson.databind.ObjectMapper;

@Controller
public class GeografiaController {

	@Autowired
	private GeografiaService geografiaService;
	
	@RequestMapping("/contacto")
	public String showContacto(Model model,
			@ModelAttribute("mensaje") String mensaje) {

		ObjectMapper mapper = new ObjectMapper();
		
		List<Facultad> facultadList = geografiaService.allFacultad();
		Facultad facultad = new Facultad();
		
		List<Campus> campusList = geografiaService.allCampus();
		Campus campus = new Campus();
		
		List<Coordenadas> coordenadasList = geografiaService.allCoordenadas();
		
		model.addAttribute("coordenadasList", coordenadasList);
		model.addAttribute("facultadList", facultadList);
		model.addAttribute("facultad", facultad);
		
		model.addAttribute("campusList", campusList);
		model.addAttribute("campus", campus);
		
		return "contacto";
	}
	
	
	
	//****************************************FACULTAD***********************************
	
	//GUARDAR FACULTAD
	
	@RequestMapping(value = "/contacto/facultad/save", method = RequestMethod.POST)
	public String guardarActualizarF(@ModelAttribute("facultad") Facultad facultad, @ModelAttribute("coordenada") Coordenadas coordenadas,
			Model model, RedirectAttributes ra) {
		
		facultad.setCoordenadas(coordenadas);
		geografiaService.saveOrUpdateFacultad(facultad);
		ra.addFlashAttribute("mensaje", "Se han guardado los cambios");
		
		return "redirect:/contacto";
	}
	
	
	// OBTENER ID PARA HACER UPDATE HA FACULTAD

	@RequestMapping("/contacto/facultad/{idFacultad}/update")
	public String findIdF (Model model, @PathVariable("idFacultad") int id) {
		
		Facultad facultad = geografiaService.findByIdF(id);
		List<Facultad> facultadList = geografiaService.allFacultad();
		model.addAttribute("mensaje","Materia Lista para Actualizar");
		model.addAttribute("facultadList", facultadList);
		model.addAttribute("facultad", facultad);
		return "contacto";
	}
	

		
	//****************************************CAMPUS***********************************
	
	
	//GUARDAR CAMPUS
	
	@RequestMapping(value = "/contacto/campus/save", method = RequestMethod.POST)
	public String guardarActualizarC(@ModelAttribute("campus") Campus campus, @ModelAttribute("coordenada") Coordenadas coordenadas,
			Model model, RedirectAttributes ra) {
		
		campus.setCoordenadas(coordenadas);
		geografiaService.saveOrUpdateCampus(campus);
		ra.addFlashAttribute("mensaje", "Se han guardado los cambios");
		
		return "redirect:/contacto";
	}
	
	
	// OBTENER ID PARA HACER UPDATE HA CAMPUS

	@RequestMapping("/contacto/campus/{idCampus}/update")
	public String findIdC (Model model, @PathVariable("idCampus") int id) {
		
		Campus campus = geografiaService.findByIdCp(id);
		List<Campus> campusList = geografiaService.allCampus();
		model.addAttribute("mensaje","Materia Lista para Actualizar");
		model.addAttribute("campusList", campusList);
		model.addAttribute("campus", campus);
		return "contacto";
	}
	

}
