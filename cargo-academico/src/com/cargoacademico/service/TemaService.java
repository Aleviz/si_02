package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.TemaDao;
import com.cargoacademico.model.Tema;

@Service
public class TemaService {

	@Autowired
	private TemaDao temaDao;

	public Tema saveTema(Tema tema) {
		return temaDao.saveTema(tema);
	}

	public List<Tema> findAllTema() {
		return temaDao.findAllTema();
	}

	public Tema findByidTema(int id) {
		return temaDao.findByIdTema(id);
	}

	public Tema updateTema(Tema tema) {
		return temaDao.updateTema(tema);
	}

	public void delete(int id) {
		temaDao.deleteTema(id);
	}
}
