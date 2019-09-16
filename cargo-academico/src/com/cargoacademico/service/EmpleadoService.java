package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EmpleadoDao;
import com.cargoacademico.model.Empleado;


@Service
public class EmpleadoService {

	@Autowired
	private EmpleadoDao emplDao;
	
	public void saveEmpleado(Empleado emp) {
		emplDao.saveEmpleado(emp);
	}
	
	public List<Empleado> findAll(){
		return emplDao.encontrarEmpleado();
		
	}
	
	public Empleado findByIdEmpleado(int id) {
		return emplDao.findByIdEmpleado(id);
	}
	
	public void saveOrUpdateEmpleado(Empleado emp) {
		if(emp.getIdEmpleado()==null) {
			emplDao.saveEmpleado(emp);
		}else {
			emplDao.updateEmpleado(emp);
		}
	}
	
	public void delete(int idEmpleado) {
		Empleado emp = emplDao.findByIdEmpleado(idEmpleado);
		emplDao.deleteEmpleado(emp);
	}
	
}
