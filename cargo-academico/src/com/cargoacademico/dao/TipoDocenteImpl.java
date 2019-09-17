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

import com.cargoacademico.model.TipoDocente;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class TipoDocenteImpl implements TipoDocenteDao{
	
	private List<TipoDocente> listTipoDocente;
	private TipoDocente tipoDocente;
	@Autowired
	private SessionFactory session;
	
	public Session getSession() {
		return session.getCurrentSession();
	}
	
	@Override
	public TipoDocente saveTipoDocente(TipoDocente tipoDocente) {
		try {
			getSession().save(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
		return null;
		}
		return tipoDocente;
	}

	@Override
	public TipoDocente updateTipoDocente(TipoDocente tipoDocente) {
		try {
			getSession().saveOrUpdate(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoDocente;
	}

	@Override
	public TipoDocente findByIdTipoDocente(int id) {
		try {
			tipoDocente = new TipoDocente();
			Criteria c = getSession().createCriteria(TipoDocente.class);
			c.add(Restrictions.eq("idTipoDocente", id));
			tipoDocente = (TipoDocente) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoDocente;
	}

	@Override
	public List<TipoDocente> findAllTipoDocente() {
		try {
			listTipoDocente = new ArrayList<TipoDocente>();
			Query query = getSession().createQuery("from TipoDocente");
			listTipoDocente = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listTipoDocente;
	}

	@Override
	public void deleteTipoDocente(int id) {
		try {
			tipoDocente = new TipoDocente();
			tipoDocente = findByIdTipoDocente(id);
			getSession().delete(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
