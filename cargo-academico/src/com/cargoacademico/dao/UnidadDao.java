package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Unidad;

public interface UnidadDao {

	public Unidad saveUnidad(Unidad unidad);

	public Unidad updateUnidad(Unidad unidad);

	public Unidad findByIdUnidad(int id);

	public List<Unidad> findAllUnidad();

	public void deleteUnidad(int id);
}
