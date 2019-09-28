package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Aula;

public interface AulaDao {

	
	public List<Aula> encontrarAula();
	
	public void saveAula(Aula au);
	public Aula findByIdAula(int id);
	
	public void updateAula(Aula au);
	public void deleteAula(Aula au);
	
	
}
