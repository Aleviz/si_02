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

import com.cargoacademico.model.Edificio;


@SuppressWarnings("unchecked")
@Transactional
@Repository
public class EdificioImpl  implements EdificioDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}	
	
	@Override
	public void saveEdificio(Edificio edi) {
		getSession().save(edi);
	}
	
	@Override
	public Edificio findByIdEdificio(int id) {
		Criteria crit = getSession().createCriteria(Edificio.class);
		crit.add(Restrictions.eq("idEdificio", id));
		return(Edificio) crit.uniqueResult();
	}
	
	@Override
	public void deleteEdificio(Edificio edi) {
		getSession().delete(edi);
		
	}
	
	@Override 
	public void updateEdificio(Edificio edi) {
		getSession().update(edi);
	}
	
	
	@Override
	public List<Edificio> encontrarEdificio(){
		Query query = getSession().createQuery("from Edificio");
		return query.list();
	}
	
	

}
