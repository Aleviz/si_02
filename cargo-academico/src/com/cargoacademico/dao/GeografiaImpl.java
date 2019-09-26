package com.cargoacademico.dao;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Facultad;



@SuppressWarnings("unchecked")
@Transactional
@Repository
public class GeografiaImpl implements GeografiaDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	// IMPL COORDENADAS

	@Override
	public void saveCoordenadas(Coordenadas coordenada) {
		getSession().save(coordenada);
	}
	
	@Override
	public List<Coordenadas> allCoordenadas() {	
		Query query = getSession().createQuery("from Coordenadas") ;
		return query.list();
	}
	
	@Override
	public Coordenadas findByIdC (int id) {
		Criteria crit = getSession().createCriteria(Coordenadas.class);
		crit.add(Restrictions.eq("idCoordenada", id));
		return (Coordenadas)crit.uniqueResult();
	}
	

	
	
	
	//IMPL FACULTAD
	@Override
	public void saveFacultad(Facultad facultad) {
		getSession().save(facultad);
	}

	@Override
	public List<Facultad> allFacultad() {
		Query query = getSession().createQuery("from Facultad");
		return query.list();
	}
	
	@Override
	public Facultad findByIdF (int id) {
		Criteria crit = getSession().createCriteria(Facultad.class);
		crit.add(Restrictions.eq("idFacultad", id));
		return (Facultad)crit.uniqueResult();
	}
	
	@Override
	public  List<Facultad>  findByNameF(String name) {
		Query query = getSession().createQuery("from Facultad where facultad ='"+name+"'");
		System.out.println("hola  "+name+" xxxxxx "+query.list().size());
		return query.list();
	}
	

	@Override
	public void updateFacultad(Facultad facultad) {
		getSession().update(facultad);
	}

	
	
	//IMPL CAMPUS
	@Override
	public void saveCampus(Campus campus) {
		getSession().save(campus);
	}

	@Override
	public List<Campus> allCampus() {
		Query query = getSession().createQuery("from Campus");
		return query.list();
	}
	
	@Override
	public Campus findByNameCp (String nameCampus) {
		Criteria crit = getSession().createCriteria(Campus.class);
		crit.add(Restrictions.eq("idCampus", nameCampus));
		return (Campus)crit.uniqueResult();
	}
	

	@Override
	public void updateCampus(Campus campus) {
		getSession().update(campus);
	}




}
