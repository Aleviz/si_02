package com.cargoacademico.dao;

import java.util.List;
import com.cargoacademico.model.Usuarios;
import com.cargoacademico.model.Roles;

public interface UsuarioRolDao {

	
	public List<Usuarios> encontrarUsuarios();
	public List<Roles> encontrarRoles();
	
	
	public void save(Usuarios usu );
	
	public void update(Usuarios usu );
	public void delete(Usuarios usu );
	
	
	public Usuarios  findByIdUsuario(int id);
	
    public void save(Roles rol);
	
	public void update(Roles rol);
	
	public void delete(Roles rol);
	
	public Roles findByIdRoles(int id);
	
	
}
