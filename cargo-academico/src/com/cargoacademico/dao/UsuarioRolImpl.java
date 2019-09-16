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

import com.cargoacademico.model.Roles;
import com.cargoacademico.model.Usuarios;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class UsuarioRolImpl implements UsuarioRolDao {
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	//Usuarios
	
	@Override
	public void save(Usuarios usu) {
		getSession().save(usu);
	}
	
	@Override
	public Usuarios findByIdUsuario(int id) {
		
		Criteria crit = getSession().createCriteria(Usuarios.class);
		crit.add(Restrictions.eq("idUsuarios",id));
		
		return(Usuarios)crit.uniqueResult();
	}
	
	
	
	@Override
	public List<Usuarios>  encontrarUsuarios() {
		Query query = getSession().createQuery("from Usuarios");
		return query.list();
		
	}
	
	@Override 
	public void update(Usuarios usu) {
		getSession().update(usu);	
	}
	
	@Override
	public void delete(Usuarios usu) {
		getSession().delete(usu);
		
	}
	
	
	
	//Roles

	@Override
	public void save(Roles rol) {
		getSession().save(rol);
	}
	
	@Override
	public Roles findByIdRoles(int id) {
		
		Criteria crit = getSession().createCriteria(Roles.class);
		crit.add(Restrictions.eq("idRoles",id));
		
		return(Roles)crit.uniqueResult();
	}
	
	
	
	@Override
	public List<Roles>  encontrarRoles() {
		Query query = getSession().createQuery("from Roles");
		return query.list();
		
	}
	
	@Override 
	public void update(Roles rol) {
		getSession().update(rol);	
	}

	

	@Override
	public void delete(Roles rol) {
		getSession().delete(rol);
		
	}
	
	
	
	

}
