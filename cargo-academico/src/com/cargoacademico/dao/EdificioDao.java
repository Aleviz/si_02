package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Edificio;

public interface EdificioDao {

	public List<Edificio> encontrarEdificio();
	
	public void saveEdificio(Edificio edi);
	public Edificio findByIdEdificio(int id);
	
	public void updateEdificio(Edificio edi);
	public void deleteEdificio (Edificio edi);
	
}
