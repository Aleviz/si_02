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

import com.cargoacademico.model.AlumnoMateria;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class AlumnoMateriaImpl implements AlumnoMateriaDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public AlumnoMateria findByIAlumnoMateria(int id) {
		Criteria crit = getSession().createCriteria(AlumnoMateria.class);
		crit.add(Restrictions.eq("idAlumnoMateria",id));
		return (AlumnoMateria) crit.uniqueResult();
		
	}
	
	@Override
	public void deleteAlumnoMateria(AlumnoMateria aluma) {
		getSession().delete(aluma);
	}
	@Override
	public void updateAlumnoMateria(AlumnoMateria aluma) {
		getSession().delete(aluma);
	}
	@Override
	public List<AlumnoMateria> encontrarAlumnoMateria(){
		Query query = getSession().createQuery("from AlumnoMateria");
		return query.list();
	}


	@Override
	public void saveAlumnoMateria(AlumnoMateria aluma) {
		getSession().save(aluma);
		
	}
	
}
