package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Actividades;

public interface ActividadesDao {

	public List<Actividades> encontrarActividades();
	
	public void saveActividades (Actividades acti);
	public Actividades findByIdActi(int id);
	
	public void updateActividades(Actividades acti);
	public void deleteActividades(Actividades acti);
	
	
}
