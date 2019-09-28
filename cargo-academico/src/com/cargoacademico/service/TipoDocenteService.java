package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.TipoDocenteDao;
import com.cargoacademico.model.TipoDocentes;

@Service
public class TipoDocenteService {

	@Autowired
	private TipoDocenteDao tipoDao;

	public TipoDocentes saveTipoDocente(TipoDocentes tipoDocente) {
		return tipoDao.saveTipoDocente(tipoDocente);
	}

	public TipoDocentes updateTipoDocente(TipoDocentes tipoDocente) {
		return tipoDao.updateTipoDocente(tipoDocente);
	}

	public TipoDocentes findByIdTipoDocente(int id) {
		return tipoDao.findByIdTipoDocente(id);
	}

	public List<TipoDocentes> findAllTipoDocente() {
		return tipoDao.findAllTipoDocente();
	}

	public void deleteTipoDocente(int id) {
		tipoDao.deleteTipoDocente(id);
	}
}
