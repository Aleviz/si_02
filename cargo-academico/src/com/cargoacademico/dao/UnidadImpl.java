package com.cargoacademico.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.Unidad;
@SuppressWarnings("unchecked")
@Transactional
@Repository
public class UnidadImpl implements UnidadDao{

	private List<Unidad> listUnidad;
	private Unidad unidad;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}
	
	@Override
	public Unidad saveUnidad(Unidad unidad) {
		try {
			getSession().save(unidad);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return unidad;
	}

	@Override
	public Unidad updateUnidad(Unidad unidad) {
		try {
			getSession().saveOrUpdate(unidad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return unidad;
	}

	@Override
	public Unidad findByIdUnidad(int id) {
		try {
			unidad = new Unidad();
			Criteria c = getSession().createCriteria(Unidad.class);
			c.add(Restrictions.eq("idUnidad", id));
			unidad = (Unidad) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return unidad;
	}

	@Override
	public List<Unidad> findAllUnidad() {
		try {
			listUnidad = new ArrayList<Unidad>();
			Query query = getSession().createQuery("from Unidad");
			listUnidad = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listUnidad;
	}

	@Override
	public void deleteUnidad(int id) {
		try {
			unidad = new Unidad();
			unidad = findByIdUnidad(id);
			getSession().delete(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
