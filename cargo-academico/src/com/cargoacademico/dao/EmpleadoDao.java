package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Empleado;

public interface EmpleadoDao {
	
	public List<Empleado> encontrarEmpleado();
	
	public void saveEmpleado (Empleado emp);
	public Empleado findByIdEmpleado(int id);
	
	public void updateEmpleado(Empleado emp);
	public void deleteEmpleado(Empleado emp);
	
	
	

}
