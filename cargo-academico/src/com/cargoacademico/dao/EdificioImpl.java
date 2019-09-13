package com.cargoacademico.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.cargoacademico.model.Edificio;

@SuppressWarnings("unchecked")
@Transactional
@Repository

public class EdificioImpl implements EdificioDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Edificio edi) {
		getSession().save(edi);
	}
	
	@Override
	public Edificio findById(int idEdificio) {
		Criteria crit = getSession().createCriteria(Edificio.class);
		crit.add(Restrictions.eq("idEdificio", idEdificio));
		return (Edificio) crit.uniqueResult();
	}
	
	@Override
	public void update(Edificio edi) {
		getSession().update(edi);
	}
	
	@Override
	public void delete(Edificio edi) {
		getSession().delete(edi);
	}
	
	@Override 
	public List<Edificio> encontrarTodo(){
		Query query = getSession().createQuery("from Edificio");
		return query.list();
	}
	
	
	
	
}
