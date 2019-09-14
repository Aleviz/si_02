package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.InscripcionDao;
import com.cargoacademico.model.Inscripcion;

@Service
public class InscripcionService {

	@Autowired
	private InscripcionDao inscripcionDao;

	public Inscripcion saveInscripcion(Inscripcion inscripcion) {
		return inscripcionDao.saveInscripcion(inscripcion);
	}

	public List<Inscripcion> findAll() {
		return inscripcionDao.findAllInscripcion();
	}

	public Inscripcion findByidInscripcion(int id) {
		return inscripcionDao.findByIdInscripcion(id);
	}

	public Inscripcion updateInscripcion(Inscripcion inscripcion) {
		return inscripcionDao.updateInscripcion(inscripcion);
	}

	public void deleteInscripcion(int id) {
		inscripcionDao.deleteInscripcion(id);
	}
}
