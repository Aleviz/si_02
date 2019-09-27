package com.cargoacademico.dao;


import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.Empleado;
;

@SuppressWarnings("unchecked")
@Transactional
@Repository

public class EmpleadoImpl implements EmpleadoDao {

	@Autowired
	private SessionFactory sessionFactory;

	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	
@Override
public void saveEmpleado(Empleado emp) {
	getSession().save(emp);
}
	
	
@Override
public Empleado findByIdEmpleado(int id) {
	Criteria crit = getSession().createCriteria(Empleado.class);
	crit.add(Restrictions.eq("idEmpleado",id));
	return(Empleado) crit.uniqueResult();
	
}

@Override 
public void deleteEmpleado(Empleado emp) {
	getSession().delete(emp);
}

@Override
public void updateEmpleado(Empleado emp) {
	getSession().delete(emp);
}

@Override
public List<Empleado> encontrarEmpleado(){
	Query query = getSession().createQuery("from Empleado");
	return query.list();
}

@Override
public List<Empleado> buscarEmpleado(){
	Query query = getSession().createQuery("FROM Empleado as e JOIN e.TipoDocente as td");
	System.out.println(query.list());
	return query.list();
}



}
