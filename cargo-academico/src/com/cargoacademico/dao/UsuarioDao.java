package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Usuarios;

public interface UsuarioDao {

	public Usuarios insertUsuario(Usuarios usuario);

	public Usuarios updateUsuario(Usuarios usuario);

	public Usuarios findByidUsuario(int id);

	public List<Usuarios> findAllUsuarios();

	public void deleteUsuario(int id);
	
	public List<Usuarios> loguearUsuario(Usuarios usuario);

}
