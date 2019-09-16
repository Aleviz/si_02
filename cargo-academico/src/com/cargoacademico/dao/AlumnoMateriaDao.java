package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.AlumnoMateria;

public interface AlumnoMateriaDao {
	
	public List<AlumnoMateria> encontrarAlumnoMateria();
	
	public void saveAlumnoMateria (AlumnoMateria aluma);
	public AlumnoMateria findByIAlumnoMateria(int id);
	
	public void updateAlumnoMateria(AlumnoMateria aluma);
	public void deleteAlumnoMateria(AlumnoMateria aluma);
	
	
	
}
