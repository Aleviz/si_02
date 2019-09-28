package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.TipoDocente;

public interface TipoDocenteDao {

	public TipoDocente saveTipoDocente(TipoDocente tipoDocente);

	public TipoDocente updateTipoDocente(TipoDocente tipoDocente);

	public TipoDocente findByIdTipoDocente(int id);

	public List<TipoDocente> findAllTipoDocente();

	public void deleteTipoDocente(int id);
}
