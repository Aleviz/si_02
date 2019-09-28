package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.DepartamentoDao;
import com.cargoacademico.model.Departamento;

@Service
public class DepartamentoService {

	@Autowired
	private DepartamentoDao deparDao;
	
	public void saveDepartamento(Departamento dep) {
		deparDao.saveDepartamento(dep);
	}
	
	public List<Departamento> findAll(){
		return deparDao.encontrarDepartamento();
	}
	public Departamento findByIdDepartamento(int id) {
		return deparDao.findByIdDepartamento(id);
	}
	
	public void saveOrUpdateDepartamento(Departamento dep) {
		if(dep.getIdDepartamento()==0) {
			deparDao.saveDepartamento(dep);
		}
	}
	
	public void delete(int idDepartamento) {
		Departamento dep = deparDao.findByIdDepartamento(idDepartamento);
		deparDao.deleteDepartamento(dep);
	}
	
	
}
