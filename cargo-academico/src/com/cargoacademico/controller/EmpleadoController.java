package com.cargoacademico.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cargoacademico.dao.EmpleadoDao;
import com.cargoacademico.model.Empleado;
import com.cargoacademico.service.EmpleadoService;


@Controller
public class EmpleadoController {
	
	@Autowired
	private EmpleadoService ed;
	
	@RequestMapping("/showEmpleados")
	public String showEmpleados(Model model,
			@ModelAttribute("mensaje") String mensaje) {
		List<Empleado> empList = ed.findAll();
		Empleado empleado = new Empleado();
		
		model.addAttribute("empl", empleado);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("lista", empList);
		
		return "showEmpleados";
	}
	

	public String reporteempleado(Model model,
			@ModelAttribute("mensaje") String mensaje) {
		List<Empleado> empList = ed.findAll();
		Empleado empleado = new Empleado();
		
		model.addAttribute("empl", empleado);
		model.addAttribute("mensaje", mensaje);
		model.addAttribute("lista", empList);
		
		return "showEmpleados";
	}
	
	@RequestMapping("/showEmpleados/{idEmpleado}")
	public String findEmpleado(
				Model model, @PathVariable("idEmpleado") int idEmpleado) {
		Empleado empleado = ed.findByIdEmpleado(idEmpleado);
		List<Empleado> empList = ed.findAll();
		model.addAttribute("mesnaje","Empleado listo para Actualizar");
		model.addAttribute("lista", empList);
		model.addAttribute("empl", empleado);
		
		return "showEmpleado";
	}
	
	@RequestMapping(value = "/showEmpleados/save", method=RequestMethod.POST)
	public String registrar(@ModelAttribute("emp") Empleado empleado, Model model, RedirectAttributes ra) {
		int x = empleado.getIdEmpleado();
		System.out.println(x);
		ed.saveOrUpdateEmpleado(empleado);
		ra.addFlashAttribute("mensaje", "se han guardado los cambios");
		return "redirect:/showEmpleados";
	}
	
	@RequestMapping("/showEmpleados/{idEmpleado}/update")
	public String findEmpleadoUpdate (  Model model, @PathVariable("idEmpleado") int idEmpleado) {
		Empleado empleado = ed.findByIdEmpleado(idEmpleado);
		List<Empleado> empList = ed.findAll();
		model.addAttribute("mensaje", "materia lista para actualizar");
		model.addAttribute("lista", empList);
		model.addAttribute("empleado", empleado);
		return "showEmpleados";
	}
	
	@RequestMapping(value = "/showEmpleados/{idEmpleado}/delete")
	public String deleteAdmin(@PathVariable("idEmpleado") int idEmpleado, RedirectAttributes ra) {
		ed.delete(idEmpleado);
		ra.addFlashAttribute("mensaje", "Exito al eliminar");
		return "redirect:/showEmpleados";
	}
	
}
