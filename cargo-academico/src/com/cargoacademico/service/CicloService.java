package com.cargoacademico.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.CicloDao;
import com.cargoacademico.model.Ciclo;

@Service
public class CicloService {
	
	@Autowired
	private CicloDao ciDao;
	
	public void saveCiclo(Ciclo ci) {
		ciDao.saveCiclo(ci);
	}
	
	public List<Ciclo> findAll(){
		return ciDao.encontrarCiclo();
	}
	
	public Ciclo findByIdCiclo(int id) {
		return ciDao.findByIdCiclo(id);
	}
	
	public void saveOrUpdateCiclo(Ciclo ci) {
		if(ci.getIdCiclo()==0) {
			ciDao.saveCiclo(ci);
		}else {
			ciDao.updateCiclo(ci);
		}
	}

	public void delete(int idCiclo) {
		Ciclo ci = ciDao.findByIdCiclo(idCiclo);
		ciDao.deleteCiclo(ci);
	}
	
}
