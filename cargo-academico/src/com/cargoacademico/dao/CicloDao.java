package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Ciclo;

public interface CicloDao {

	public List<Ciclo> encontrarCiclo();
	
	public void saveCiclo(Ciclo ci);
	public Ciclo findByIdCiclo(int id);
	
	
	public void updateCiclo(Ciclo ci);
	public void deleteCiclo(Ciclo ci);
	
	
}
