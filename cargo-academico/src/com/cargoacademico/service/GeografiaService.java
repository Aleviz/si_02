package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.dao.GeografiaDao;
import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.Facultad;;

@Service
@Transactional
public class GeografiaService {

	@Autowired
	private GeografiaDao geografiaDao;

	
	
	// COORDENADAS

	public void saveCoordenadas(Coordenadas coordenadas) {
		geografiaDao.saveCoordenadas(coordenadas);
	}

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

	public List<Facultad> findByNameF(String name) {
		System.out.println("hola  "+name);
		return geografiaDao.findByNameF(name);
	}
	
	public Facultad findByIdF(int id) {
		return geografiaDao.findByIdF(id);
	}
	
	
	public List<Facultad> findByCampus(int idCampus){
		return geografiaDao.findByCampus(idCampus);
	}
	
	
	public List<Empleado> buscarDecano(){
		return geografiaDao.buscarDecano() ;
	}
	

	public void saveOrUpdateFacultad(Facultad facultad) {
		System.out.println("XXXXX   "+ facultad.getIdFacultad());
		if ( facultad.getIdFacultad() == 0 ) {
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

	public Campus findByIdCp(String nameCampus) {
		return geografiaDao.findByNameCp(nameCampus);
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
