package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.UniversidadDao;
import com.cargoacademico.model.Universidad;

@Service
public class UniversidadServices {
	
	@Autowired
	private UniversidadDao ud;
	
	public void save(Universidad uni) {
		ud.save(uni);
	}
	
	public List<Universidad> findAll(){
		return ud.encontrarTodo();
	}
	
	public Universidad findById(int idUniversidad){
		return ud.findById(idUniversidad);
		
	}
	
	public void saveOrUpdate(Universidad uni) {
		int x = uni.getIdUniversidad();
		System.out.println(uni.getIdUniversidad());
		if(x == 0) {
			ud.save(uni);
		}else {
			ud.update(uni);
		}
	}
	
	public void delete (int idUniversidad) {
		Universidad uni = ud.findById(idUniversidad);
		ud.delete(uni);
	}
	
}
