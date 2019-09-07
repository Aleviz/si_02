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
import com.cargoacademico.model.Escuela;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class EscuelaImpl implements EscuelaDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Escuela escue) {
		getSession().save(escue);
	}
	@Override
	public Escuela findById(int id) {
	
	Criteria crit = getSession().createCriteria(Escuela.class);
	crit.add(Restrictions.eq("idEscuela",id));
	
	return(Escuela) crit.uniqueResult();
	}
	
	@Override
	public void delete (Escuela escue) {
		getSession().delete(escue);
	}
	
	@Override
	public void update (Escuela escue) {
		getSession().update(escue);
	}
	
	@Override
	public List<Escuela> encontrarTodo(){
		Query query = getSession().createQuery("from Escuela");	
		return query.list();
	}
}