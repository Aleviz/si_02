package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EdificioDao;
import com.cargoacademico.model.Edificio;

@Service
public class EdificioServices {
	
	@Autowired
	private EdificioDao edif;
	
	public void save(Edificio edi) {
		edif.saveEdificio(edi);
	}
	
	public List<Edificio> findAll(){
		return edif.encontrarEdificio();
	}
	
	public Edificio findById(int idEdificio){
		return edif.findByIdEdificio(idEdificio);
	}
	
	public void saveOrUpdate(Edificio edi) {
		int x = edi.getIdEdificio();
		System.out.println(edi.getIdEdificio());
		if(x == 0) {
			edif.saveEdificio(edi);
		}else {
			edif.updateEdificio(edi);
		}
	}
	
	public void delete(int idEdificio) {
		Edificio edi = edif.findByIdEdificio(idEdificio);
		edif.deleteEdificio(edi);
	}
}
