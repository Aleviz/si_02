package com.cargoacademico.dao;

import java.util.List;
import com.cargoacademico.model.Escuela;

public interface EscuelaDao {

	public List<Escuela> encontrarTodo();
	
	public void saveEscuela(Escuela escu);
	public Escuela findById(int id);
	
	public void updateEscuela(Escuela escu);
	public void deleteEscuela(Escuela escu);

	
	
	
	
}