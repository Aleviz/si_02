package com.cargoacademico.dao;

import java.util.List;
import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;

public interface TemarioDao {

	public List<MateriaCarreraCiclo> findAll();

	public List<Temario> findAllTemario();

	public List<Materias> findAllMaterias();

	public Temario saveTemario(Temario temario);

	public Temario updateTemario(Temario temario);

	public Temario findByIdTemario(int id);

	public void deleteTemario(int id);

}
