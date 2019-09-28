package com.cargoacademico.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cargoacademico.dao.AulaEmpleadoDao;
import com.cargoacademico.model.AulaEmpleado;

@Service
public class AulaEmpleadoService {
	
	@Autowired
	
	private AulaEmpleadoDao aulaEmpleadoDao;
	
	public void saveAulaEmpleado(AulaEmpleado auem) {
		aulaEmpleadoDao.saveAulaEmpleado(auem);
	}
	
	public List<AulaEmpleado> findAll(){
		return aulaEmpleadoDao.encontrarAulaEmpleado();
			
	}
	
	public AulaEmpleado findByIdAulaEmpleado(int id) {
		return aulaEmpleadoDao.findByIdAulaEmpleado(id);
	}
	
	
	public void saveOrUpdateAulaEmpleado(AulaEmpleado auem) {
		if(auem.getIdAulaEmpleado()== 0) {
			aulaEmpleadoDao.saveAulaEmpleado(auem);
		}else {
			aulaEmpleadoDao.updateAulaEmpleado(auem);
		}
	}
	public void delete (int idAulaEmpleado) {
		AulaEmpleado auemp = aulaEmpleadoDao.findByIdAulaEmpleado(idAulaEmpleado);
		aulaEmpleadoDao.deleteAulaEmpleado(auemp);
	}
	
	
	
	
}
