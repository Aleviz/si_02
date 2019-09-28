package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Universidad;

public interface UniversidadDao {
	public List<Universidad> encontrarTodo();
	public void saveUniversidad(Universidad uni);
	public Universidad findByIdUniversidad(int id);
	public void updateUniversidad(Universidad uni);

	public void deleteUniversidad(int id);

	
}

