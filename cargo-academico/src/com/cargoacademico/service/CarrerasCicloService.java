package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.CarrerasCicloDao;
import com.cargoacademico.model.CarrerasCiclo;

@Service
public class CarrerasCicloService {

	
	@Autowired
	private CarrerasCicloDao carreraCicloDao;
	
	
	public void saveCarrerasCiclo(CarrerasCiclo caCi) {
		carreraCicloDao.saveCarrerasCiclo(caCi);
	}
	
	public List<CarrerasCiclo> findAll(){
		return carreraCicloDao.encontrarCarrerasCiclo();
		
	}
	
	public CarrerasCiclo findByIdCarrerasCiclo(int id) {
		return carreraCicloDao.findByIdCarrerasCiclo(id);
	}
	
	public void saveOrUpateCarrerasCiclo(CarrerasCiclo caCi) {
		if(caCi.getIdCarreraCiclo()== 0) {
			
		}else {
			carreraCicloDao.updateCarrerasCiclo(caCi);
		}
	}
	
	public void delete(int idCarrerasCiclo) {
		CarrerasCiclo caCi = carreraCicloDao.findByIdCarrerasCiclo(idCarrerasCiclo);
		carreraCicloDao.deleteCarrerasCiclo(caCi);
	}
	
	
}
