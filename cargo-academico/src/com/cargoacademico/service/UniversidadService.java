package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cargoacademico.dao.UniversidadDao;
import com.cargoacademico.model.Universidad;

@Repository
public class UniversidadService {

	@Autowired
	private UniversidadDao universidadDao;

	public Universidad saveUniversidad(Universidad universidad) {
		return universidadDao.saveUniversidad(universidad);
	}

	public Universidad updateUniversidad(Universidad universidad) {
		return universidadDao.updateUniversidad(universidad);
	}

	public Universidad findByIdUniversidad(int id) {
		return universidadDao.findByIdUniversidad(id);
	}

	public List<Universidad> findAllUniversidad() {
		return universidadDao.findAllUniversidad();
	}
	
	public void deleteUniversidad(int id) {
		universidadDao.deleteUniversidad(id);
	}
}
