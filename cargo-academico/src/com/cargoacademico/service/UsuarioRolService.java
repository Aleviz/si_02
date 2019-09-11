package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.UsuarioRolDao;
import com.cargoacademico.model.Roles;
import com.cargoacademico.model.Usuarios;

@Service
public class UsuarioRolService {

	@Autowired
	private UsuarioRolDao urogdao;

	
	
	//Ususarios
	public void saveUsuarios(Usuarios usu) {
		urogdao.save(usu);
	}

	public List<Usuarios> findByIdUsuario() {
		return urogdao.encontrarUsuarios();
	}

	public Usuarios findByIdUsuario(int id) {
		return urogdao.findByIdUsuario(id);

	}

	public void saveOrUpdate(Usuarios usu) {
		int x = usu.getIdUsuario();
		System.out.println(usu.getIdUsuario());
		if (x == 0) {
			urogdao.save(usu);
		}else {
			urogdao.update(usu);
		}
	}

	public void delete(int idUsuarios) {
		Usuarios usu = urogdao.findByIdUsuario(idUsuarios);
		urogdao.delete(usu);
	}

	//Roles
	
	
	public void save(Roles rol) {
		urogdao.save(rol);
	}
	
	public List <Roles> findByIdRoles() {
		return urogdao.encontrarRoles();
	}
	
	public Roles findByIdRoles(int id) {
		return urogdao.findByIdRoles(id);
		
	}

	public void saveOrUpdate(Roles rol) {
	int x = rol.getIdRol();
	System.out.println(rol.getIdRol());
	if(x == 0) {
		urogdao.save(rol);
	}else {
		urogdao.update(rol);
	}
}
public void delete1(int idRoles) {
	Roles rol = urogdao.findByIdRoles(idRoles);
	urogdao.delete(rol);
		
	}
}
	
