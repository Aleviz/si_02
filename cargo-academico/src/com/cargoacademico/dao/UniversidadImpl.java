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
import com.cargoacademico.model.Universidad;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class UniversidadImpl implements UniversidadDao {

	private List<Universidad> listUniversidad;
	private Universidad universidad;

	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public Universidad saveUniversidad(Universidad universidad) {
		try {
			getSession().save(universidad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return universidad;
	}

	@Override
	public Universidad updateUniversidad(Universidad universidad) {
		try {
			getSession().saveOrUpdate(universidad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return universidad;
	}

	@Override
	public Universidad findByIdUniversidad(int id) {
		try {
			universidad = new Universidad();
			Criteria c = getSession().createCriteria(Universidad.class);
			c.add(Restrictions.eq("idUniversidad", id));
			universidad = (Universidad) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return universidad;
	}

	@Override
	public List<Universidad> findAllUniversidad() {
		try {
			listUniversidad = new ArrayList<Universidad>();
			Query query = getSession().createQuery("from Universidad");
			listUniversidad = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listUniversidad;
	}

	@Override
	public void deleteUniversidad(int id) {
		try {
			universidad = new Universidad();
			universidad = findByIdUniversidad(id);
			getSession().delete(universidad);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
