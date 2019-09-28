package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.AulaEmpleado;
public interface AulaEmpleadoDao {

	public List<AulaEmpleado> encontrarAulaEmpleado();
	
	public void saveAulaEmpleado(AulaEmpleado auem);
	public AulaEmpleado findByIdAulaEmpleado(int id);
	
	public void updateAulaEmpleado(AulaEmpleado auem);
	public void deleteAulaEmpleado(AulaEmpleado auem);
	
}
