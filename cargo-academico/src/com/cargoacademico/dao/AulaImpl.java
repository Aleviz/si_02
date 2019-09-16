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

import com.cargoacademico.model.Aula;


@SuppressWarnings("unchecked")
@Transactional
@Repository

public class AulaImpl implements AulaDao {
	
	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	@Override
	public void saveAula (Aula au) {
		getSession().save(au);
}
	
	 @Override
	 public Aula findByIdAula(int id) {
		 Criteria crit = getSession().createCriteria(Aula.class);
		 crit.add(Restrictions.eq("idAula", id));
		 return (Aula) crit.uniqueResult();
	 }
	@Override
	 public void updateAula(Aula au) {
		getSession().update(au);
	}
	
	@Override
	public List<Aula>encontrarAula(){
		Query query= getSession().createQuery("from Aula");
		return query.list();
	}

	@Override
	public void deleteAula(Aula au) {
		getSession().delete(au);
		
	}
	
	

}
