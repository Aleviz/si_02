package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.EscuelaDao;
import com.cargoacademico.model.Escuela;

@Service
public class EscuelaService {

	@Autowired
	private EscuelaDao gd;
	public void save(Escuela escu) {
		gd.save(escu);
	}
	public List<Escuela> findAll(){
		return gd.encontrarTodo();
	}
	public Escuela findById(int id){
		return gd.findById(id);
	}
	public void saveOrUpdate(Escuela escu) {
		int x = escu.getIdEscuela();
		System.out.println(escu.getIdEscuela());
		if(x == 0) {
			gd.save(escu);
		}else {
			gd.update(escu);
		}
	}
	
	public void delete(int idEscuela) {
		Escuela escu = gd.findById(idEscuela);
		gd.delete(escu);
	}	
	
}