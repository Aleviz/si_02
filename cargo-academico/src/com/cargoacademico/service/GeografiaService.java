package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.GeografiaDao;
import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Facultad;;

@Service
public class GeografiaService {

	@Autowired
	private GeografiaDao geografiaDao;

	
	
	// COORDENADAS


	public List<Coordenadas> allCoordenadas() {
		return geografiaDao.allCoordenadas();
	}

	public Coordenadas findByIdC(int id) {
		return geografiaDao.findByIdC(id);
	}



	
	
	// FACULTAD
	public void saveFacultad(Facultad facultad) {
		geografiaDao.saveFacultad(facultad);
	}

	public List<Facultad> allFacultad() {
		return geografiaDao.allFacultad();
	}

	public Facultad findByIdF(int id) {
		return geografiaDao.findByIdF(id);
	}

	public void saveOrUpdateFacultad(Facultad facultad) {
		int x = facultad.getIdFacultad();
		if (x == 0) {
			geografiaDao.saveFacultad(facultad);
		} else {
			geografiaDao.updateFacultad(facultad);
		}
	}
	
	

	// CAMPUS
	public void saveCampus(Campus campus) {
		geografiaDao.saveCampus(campus);
	}

	public List<Campus> allCampus() {
		return geografiaDao.allCampus();
	}

	public Campus findByIdCp(int id) {
		return geografiaDao.findByIdCp(id);
	}

	public void saveOrUpdateCampus(Campus campus) {
		int x = campus.getIdCampus();
		if (x == 0) {
			geografiaDao.saveCampus(campus);
		} else {
			geografiaDao.updateCampus(campus);
		}
	}

}
