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

import com.cargoacademico.model.TipoActividad;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class TipoActividadImpl implements TipoActividadDao {

	private List<TipoActividad> listTipoActividad;
	private TipoActividad tipoActividad;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public TipoActividad saveTipoActividad(TipoActividad tipoActividad) {
		try {
			getSession().save(tipoActividad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoActividad;
	}

	@Override
	public TipoActividad updateTipoActividad(TipoActividad tipoActividad) {
		try {
			getSession().saveOrUpdate(tipoActividad);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoActividad;
	}

	@Override
	public TipoActividad findByIdTipoActividad(int id) {
		try {
			tipoActividad = new TipoActividad();
			Criteria c = getSession().createCriteria(TipoActividad.class);
			c.add(Restrictions.eq("idTipoActividad", id));
			tipoActividad = (TipoActividad) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return tipoActividad;
	}

	@Override
	public List<TipoActividad> findAllTipoActividad() {
		try {
			listTipoActividad = new ArrayList<TipoActividad>();
			Query query = getSession().createQuery("from TipoActividad");
			listTipoActividad = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listTipoActividad;
	}

	@Override
	public void deleteTipoActividad(int id) {
		try {
			tipoActividad = new TipoActividad();
			tipoActividad = findByIdTipoActividad(id);
			getSession().delete(tipoActividad);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
