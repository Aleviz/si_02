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

import com.cargoacademico.model.TipoDocentes;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class TipoDocenteImpl implements TipoDocenteDao{
	
	private List<TipoDocentes> listTipoDocente;
	private TipoDocentes tipoDocente;
	@Autowired
	private SessionFactory session;
	
	public Session getSession() {
		return session.getCurrentSession();
	}
	
	@Override
	public TipoDocentes saveTipoDocente(TipoDocentes tipoDocente) {
		try {
			getSession().save(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
		return null;
		}
		return tipoDocente;
	}

	@Override
	public TipoDocentes updateTipoDocente(TipoDocentes tipoDocente) {
		try {
			getSession().saveOrUpdate(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoDocente;
	}

	@Override
	public TipoDocentes findByIdTipoDocente(int id) {
		try {
			tipoDocente = new TipoDocentes();
			Criteria c = getSession().createCriteria(TipoDocentes.class);
			c.add(Restrictions.eq("idTipoDocente", id));
			tipoDocente = (TipoDocentes) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoDocente;
	}

	@Override
	public List<TipoDocentes> findAllTipoDocente() {
		try {
			listTipoDocente = new ArrayList<TipoDocentes>();
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
			tipoDocente = new TipoDocentes();
			tipoDocente = findByIdTipoDocente(id);
			getSession().delete(tipoDocente);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
