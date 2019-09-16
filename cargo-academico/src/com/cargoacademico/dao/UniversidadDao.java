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
