package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.UsuarioDao;
import com.cargoacademico.model.Usuarios;

@Service
public class UsuariosService {

	@Autowired
	private UsuarioDao usuarioDao;

	public Usuarios insertUsuario(Usuarios usuario) {
		return usuarioDao.insertUsuario(usuario);
	}

	public Usuarios updateUsuario(Usuarios usuario) {
		return usuarioDao.updateUsuario(usuario);
	}

	public Usuarios findByidUsuario(int id) {
		return usuarioDao.findByidUsuario(id);
	}

	public void deleteUsuario(int id) {
		usuarioDao.deleteUsuario(id);
	}

	public List<Usuarios> findAllUsuarios() {
		return usuarioDao.findAllUsuarios();
	}

	public List<Usuarios> loguearUsuario(Usuarios usuario){
		return usuarioDao.loguearUsuario(usuario);
	}
}
