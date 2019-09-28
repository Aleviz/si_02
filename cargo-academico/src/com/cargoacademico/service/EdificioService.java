package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EdificioDao;
import com.cargoacademico.model.Edificio;

@Service
public class EdificioService {

	@Autowired
	private EdificioDao ediDao;
	
	public void saveEdificio(Edificio edi) {
		ediDao.saveEdificio(edi);
	}
	
	public List<Edificio> findAll(){
		return ediDao.encontrarEdificio();
	}
	
	public Edificio findByIdEdificio(int id) {
		return ediDao.findByIdEdificio(id);
	}
	
	public void saveOrUpdateEdificio(Edificio edi) {
		if(edi.getIdEdificio()==0) {
		}else {
			ediDao.updateEdificio(edi);
		}
	}
	
	public void delete(int idEdificio) {
		Edificio edi = ediDao.findByIdEdificio(idEdificio);
				ediDao.deleteEdificio(edi);
	}
	
}
