package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EmpleadoDao;
import com.cargoacademico.model.Empleado;

@Service
public class EmpleadoService {
	
	@Autowired
	private EmpleadoDao ed;
	
	public void save(Empleado emp) {
		ed.save(emp);
	}
	
	public List<Empleado> findAll(){
		return ed.encontrarTodoE();
	}
	
	public Empleado findEById(int id_empleado) {
		return ed.findEById(id_empleado);
	}
	
	public void saveOrUpdate (Empleado emp) {
		int x = emp.getIdEmpleado();
		System.out.println(emp.getIdEmpleado());
		if(x == 0) {
			ed.save(emp);
		}else {
			ed.update(emp);
		}
	}
	
	
	public void delete(int idEmpleado) {
		Empleado emp = ed.findEById(idEmpleado);
		ed.delete(emp);
	}
	
	
}
