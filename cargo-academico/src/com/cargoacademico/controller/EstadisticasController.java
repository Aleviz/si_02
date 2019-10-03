package com.cargoacademico.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cargoacademico.model.Alumno;
import com.cargoacademico.model.Escuela;
import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;
import com.cargoacademico.model.Unidad;
import com.cargoacademico.model.Usuarios;
import com.cargoacademico.service.EscuelaService;
import com.cargoacademico.service.TemarioService;
import com.cargoacademico.service.UnidadService;
import com.cargoacademico.service.UsuariosService;

@Controller
public class EstadisticasController {

	@Autowired
	private EscuelaService serviceEscuela;
	@Autowired
	private UsuariosService usuarioService;
	@Autowired
	private TemarioService serviceTemario;
	@Autowired
	private UnidadService unidadService;
	private List<Usuarios> listUsuarios;
	private List<MateriaCarreraCiclo> listMateriaCiclo;
	private List<Temario> listTemario;
	private List<Materias> listMaterias;
	private List<Unidad> listUnidades;
	private Materias m;
	private Usuarios usuario;
	private ModelAndView modal = new ModelAndView();
    private List<Escuela> listEscuelas;
	
	@RequestMapping(value = "/estadisticas")
	public String showMaterias(Model model, @ModelAttribute("mensaje") String mensaje) {
		System.out.println("holaaaaaa");
		listEscuelas = serviceEscuela.findAll();
		listMateriaCiclo = new ArrayList<MateriaCarreraCiclo>();
		listMaterias = new ArrayList<Materias>();
		listMaterias = serviceTemario.findAllMaterias();
		listTemario = serviceTemario.findAllTemario();
		System.out.println("Aqui Spring hace mi cosulta de unidades");

		listUnidades = unidadService.findAllUnidad();
		model.addAttribute("listEscuelas", listEscuelas);
		model.addAttribute("listUnidades", listUnidades);
		model.addAttribute("listMateSiclo", listMateriaCiclo);
		model.addAttribute("listMateriaCarrera", listMateriaCiclo);
		model.addAttribute("listTemario", listTemario);
		model.addAttribute("listMaterias", listMaterias);
		return "estadisticas";
	}

	@RequestMapping(value = "/index/login", method = RequestMethod.POST)
	public String loginUsuario(Model model, @ModelAttribute("usuario") Usuarios usuarioLogin,
			@ModelAttribute("userName") String username, @ModelAttribute("pass") String pass, RedirectAttributes ra) {
		String url = null;
		String mensaje = null;
		System.out.println(usuarioLogin.getUsername());
		System.out.println(usuarioLogin.getPass());
		try {
			listUsuarios = new ArrayList<Usuarios>();
			listUsuarios = usuarioService.loguearUsuario(usuarioLogin);
			System.out.println(listUsuarios.size());
			if (listUsuarios.size() > 0) {
				url = "redirect:/Home";
				ra.addFlashAttribute("mensaje", "Exito");
			} else {
				url = "redirect:/";
				ra.addFlashAttribute("mensaje", "Error");
			}
		} catch (Exception e) {
			e.printStackTrace();
			url = "redirect:/";
		}
		return url;
	}

	@RequestMapping(value = "/unidades", method = RequestMethod.GET)
	public ModelAndView listUnidades() {
		System.out.println("Aqui spring hace lo mismo pero con ajax");
		listUnidades = unidadService.findAllUnidad();
		modal.addObject("listUnidades", listUnidades);
		return modal;
	}

	@RequestMapping(value = "/xd")
	public String xd() {
		return "xd";
	}

}
