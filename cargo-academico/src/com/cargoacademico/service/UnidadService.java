package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.UnidadDao;
import com.cargoacademico.model.Unidad;

@Service
public class UnidadService {

	@Autowired
	private UnidadDao unidadDao;
	
	public Unidad saveUnidad(Unidad unidad) {
		return unidadDao.saveUnidad(unidad);
	}
	
	public Unidad updateUnidad(Unidad unidad) {
		return unidadDao.updateUnidad(unidad);
	}
	
	public Unidad finByIdUnidad(int id) {
		return unidadDao.findByIdUnidad(id);
	}
	
	public List<Unidad> findAllUnidad(){
		return unidadDao.findAllUnidad();
	}
	
	public void deleteUnidad(int id) {
		unidadDao.deleteUnidad(id);
	}
}
