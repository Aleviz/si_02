package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.AulaDao;
import com.cargoacademico.model.Aula;

@Service
public class AulaService {
	
	@Autowired
	private AulaDao aulaDao;
	
	
	public void saveAula(Aula au) {
		aulaDao.saveAula(au);
	}

	public List<Aula> findAll(){
		return aulaDao.encontrarAula();
	}
	
	public Aula  findByIdAula(int id) {
		return aulaDao.findByIdAula(id);
	}
	
	public void saveOrUpdateAula(Aula au) {
		if(au.getIdAula()== null) {
			aulaDao.saveAula(au);
		}else {
			aulaDao.updateAula(au);
		}
	}
	
	public void delete(int idAula) {
		Aula au = aulaDao.findByIdAula(idAula);
		aulaDao.updateAula(au);
	}
	
}
