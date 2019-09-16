package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.TipoDocenteDao;
import com.cargoacademico.model.TipoDocente;

@Service
public class TipoDocenteService {

	@Autowired
	private TipoDocenteDao tipoDao;

	public TipoDocente saveTipoDocente(TipoDocente tipoDocente) {
		return tipoDao.saveTipoDocente(tipoDocente);
	}

	public TipoDocente updateTipoDocente(TipoDocente tipoDocente) {
		return tipoDao.updateTipoDocente(tipoDocente);
	}

	public TipoDocente findByIdTipoDocente(int id) {
		return tipoDao.findByIdTipoDocente(id);
	}

	public List<TipoDocente> findAllTipoDocente() {
		return tipoDao.findAllTipoDocente();
	}

	public void deleteTipoDocente(int id) {
		tipoDao.deleteTipoDocente(id);
	}
}
