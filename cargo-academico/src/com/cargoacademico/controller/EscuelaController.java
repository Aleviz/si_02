package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cargoacademico.dao.EscuelaDao;
import com.cargoacademico.model.Escuela;
import com.cargoacademico.service.EscuelaService;	




@Controller
public class EscuelaController {

	@Autowired
	private EscuelaDao ecuDao;
	private EscuelaService gd;
	
	
	
	@RequestMapping( value = "/showEscuela/save",  method = RequestMethod.POST)
	public String registrar(@ModelAttribute("escuela")Escuela escuela ,
			Model model, RedirectAttributes ra) {
		int x = escuela.getIdEscuela();
		System.out.println(x);
		
		ecuDao.saveEscuela(escuela);
		ra.addFlashAttribute("mensaje","Se ha guardado los canbios");
		
				return "redirect:/showEscuela";
		
	}
	
	@RequestMapping("/showEscuela/{idEscuela}/update")
	public String findEscuelaUpdate(Model model, @PathVariable("idEscuela")int id) {
		Escuela escuela = ecuDao.findById(id);
		List<Escuela> ecuelist = ecuDao.encontrarTodo();
	    model.addAttribute("escuela","Escuela lista para actualizar");
			model.addAttribute("mensaje",ecuelist);
			model.addAttribute("list",escuela);
		return "showEscuela";
		
	}
	
	@RequestMapping("showEscuela/{idEscuela}/delete")
	public String deleteAdmin(@PathVariable("idEscuela")int id, RedirectAttributes ra) {
		gd.delete(id);
		ra.addFlashAttribute("mensaje", "Exito al Eliminar");
		return "redirect:/showEscuela";
	}
	
}