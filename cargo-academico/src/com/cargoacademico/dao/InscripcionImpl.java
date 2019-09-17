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

import com.cargoacademico.model.Inscripcion;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class InscripcionImpl implements InscripcionDao {

	private List<Inscripcion> listInscripcion;
	private Inscripcion inscripcion;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public Inscripcion saveInscripcion(Inscripcion inscripcion) {
		try {
			getSession().save(inscripcion);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return inscripcion;
	}

	@Override
	public List<Inscripcion> findAllInscripcion() {
		try {
			listInscripcion = new ArrayList<Inscripcion>();
			Query query = getSession().createQuery("from Inscripcion");
			listInscripcion = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listInscripcion;
	}

	@Override
	public Inscripcion findByIdInscripcion(int id) {
		try {
			inscripcion = new Inscripcion();
			Criteria c = getSession().createCriteria(Inscripcion.class);
			c.add(Restrictions.eq("idInscripcion", id));
			inscripcion = (Inscripcion) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return inscripcion;
	}

	@Override
	public Inscripcion updateInscripcion(Inscripcion inscripcion) {
		try {
			getSession().saveOrUpdate(inscripcion);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return inscripcion;
	}

	@Override
	public void deleteInscripcion(int id) {
		try {
			inscripcion = new Inscripcion();
			inscripcion = findByIdInscripcion(id);
			getSession().delete(inscripcion);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
