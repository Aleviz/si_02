package com.cargoacademico.dao;

import java.util.List;

import com.cargoacademico.model.CarrerasCiclo;

public interface  CarrerasCicloDao {

	public List<CarrerasCiclo> encontrarCarrerasCiclo();
	
	public void saveCarrerasCiclo(CarrerasCiclo caCi);
	public  CarrerasCiclo findByIdCarrerasCiclo(int id);
	
	public void updateCarrerasCiclo (CarrerasCiclo caCi);
	public void deleteCarrerasCiclo (CarrerasCiclo caCi);
	
	
	
}
