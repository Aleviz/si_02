package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.cargoacademico.dao.TipoActividadDao;
import com.cargoacademico.model.TipoActividad;

public class TipoActividadService {

	@Autowired
	private TipoActividadDao tipoActividadDao;

	public TipoActividad saveTipoActividad(TipoActividad tipoActividad) {
		return tipoActividadDao.saveTipoActividad(tipoActividad);
	}

	public TipoActividad updateTipoActividad(TipoActividad tipoActividad) {
		return tipoActividadDao.updateTipoActividad(tipoActividad);
	}

	public TipoActividad findByIdTipoActividad(int id) {
		return tipoActividadDao.findByIdTipoActividad(id);
	}

	public List<TipoActividad> findAllTipoActividad() {
		return tipoActividadDao.findAllTipoActividad();
	}

	public void deleteTipoActividad(int id) {
		tipoActividadDao.deleteTipoActividad(id);
	}
}
