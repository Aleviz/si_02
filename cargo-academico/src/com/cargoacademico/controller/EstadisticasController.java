package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.MimeTypeUtils;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;
import com.cargoacademico.model.Unidad;
import com.cargoacademico.service.TemarioService;
import com.cargoacademico.service.UnidadService;

@Controller
public class EstadisticasController {

	@Autowired
	private TemarioService serviceTemario;
	@Autowired
	private UnidadService unidadService;
	private List<MateriaCarreraCiclo> listMateriaCiclo;
	private List<Temario> listTemario;
	private List<Materias> listMaterias;
	private List<Unidad> listUnidades;
	private Materias m;
	private ModelAndView modal = new ModelAndView();

	@RequestMapping(value = "/estadisticas")
	public String showMaterias(Model model, @ModelAttribute("mensaje") String mensaje) {
		System.out.println("holaaaaaa");
		listMateriaCiclo = new ArrayList<MateriaCarreraCiclo>();
		listMaterias = new ArrayList<Materias>();
		listMaterias = serviceTemario.findAllMaterias();
		listTemario = serviceTemario.findAllTemario();
//		System.out.println("Aqui Spring hace mi cosulta de unidades");
//
//		listUnidades = unidadService.findAllUnidad();
//		model.addAttribute("listUnidades", listUnidades);
		model.addAttribute("listMateSiclo", listMateriaCiclo);
		model.addAttribute("listMateriaCarrera", listMateriaCiclo);
		model.addAttribute("listTemario", listTemario);
		model.addAttribute("listMaterias", listMaterias);
		return "estadisticas";
	}

//	@RequestMapping(value = "/unidades", method = RequestMethod.GET)
//	public ModelAndView listUnidades() {
//		System.out.println("Aqui spring hace lo mismo pero con ajax");
//		listUnidades = unidadService.findAllUnidad();
//		modal.addObject("listUnidades", listUnidades);
//		return modal;
//	}

	@RequestMapping(value = "/unidades", method = RequestMethod.GET, produces = { MimeTypeUtils.APPLICATION_JSON_VALUE })
	public @ResponseBody ResponseEntity<List<Unidad>> consultUnidades() {
		try {
			listUnidades = unidadService.findAllUnidad();
			ResponseEntity<List<Unidad>> responseEntity = new ResponseEntity<List<Unidad>>(listUnidades, HttpStatus.OK);
			return responseEntity;
		} catch (Exception e) {
			return new ResponseEntity<List<Unidad>>(HttpStatus.BAD_REQUEST);
		}
	}

	@RequestMapping(value = "/xd")
	public String xd() {
		return "xd";
	}

}
