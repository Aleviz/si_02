package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.MateriaCarreraCicloDao;
import com.cargoacademico.model.MateriaCarreraCiclo;

@Service
public class MateriaCarreraCicloService {

	@Autowired
	private MateriaCarreraCicloDao materiaCarreraCicloDao;

	public MateriaCarreraCiclo saveMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
		return materiaCarreraCicloDao.saveMateriaCarreraCiclo(materiaCarreraCiclo);
	}

	public MateriaCarreraCiclo updateMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
		return materiaCarreraCicloDao.updateMateriaCarreraCiclo(materiaCarreraCiclo);
	}

	public List<MateriaCarreraCiclo> findAllMateriaCarreraCiclo() {
		return materiaCarreraCicloDao.findAllMateriaCarreraCiclo();
	}

	public MateriaCarreraCiclo findByIdMateriaCarreraCiclo(int id) {
		return materiaCarreraCicloDao.findByIdMateriaCarreraCiclo(id);
	}

	public void deleteMateriaCarreraCiclo(int id) {
		materiaCarreraCicloDao.deleteMateriaCarreraCiclo(id);
	}
}
