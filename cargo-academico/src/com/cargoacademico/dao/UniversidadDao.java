package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Universidad;

public interface UniversidadDao {
	public List<Universidad> encontrarTodo();
	public void save(Universidad uni);
	public Universidad findById(int idUniversidad);
	public void update(Universidad uni);
	public void delete(Universidad uni);
	
}

