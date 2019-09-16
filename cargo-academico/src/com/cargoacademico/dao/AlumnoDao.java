package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Alumno;

public interface AlumnoDao {
	
	public  List<Alumno> encontrarAlumnos();
	
	public void saveAlumno(Alumno alu);
	public Alumno findByIdAlu(int id);
	
	public void updateAlumno (Alumno alu);
	public void deleteAlumno (Alumno alu);


}
