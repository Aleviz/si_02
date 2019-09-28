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

import com.cargoacademico.model.Actividades;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class ActividadesImpl implements ActividadesDao {

	
	@Autowired 
	
	private  SessionFactory sessionFactory;
	 
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void saveActividades(Actividades acti) {
		 getSession().save(acti);
	}
	
	
	@Override
	public Actividades findByIdActi(int id) {
		Criteria crit = getSession().createCriteria(Actividades.class);
		crit.add(Restrictions.eq("idActiviades",id));
		return(Actividades) crit.uniqueResult();
	}
	
	@Override
	public void deleteActividades(Actividades acti) {
		getSession().delete(acti);
		
	}
	
	@Override
	public void updateActividades(Actividades acti) {
		getSession().update(acti);
		
	}
	
	@Override
	public List<Actividades> encontrarActividades(){
		Query query = getSession().createQuery("from Actividades");
				return query.list();
						
	}
}
