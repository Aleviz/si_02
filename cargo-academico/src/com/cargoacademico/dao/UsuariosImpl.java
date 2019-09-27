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

import com.cargoacademico.model.Usuarios;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class UsuariosImpl implements UsuarioDao {

	private Usuarios usuario;
	private List<Usuarios> listUsuarios;

	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public Usuarios insertUsuario(Usuarios usuario) {
		try {
			getSession().save(usuario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usuario;
	}

	@Override
	public Usuarios updateUsuario(Usuarios usuario) {
		try {
			getSession().saveOrUpdate(usuario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usuario;
	}

	@Override
	public Usuarios findByidUsuario(int id) {
		try {
			usuario = new Usuarios();
			Criteria c = getSession().createCriteria(Usuarios.class);
			c.add(Restrictions.eq("idUsuario", id));
			usuario = (Usuarios) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return usuario;
	}

	@Override
	public List<Usuarios> findAllUsuarios() {
		try {
			listUsuarios = new ArrayList<Usuarios>();
			Query query = getSession().createQuery("from Usuarios");
			listUsuarios = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listUsuarios;
	}

	@Override
	public void deleteUsuario(int id) {
		try {
			usuario = new Usuarios();
			usuario = findByidUsuario(id);
			getSession().delete(usuario);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	@Override
	public List<Usuarios> loguearUsuario(Usuarios usuario) {
		try {
			listUsuarios = new ArrayList<Usuarios>();
			Query query = getSession().createQuery("from Usuarios where username ='"+usuario.getUsername()+"' and pass ='" +usuario.getPass()+"'");
			listUsuarios = query.list();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return listUsuarios;
	}

}
