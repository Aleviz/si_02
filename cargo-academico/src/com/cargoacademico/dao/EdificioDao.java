package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Edificio;

public interface EdificioDao {
	public List<Edificio> encontrarTodo();
	
	public void save(Edificio edi);
	
	public Edificio findById(int idEdificio);
	
	public void update(Edificio edi);
	
	public void delete(Edificio edi);
	
}
