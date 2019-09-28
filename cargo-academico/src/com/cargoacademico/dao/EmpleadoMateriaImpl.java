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

import com.cargoacademico.model.EmpleadoMateria;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class EmpleadoMateriaImpl implements EmpleadoMateriaDao {
	private List<EmpleadoMateria> listEmpleadoMateria;
	private EmpleadoMateria empleadoMateria;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public EmpleadoMateria saveEmpleadoMateria(EmpleadoMateria empleadoMateria) {
		try {
			getSession().save(empleadoMateria);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return empleadoMateria;
	}

	@Override
	public List<EmpleadoMateria> findAllEmpleadoMateria() {
		try {
			listEmpleadoMateria = new ArrayList<EmpleadoMateria>();
			Query query = getSession().createQuery("from EmpleadoMateria");
			listEmpleadoMateria = query.list();
		} catch (Exception e) {
			return null;
		}
		return listEmpleadoMateria;
	}

	@Override
	public EmpleadoMateria findByIdEmpleadoMateria(int id) {
		try {

			empleadoMateria = new EmpleadoMateria();
			Criteria c = getSession().createCriteria(EmpleadoMateria.class);
			c.add(Restrictions.eq("idEmpMate", id));
			empleadoMateria = (EmpleadoMateria) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return empleadoMateria;
	}

	@Override
	public EmpleadoMateria updateEmpleadoMateria(EmpleadoMateria empleadoMateria) {
		try {
			getSession().saveOrUpdate(empleadoMateria);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return empleadoMateria;
	}

	@Override
	public void deleteEmpleadoMateria(int id) {
		try {
			empleadoMateria = new EmpleadoMateria();
			empleadoMateria = findByIdEmpleadoMateria(id);
			getSession().delete(empleadoMateria);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
