package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Facultad;
public interface GeografiaDao {

	
	//DAO COORDENADAS
	public void saveCoordenadas(Coordenadas coordenadas);
	public List<Coordenadas> allCoordenadas();
	public Coordenadas findByIdC(int id);

	
	
	
	//DAO FACULTAD
	public void saveFacultad(Facultad facultad);
	public List<Facultad> allFacultad();
	public  List<Facultad>  findByNameF(String name);
	public Facultad findByIdF(int id);
	public void updateFacultad(Facultad facultad);
	public List<Facultad> findByCampus(int idCampus);
	
	
	//DAO CAMPUS
	public void saveCampus(Campus campus);
	public List<Campus> allCampus();
	public Campus findByNameCp(String nameCampus);
	public void updateCampus(Campus campus);
	
	
	
}
