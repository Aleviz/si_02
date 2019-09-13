package com.cargoacademico.dao;

import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.EmpleadoMateria;
import com.cargoacademico.model.TipoDocente;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class EmpleadoImpl implements EmpleadoDao{
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	/* inicio de dao empleado */ 
	
	@Override
	public Empleado findEById(int idEmpleado) {
		Criteria crit = getSession().createCriteria(Empleado.class);
		crit.add(Restrictions.eq("idEmpleado", idEmpleado));
		
		return (Empleado) crit.uniqueResult();
	}
	
	@Override
	public List<Empleado> encontrarTodoE(){
		Query query = getSession().createQuery("from Empleado");
		return query.list();
	}
	
	@Override
	public void save(Empleado emp) {
		getSession().save(emp);
	}
	
	@Override
	public void update(Empleado emp) {
		getSession().update(emp);
	}
	
	@Override
	public void delete(Empleado emp) {
		getSession().delete(emp);
	}
	
	/* fin de dao empleado */ 
	/*------------------------------------------------------------------------------------------------*/
	
	/* inicio de dao tipo_docente */ 
	
	@Override
	public TipoDocente findTDById(int id_tipo_docente) {
		Criteria crit = getSession().createCriteria(Empleado.class);
		crit.add(Restrictions.eq("idTipoDocente", id_tipo_docente));
		
		return (TipoDocente) crit.uniqueResult();
	}
	
	@Override
	public List<TipoDocente> encontrarTodoTD(){
		Query query = getSession().createQuery("from Tipo_docente");
		return query.list();
	}
	
	/* fin de dao tipo_docente */ 
	/*------------------------------------------------------------------------------------------------*/
	
	/* inicio de dao empleado_Materia */ 
	
	@Override
	public EmpleadoMateria findEMById(int id_emp_mate) {
		Criteria crit = getSession().createCriteria(EmpleadoMateria.class);
		crit.add(Restrictions.eq("idEmpMate", id_emp_mate));
		
		return (EmpleadoMateria) crit.uniqueResult();
	}
	
	@Override
	public List<EmpleadoMateria> encontrarTodoEM(){
		Query query = getSession().createQuery("from empleado_materia");
		return query.list();
	}
	
	/* fin de dao empleado_Materia */ 
	/*------------------------------------------------------------------------------------------------*/
	
}
