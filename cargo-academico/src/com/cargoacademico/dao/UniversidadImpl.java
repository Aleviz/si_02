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

import com.cargoacademico.model.Universidad;

@SuppressWarnings("unchecked")
@Transactional
@Repository

public class UniversidadImpl implements UniversidadDao{
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void save(Universidad uni) {
		getSession().save(uni);
	}
	
	@Override
    public Universidad findById(int idUniversidad) {
		Criteria crit = getSession().createCriteria(Universidad.class);
		crit.add(Restrictions.eq("idUniversidad", idUniversidad));
		return (Universidad) crit.uniqueResult();
	}
	
	@Override
	public void update(Universidad uni) {
		getSession().update(uni);
	}
	
	@Override
	public void delete(Universidad uni) {
		getSession().delete(uni);
	}
	
	@Override
	public List<Universidad> encontrarTodo(){
		Query query = getSession().createQuery("from Universidad");
		return query.list();
	}
	
}
