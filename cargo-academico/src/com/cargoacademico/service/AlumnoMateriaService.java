package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.AlumnoMateriaDao;
import com.cargoacademico.model.AlumnoMateria;

@Service
public class AlumnoMateriaService {

	@Autowired
	private AlumnoMateriaDao alumnoMateriaDao;
	
	
	public void saveAlumnoMateria(AlumnoMateria aluma) {
		alumnoMateriaDao.saveAlumnoMateria(aluma);
	}
	
	public List<AlumnoMateria> findAll(){
		return alumnoMateriaDao.encontrarAlumnoMateria();
	}
	
	public AlumnoMateria findByIAlumnoMateria(int id) {
		return alumnoMateriaDao.findByIAlumnoMateria(id);
	}
	
	
	public void saveOrUpdateAlumnoMateria(AlumnoMateria aluma) {
		if(aluma.getIdAlumnoMateria()== null) {
			alumnoMateriaDao.saveAlumnoMateria(aluma);
		}else {
			alumnoMateriaDao.updateAlumnoMateria(aluma);
		}
	}
	
	public void delete (int idAlumnoMateria) {
		AlumnoMateria aluma = alumnoMateriaDao.findByIAlumnoMateria(idAlumnoMateria);
		alumnoMateriaDao.deleteAlumnoMateria(aluma);
	}
	
}
