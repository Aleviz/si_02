package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.TemarioDao;
import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;

@Service
public class TemarioService {

	@Autowired
	private TemarioDao temarioDao;

	public List<MateriaCarreraCiclo> findAll() {
		return temarioDao.findAll();
	}

	public List<Temario> findAllTemario() {
		return temarioDao.findAllTemario();
	}

	public List<Materias> findAllMaterias() {
		return temarioDao.findAllMaterias();
	}

	public Temario saveTemario(Temario temario) {
		return temarioDao.saveTemario(temario);
	}

	public Temario updateTemario(Temario temario) {
		return temarioDao.saveTemario(temario);
	}

	public Temario findByIdTemario(int id) {
		return temarioDao.findByIdTemario(id);
	}

	public void deleteTemario(int id) {
		temarioDao.deleteTemario(id);
	}
}
