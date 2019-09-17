package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.TipoActividad;

public interface TipoActividadDao {

	public TipoActividad saveTipoActividad(TipoActividad tipoActividad);

	public TipoActividad updateTipoActividad(TipoActividad tipoActividad);

	public TipoActividad findByIdTipoActividad(int id);

	public List<TipoActividad> findAllTipoActividad();

	public void deleteTipoActividad(int id);
}
