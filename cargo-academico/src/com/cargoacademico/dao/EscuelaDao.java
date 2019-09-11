package com.cargoacademico.dao;

import java.util.List;
import com.cargoacademico.model.Escuela;

public interface EscuelaDao {

	public List<Escuela> encontrarTodo();
	
	public void save(Escuela escu);
	public Escuela findById(int id);
	
	public void update(Escuela escu);
	public void delete(Escuela escu);

}
