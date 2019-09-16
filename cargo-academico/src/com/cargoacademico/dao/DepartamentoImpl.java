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

import com.cargoacademico.model.Departamento;

@SuppressWarnings("unchecked")
@Transactional
@Repository

public class DepartamentoImpl implements DepartamentoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override

	public void saveDepartamento(Departamento dep) {
		getSession().save(dep);

	}

	@Override
	public Departamento findByIdDepartamento(int id) {
		Criteria crit = getSession().createCriteria(Departamento.class);
		crit.add(Restrictions.eq("idDepartamento", id));
		return (Departamento) crit.uniqueResult();

	}

	@Override
	public void deleteDepartamento(Departamento dep) {
		getSession().delete(dep);
	}

	@Override
	public void updateDepartamento(Departamento dep) {
		getSession().update(dep);
	}

	@Override
	public List<Departamento> encontrarDepartamento() {
		Query query = getSession().createQuery("from Departamento");
		return query.list();
	}

}
