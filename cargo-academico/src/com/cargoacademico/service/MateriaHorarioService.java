package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.MateriaHorarioDao;
import com.cargoacademico.model.MateriaHorario;

@Service
public class MateriaHorarioService {

	@Autowired
	private MateriaHorarioDao materiaHorarioDao;

	public MateriaHorario saveMateriaHorario(MateriaHorario materiaHorario) {
		return materiaHorarioDao.saveMateriaHorario(materiaHorario);
	}

	public List<MateriaHorario> findAllMateriaHorario() {
		return materiaHorarioDao.findAllMateriaHorario();
	}

	public MateriaHorario findByidMateriaHorario(int id) {
		return materiaHorarioDao.findByIdMateriaHorario(id);
	}

	public MateriaHorario updateMateriaHorario(MateriaHorario materiaHorario) {
		return materiaHorarioDao.updateMateriaHorario(materiaHorario);
	}

	public void delete(int id) {
		materiaHorarioDao.deleteMateriaHorario(id);
	}
}
