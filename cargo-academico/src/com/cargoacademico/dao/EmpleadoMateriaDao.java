package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.EmpleadoMateria;

public interface EmpleadoMateriaDao {

	public EmpleadoMateria saveEmpleadoMateria(EmpleadoMateria empleadoMateria);

	public List<EmpleadoMateria> findAllEmpleadoMateria();

	public EmpleadoMateria findByIdEmpleadoMateria(int id);

	public EmpleadoMateria updateEmpleadoMateria(EmpleadoMateria empleadoMateria);

	public void deleteEmpleadoMateria(int id);

}
