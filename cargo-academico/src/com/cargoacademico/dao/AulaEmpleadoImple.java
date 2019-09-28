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

import com.cargoacademico.model.AulaEmpleado;

@SuppressWarnings("unchecked")
@Transactional
@Repository


public class AulaEmpleadoImple implements AulaEmpleadoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveAulaEmpleado(AulaEmpleado auem) {
		getSession().save(auem);
	}
	
	 
	@Override
	public AulaEmpleado findByIdAulaEmpleado(int id) {
		Criteria crit = getSession().createCriteria(AulaEmpleado.class);
		crit.add(Restrictions.eq("idAulaEmpleado", id));
		return (AulaEmpleado) crit.uniqueResult();
	}
	
	@Override
	public void deleteAulaEmpleado(AulaEmpleado auem) {
		getSession().update(auem);
	}

	@Override
	public void updateAulaEmpleado(AulaEmpleado auem) {
		getSession().update(auem);
	}
	@Override
	public List<AulaEmpleado> encontrarAulaEmpleado(){
		Query query= getSession().createQuery("from AulaEmpleado");
				return query.list();
			
	}


}

