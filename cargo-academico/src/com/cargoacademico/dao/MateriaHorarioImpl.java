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

import com.cargoacademico.model.MateriaHorario;

@SuppressWarnings("unchecked")
@Transactional
@Repository
public class MateriaHorarioImpl implements MateriaHorarioDao {
	
	private List<MateriaHorario> listMateriaHorario;
	private MateriaHorario materiaHorario;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public MateriaHorario saveMateriaHorario(MateriaHorario materiaHorario) {
		try {
			getSession().save(materiaHorario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaHorario;
	}

	@Override
	public MateriaHorario updateMateriaHorario(MateriaHorario materiaHorario) {
		try {
			getSession().saveOrUpdate(materiaHorario);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaHorario;
	}

	@Override
	public List<MateriaHorario> findAllMateriaHorario() {
		try {
			listMateriaHorario = new ArrayList<MateriaHorario>();
			Query query = getSession().createQuery("from MateriaHorario");
			listMateriaHorario = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listMateriaHorario;
	}

	@Override
	public MateriaHorario findByIdMateriaHorario(int id) {
		try {
			materiaHorario = new MateriaHorario();
			Criteria c = getSession().createCriteria(MateriaHorario.class);
			c.add(Restrictions.eq("idMateriaHorario", id));
			materiaHorario = (MateriaHorario) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaHorario;
	}

	@Override
	public void deleteMateriaHorario(int id) {
		try {
			materiaHorario = new MateriaHorario();
			materiaHorario = findByIdMateriaHorario(id);
			getSession().delete(materiaHorario);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
