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

import com.cargoacademico.model.Materias;
import com.cargoacademico.service.GenericService;

@Controller
public class MateriasController {

	@Autowired
	private GenericService gd;

	@RequestMapping("/showMaterias")
	public String showMaterias(Model model, @ModelAttribute("mensaje") String mensaje) {

		List<Materias> matList = gd.findAll();
		Materias materia = new Materias();
		model.addAttribute("mate", materia);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("lista", matList);

		List<Materias> m = new ArrayList<Materias>();

		return "showMaterias";
	}

	@RequestMapping(value = "/showMaterias/save", method = RequestMethod.POST)
	public String registrar(@ModelAttribute("mate") Materias materia, Model model, RedirectAttributes ra) {
		int x = materia.getIdMateria();
		System.out.println(x);

		gd.saveOrUpdate(materia);
		ra.addFlashAttribute("mensaje", "Se han guardado los cambios");

		return "redirect:/showMaterias";
	}

	@RequestMapping("/showMaterias/{idMateria}/update")
	public String findMateriaUpdate(Model model, @PathVariable("idMateria") int id) {

		Materias materia = gd.findById(id);
		List<Materias> matList = gd.findAll();
		model.addAttribute("mensaje", "Materia Lista para Actualizar");
		model.addAttribute("lista", matList);
		model.addAttribute("mate", materia);
		return "showMaterias";
	}

	@RequestMapping("/showMaterias/{idMateria}/delete")
	public String deleteAdmin(@PathVariable("idMateria") int id, RedirectAttributes ra) {
		gd.delete(id);
		ra.addFlashAttribute("mensaje", "Exito al Eliminar");
		return "redirect:/showMaterias";
	}

}
