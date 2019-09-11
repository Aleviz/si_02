package com.cargoacademico.controller;

import java.lang.ProcessBuilder.Redirect;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.cargoacademico.model.Roles;
import com.cargoacademico.model.Usuarios;
import com.cargoacademico.service.UsuarioRolService;

@Controller
public class UsuarioRolController {

	@Autowired
	private UsuarioRolService ursgdao;
	
	@RequestMapping ("/showUsuarioRol")
public String showUsuarioRol (Model model,
		@ModelAttribute("mensaje")String mensaje) {
		
		List<Usuarios> usuList = ursgdao.findByIdUsuario();
		Usuarios usu = new Usuarios();
		
		List<Roles> rolList = ursgdao.findByIdRoles();
		Roles rol = new Roles();
		Roles ro = ursgdao.findByIdRoles(2);
		
		model.addAttribute("usuList", usuList);
		model.addAttribute("usuarios", usu);
	
				
		model.addAttribute("rolList", rolList);
		model.addAttribute("rol", rol);
		model.addAttribute("ursgdao", ro );
	
		return "showUsuarioRol";
	}
	

	
	
	//************************************************************************usu**
	
	
	@RequestMapping(value = "/showUsuarioRol/save", method =  RequestMethod.POST)
	public String registrar(@ModelAttribute("usu")Usuarios usua ,Model model, RedirectAttributes ra) {
		int x = usua.getIdUsuario();
		System.out.println(x);
		ursgdao.saveOrUpdate(usua);
		ra.addFlashAttribute("mensaje","Se ha guardao los cambios");
		return "redirect:/showUsuarioRol";
		
	}
	
	@RequestMapping("/showUsuarioRol/{idUsuarios}/update")
	public String findUsuariosUpdate(Model model, @PathVariable("idUsuarios")int id) {
		Usuarios usuarios = ursgdao.findByIdUsuario(id);
		List<Usuarios>usuList = ursgdao.findByIdUsuario();
		model.addAttribute("mensaje",usuList);
		model.addAttribute("usariolist",usuarios);
		return "showUsuarioRol";
	}
	
	@RequestMapping("showUsuarioRol/{idUsuarios}/delete")
	public String deleteAdmin(@PathVariable("idUsuarios")int id, RedirectAttributes ra) {
		ursgdao.delete(id);
		ra.addFlashAttribute("mensaje", "Exito al Eliminar");
		return "redirect:/showUsuarioRol";
	}
	
	
	
	//**********************************************************************************rol**
	
	
	@RequestMapping(value = "/showUsuarioRol/save", method =  RequestMethod.POST)
	public String registrar(@ModelAttribute("rol")Roles role ,Model model, RedirectAttributes ra) {
		int x = role.getIdRol();
		System.out.println(x);
		ursgdao.saveOrUpdate(role);
		ra.addFlashAttribute("mensaje","Se ha guardao los cambios");
		return "redirect:/showUsuarioRol";
		
	}
	
	@RequestMapping("/showUsuarioRol/{idRoles}/update")
	public String findRolesUpdate(Model model, @PathVariable("idRoles")int id) {
		Roles roles = ursgdao.findByIdRoles(id);
		List<Roles>roList = ursgdao.findByIdRoles();
		model.addAttribute("mensaje",roList);
		model.addAttribute("usariolist",roles);
		return "showUsuarioRol";
	}
	
	@RequestMapping("/showUsuarioRol/{idRoles}/delete")
	public String delete1Admin(@PathVariable("idRoles") int id, RedirectAttributes ra) {
		ursgdao.delete1(id);
		ra.addFlashAttribute("mensaje", "Exito al Eliminar");
		return "redirect:/showUsuarioRol";
	}
		
	
	
	
	
	
	
	
	
	
}
