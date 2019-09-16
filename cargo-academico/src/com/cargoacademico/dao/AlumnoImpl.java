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

import com.cargoacademico.model.Alumno;


@SuppressWarnings("unchecked")
@Transactional
@Repository
public class AlumnoImpl implements AlumnoDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	
	public void saveAlumno(Alumno alu) {
		getSession().save(alu);
	}
	
	@Override
	public Alumno findByIdAlu (int id) {
		Criteria cri = getSession().createCriteria(Alumno.class);
		cri.add(Restrictions.eq("idAlumno",id));
		return(Alumno) cri.uniqueResult();
	}
	
	@Override
	public void deleteAlumno(Alumno alu) {
		getSession().delete(alu);
		
	}
	

	@Override
	public void updateAlumno(Alumno alu) {
		getSession().update(alu);
	}
	
	@Override
	public List<Alumno> encontrarAlumnos(){
		Query query = getSession().createQuery("from Alumno");
		return query.list();
	}
	
}
