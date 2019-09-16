package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Tema;

public interface TemaDao {

	public Tema saveTema(Tema tema);

	public Tema updateTema(Tema tema);

	public List<Tema> findAllTema();

	public Tema findByIdTema(int id);

	public void deleteTema(int id);
}
