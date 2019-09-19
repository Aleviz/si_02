package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;
import com.cargoacademico.service.TemarioService;

@Controller
public class EstadisticasController {

	@Autowired
	private TemarioService servicetemario;
	private List<MateriaCarreraCiclo> listMateriaCiclo;
	private List<Temario> listTemario;
	private List<Materias> listMaterias;
	private Materias m;

	@RequestMapping(value = "/estadisticas")
	public String showMaterias(Model model, @ModelAttribute("mensaje") String mensaje) {
		System.out.println("holaaaaaa");
		listMateriaCiclo = new ArrayList<MateriaCarreraCiclo>();
		listMaterias = new ArrayList<Materias>();
		listMaterias = servicetemario.findAllMaterias();

		model.addAttribute("listMateriaCarrera", listMateriaCiclo);
		model.addAttribute("listTemario", listTemario);
		model.addAttribute("listMaterias", listMaterias);
		return "estadisticas";
	}
	
	public List<Materias> showMateriasList(List<Materias> listMaterias) {
		listMaterias = new ArrayList<Materias>();
		listMaterias = servicetemario.findAllMaterias();
		return listMaterias;
	}

}
