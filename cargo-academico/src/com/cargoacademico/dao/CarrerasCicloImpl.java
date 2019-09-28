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

import com.cargoacademico.model.CarrerasCiclo;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class CarrerasCicloImpl implements CarrerasCicloDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	@Override
	public void saveCarrerasCiclo(CarrerasCiclo caCi) {
		getSession().save(caCi);
	}
	
	@Override
	public CarrerasCiclo findByIdCarrerasCiclo(int id) {
		Criteria crit = getSession().createCriteria(CarrerasCiclo.class);
		crit.add(Restrictions.eq("idCarrerasCiclo", id));
		return(CarrerasCiclo) crit.uniqueResult();
	}

	@Override
	public void deleteCarrerasCiclo(CarrerasCiclo caCi) {
		getSession().delete(caCi);
		
	}
	
	
	@Override
	public void updateCarrerasCiclo(CarrerasCiclo caCi) {
		getSession().update(caCi);
	}
	
	@Override
	public List<CarrerasCiclo> encontrarCarrerasCiclo(){
		Query query = getSession().createQuery("from CarrerasCiclo");
		return query.list();
	}
	
	
	
	
	

}
