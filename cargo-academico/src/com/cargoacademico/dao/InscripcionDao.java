package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Inscripcion;

public interface InscripcionDao {
	public Inscripcion saveInscripcion(Inscripcion inscripcion);

	public List<Inscripcion> findAllInscripcion();

	public Inscripcion findByIdInscripcion(int id);

	public Inscripcion updateInscripcion(Inscripcion inscripcion);

	public void deleteInscripcion(int id);
}
