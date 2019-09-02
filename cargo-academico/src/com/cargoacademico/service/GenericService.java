package com.cargoacademico.service;

import java.sql.Timestamp;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cargoacademico.dao.MateriasDao;
import com.cargoacademico.model.Materias;


@Service
public class GenericService {

	@Autowired
	private MateriasDao gd;
	
	public void save(Materias mate) {

		gd.save(mate);
	}

	public List<Materias> findAll() {
		return gd.encontrarTodo();
	}

	public Materias findById(int id) {
		return gd.findById(id);
	}

	public void saveOrUpdate(Materias mate) {
		int x = mate.getIdMateria();
		System.out.println(mate.getIdMateria());
		if (x == 0) {
			// Insert
			
			gd.save(mate);
		} else {
			// Update
			gd.update(mate);
		}
	}

	public void delete(int idMateria) {
		Materias mate = gd.findById(idMateria);
		gd.delete(mate);
	}
	
	
//	public Materias saveOrUpdate(Materias obj) {
//		return gd.saveOrUpdate(obj);
//	}
//	
//	public List<Materias> findAll(){
//		return gd.encontrarTodo();
//	}
//	
//	public Materias findById(int id) {
//		return (Materias) gd.findById(id);
//	}
//	
//
//	
//	public void delete (int id) {
//		gd.delete(id);
//	}
//	
	
}
