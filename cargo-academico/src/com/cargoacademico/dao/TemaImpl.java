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

import com.cargoacademico.model.Tema;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class TemaImpl implements TemaDao {

	private List<Tema> listTema;
	private Tema tema;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public Tema saveTema(Tema tema) {
		try {
			getSession().save(tema);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tema;
	}

	@Override
	public Tema updateTema(Tema tema) {
		try {
			getSession().saveOrUpdate(tema);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tema;
	}

	@Override
	public List<Tema> findAllTema() {
		try {
			listTema = new ArrayList<Tema>();
			Query query = getSession().createQuery("from Tema");
			listTema = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listTema;
	}

	@Override
	public Tema findByIdTema(int id) {
		try {
			tema = new Tema();
			Criteria c = getSession().createCriteria(Tema.class);
			c.add(Restrictions.eq("idTema", id));
			tema = (Tema) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tema;
	}

	
	@Override
	public void deleteTema(int id) {
		try {
			tema = new Tema();
			tema = findByIdTema(id);
			getSession().delete(tema);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}


}
