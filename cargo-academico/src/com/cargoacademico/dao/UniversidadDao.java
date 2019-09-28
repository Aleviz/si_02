package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Universidad;

public interface UniversidadDao {

	public Universidad saveUniversidad(Universidad universidad);
	
	public Universidad updateUniversidad(Universidad universidad);
	
	public Universidad findByIdUniversidad(int id);
	
	public List<Universidad> findAllUniversidad();
	
	public void deleteUniversidad(int id);
}
