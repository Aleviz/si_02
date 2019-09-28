package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.AlumnoDao;
import com.cargoacademico.model.Alumno;

@Service
public class AlumnoService {
	@Autowired
	private AlumnoDao alumnoDao;
	
	
	public void saveAlumno(Alumno alu) {
		alumnoDao.saveAlumno(alu);
	}
	
	public  List<Alumno> findAll(){
		return alumnoDao.encontrarAlumnos();
	}
	
	public Alumno findByIdAlu(int id) {
		return alumnoDao.findByIdAlu(id);
	}
	
	public void saveOrUpdateAlumno(Alumno alu) {
		if(alu.getIdAlumno()== 0) {
			alumnoDao.saveAlumno(alu);
		}else {
			alumnoDao.updateAlumno(alu);
		}
	}
	
	public void delete(int idAlumno) {
		Alumno al = alumnoDao.findByIdAlu(idAlumno);
		alumnoDao.deleteAlumno(al);
	}
	
	
}
