package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EmpleadoMateriaDao;
import com.cargoacademico.model.EmpleadoMateria;
@Service
public class EmpleadoMateriaService {

	@Autowired
	private EmpleadoMateriaDao empleadoMateriaDao;

	public EmpleadoMateria saveEmpleadoMateria(EmpleadoMateria empleadoMateria) {
		return empleadoMateriaDao.saveEmpleadoMateria(empleadoMateria);
	}

	public EmpleadoMateria updateEmpleadoMateria(EmpleadoMateria empleadoMateria) {
		return empleadoMateriaDao.updateEmpleadoMateria(empleadoMateria);
	}

	public List<EmpleadoMateria> findAllEmpleadoMateria() {
		return empleadoMateriaDao.findAllEmpleadoMateria();
	}

	public EmpleadoMateria findByIdEmpleadoMateria(int id) {
		return empleadoMateriaDao.findByIdEmpleadoMateria(id);
	}

	public void deleteEmpleadoMateria(int id) {
		empleadoMateriaDao.deleteEmpleadoMateria(id);
	}
}
