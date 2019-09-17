package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.MateriaCarreraCiclo;

public interface MateriaCarreraCicloDao {

	public MateriaCarreraCiclo saveMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo);

	public MateriaCarreraCiclo updateMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo);

	public MateriaCarreraCiclo findByIdMateriaCarreraCiclo(int id);

	public List<MateriaCarreraCiclo> findAllMateriaCarreraCiclo();

	public void deleteMateriaCarreraCiclo(int id);

}
