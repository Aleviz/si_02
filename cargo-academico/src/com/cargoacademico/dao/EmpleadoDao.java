package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.EmpleadoMateria;
import com.cargoacademico.model.TipoDocente;

public interface EmpleadoDao {
	
	/*------------------------------------------inicio de metodo empleado------------------------------------------------------*/
	public List<Empleado> encontrarTodoE();
	
	public Empleado findEById(int idEmpleado);
	
	public void save(Empleado emp);
	
	public void update(Empleado emp);
	
	public void delete(Empleado emp);
	
	/*------------------------------------------fin de metodo empleado-----------------------------------------------------*/
	
	
	/*------------------------------------------inicio de metodo tipo_docente------------------------------------------------------*/

	public List<TipoDocente> encontrarTodoTD();
	public TipoDocente findTDById(int id_tipo_docente);
	
	/*------------------------------------------fin de metodo tipo_docente-----------------------------------------------------*/
	
	
	/*------------------------------------------inicio de metodo empleado_Materia------------------------------------------------------*/

	public List<EmpleadoMateria> encontrarTodoEM();
	public EmpleadoMateria findEMById(int id_emp_mate);
	
	/*-------------------------------------------fin de metodo empleado_Materia-----------------------------------------------------*/
	
}
