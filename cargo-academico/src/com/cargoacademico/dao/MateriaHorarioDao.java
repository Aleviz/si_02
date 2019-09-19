package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.MateriaHorario;

public interface MateriaHorarioDao {

	public MateriaHorario saveMateriaHorario(MateriaHorario materiaHorario);

	public MateriaHorario updateMateriaHorario(MateriaHorario materiaHorario);

	public List<MateriaHorario> findAllMateriaHorario();

	public MateriaHorario findByIdMateriaHorario(int id);

	public void deleteMateriaHorario(int id);
}
