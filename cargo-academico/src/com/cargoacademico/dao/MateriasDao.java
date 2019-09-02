package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Materias;


public interface MateriasDao {
	
//	public Materias saveOrUpdate(Materias mat);
//	
	public List<Materias> encontrarTodo();
//	
//	public Materias findById(int id);
//	
//	
//	public void delete (int id);
	
	public void save(Materias mate);
	public Materias findById(int id);
	
	public void update(Materias mate);
	public void delete(Materias mate);	
	

}
