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

import com.cargoacademico.model.Ciclo;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class CicloImpl implements CicloDao {

	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void saveCiclo(Ciclo ci) {
		getSession().save(ci);
	}
	
	@Override
	public Ciclo findByIdCiclo(int id) {
		Criteria crit = getSession().createCriteria(Ciclo.class);
		crit.add(Restrictions.eq("idCiclo", id));
		return(Ciclo) crit.uniqueResult();
	}
	
	@Override
	public void deleteCiclo(Ciclo ci) {
		getSession().delete(ci);
	}
	
	@Override
	public void updateCiclo(Ciclo ci) {
		getSession().update(ci);
	}


	@Override
	public List<Ciclo> encontrarCiclo() {
		Query query = getSession().createQuery("from Ciclo");
		return query.list();
	}
	
	
	
}
