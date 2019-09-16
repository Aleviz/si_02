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

import com.cargoacademico.model.MateriaCarreraCiclo;
import com.cargoacademico.model.Materias;
import com.cargoacademico.model.Temario;

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class TemarioImpl implements TemarioDao {

	private List<MateriaCarreraCiclo> listMateriasCiclo;
	private List<Temario> listTemario;
	private List<Materias> listMaterias;
	private Temario temario;

	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public List<MateriaCarreraCiclo> findAll() {
		try {
			listMateriasCiclo = new ArrayList<MateriaCarreraCiclo>();
			Query query = getSession().createQuery("from MateriaCarreraCiclo");
			listMateriasCiclo = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en Dao");
		}
		return listMateriasCiclo;
	}

	@Override
	public List<Temario> findAllTemario() {
		try {
			listTemario = new ArrayList<Temario>();
			Query query = getSession().createQuery("from Temario");
			listTemario = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en Dao");
		}
		return listTemario;
	}

	@Override
	public List<Materias> findAllMaterias() {
		try {
			listMaterias = new ArrayList<Materias>();
			Query query = getSession().createQuery("from Materias");
			listMaterias = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Error en Dao");
		}
		return listMaterias;
	}

	@Override
	public Temario saveTemario(Temario temario) {
		try {
			getSession().save(temario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return temario;
	}

	@Override
	public Temario updateTemario(Temario temario) {
		try {
			getSession().saveOrUpdate(temario);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temario;
	}

	@Override
	public Temario findByIdTemario(int id) {
		try {
			temario = new Temario();
			Criteria c = getSession().createCriteria(Temario.class);
			c.add(Restrictions.eq("idTemario", id));
			temario = (Temario) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return temario;
	}

	@Override
	public void deleteTemario(int id) {
		try {
			temario = new Temario();
			temario = findByIdTemario(id);
			getSession().delete(temario);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
