package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EscuelaDao;
import com.cargoacademico.model.Escuela;

@Service
public class EscuelaService {

	@Autowired
	private EscuelaDao escuelaDao;
	
	
	public void saveEscuela(Escuela escu) {
		escuelaDao.saveEscuela(escu);
	}
	
	public List<Escuela> findAll(){
		return escuelaDao.encontrarTodo();
	}
	public Escuela findById(int id){
		return escuelaDao.findById(id);
	}
	public void saveOrUpdateEscuela(Escuela escu) {
		if(escu.getIdEscuela() == null) {
			escuelaDao.saveEscuela(escu);
		}else {
			escuelaDao.updateEscuela(escu);
		}
	}
	
	public void delete(int idEscuela) {
		Escuela es = escuelaDao.findById(idEscuela);
		escuelaDao.deleteEscuela(es);
	}	
	
}