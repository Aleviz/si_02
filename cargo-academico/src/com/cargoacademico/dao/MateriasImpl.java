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

import com.cargoacademico.model.Materias;

@SuppressWarnings("unchecked")
@Transactional
@Repository

public class MateriasImpl implements MateriasDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}

	@Override
	public void save(Materias mate) {

		getSession().save(mate);

	}

	@Override
	public Materias findById(int id) {

		Criteria crit = getSession().createCriteria(Materias.class);
		crit.add(Restrictions.eq("idMateria", id));

		return (Materias) crit.uniqueResult();

	}

	@Override
	public void update(Materias mate) {
		getSession().update(mate);
	}

	@Override
	public void delete(Materias mate) {
		getSession().delete(mate);
	}

	@Override
	public List<Materias> encontrarTodo() {
		Query query = getSession().createQuery("from Materias"); // MySQL -> select * from Admin;
		return query.list();
	}

//
//	private List<Materias> listMaterias;
//	private Materias mate;
//

//
//	@Override
//	public Materias saveOrUpdate(Materias mat) {
//	 mat = new Materias();
//		try {
//		getSession().saveOrUpdate(mat);;
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//
//		return mat;
//	}
//	
//
//
//	@Override
//	public List<Materias> encontrarTodo() {
//		try {
//			listMaterias = new ArrayList<Materias>();
//			Query query = getSession().createQuery("from Materias");
//			listMaterias = query.list();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//			// TODO: handle exception
//		}
//		
//		return listMaterias;
//	}
//
//
//	@Override
//	public Materias findById(int id) {
//		try {
//			mate = new Materias();
//			Criteria c = getSession().createCriteria(Materias.class);
//			c.add(Restrictions.eq("id_materia", id));
//			mate = (Materias)c.uniqueResult();
//		} catch (Exception e) {
//			e.printStackTrace();
//			return null;
//		}
//		
//		return mate;
//	}
//
//
//	@Override
//	public void delete(int id) {
//		try {
//			mate = new Materias();
//			mate = findById(id);
//			getSession().delete(mate);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//
//		
//		
//
//
//	}

}
