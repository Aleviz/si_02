package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Departamento;

public interface DepartamentoDao {

	public List<Departamento> encontrarDepartamento();
	
	public void saveDepartamento(Departamento dep);
	public Departamento findByIdDepartamento(int id);
	
	public void updateDepartamento(Departamento dep);
	public void deleteDepartamento(Departamento dep);
	
	

}
