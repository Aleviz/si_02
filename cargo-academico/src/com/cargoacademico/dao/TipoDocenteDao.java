package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.TipoDocentes;

public interface TipoDocenteDao {

	public TipoDocentes saveTipoDocente(TipoDocentes tipoDocente);

	public TipoDocentes updateTipoDocente(TipoDocentes tipoDocente);

	public TipoDocentes findByIdTipoDocente(int id);

	public List<TipoDocentes> findAllTipoDocente();

	public void deleteTipoDocente(int id);
}
