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

@SuppressWarnings("unchecked")
@Repository
@Transactional
public class MateriaCarreraCicloImpl implements MateriaCarreraCicloDao {
	
	private List<MateriaCarreraCiclo> listMateriaCarreraCiclo;
	private MateriaCarreraCiclo materiaCarreraCiclo;
	@Autowired
	private SessionFactory session;

	public Session getSession() {
		return session.getCurrentSession();
	}

	@Override
	public MateriaCarreraCiclo saveMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
		try {
			getSession().save(materiaCarreraCiclo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaCarreraCiclo;
	}

	@Override
	public MateriaCarreraCiclo updateMateriaCarreraCiclo(MateriaCarreraCiclo materiaCarreraCiclo) {
		try {
			getSession().saveOrUpdate(materiaCarreraCiclo);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaCarreraCiclo;
	}

	@Override
	public MateriaCarreraCiclo findByIdMateriaCarreraCiclo(int id) {
		try {
			materiaCarreraCiclo = new MateriaCarreraCiclo();
			Criteria c = getSession().createCriteria(MateriaCarreraCiclo.class);
			c.add(Restrictions.eq("idMateriaCarreraCiclo", id));
			materiaCarreraCiclo = (MateriaCarreraCiclo) c.uniqueResult();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return materiaCarreraCiclo;
	}

	@Override
	public List<MateriaCarreraCiclo> findAllMateriaCarreraCiclo() {
		try {
			listMateriaCarreraCiclo = new ArrayList<MateriaCarreraCiclo>();
			Query query = getSession().createQuery("from MateriaCarreraCiclo");
			listMateriaCarreraCiclo = query.list();
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		return listMateriaCarreraCiclo;
	}

	@Override
	public void deleteMateriaCarreraCiclo(int id) {
		try {
			materiaCarreraCiclo = new MateriaCarreraCiclo();
			materiaCarreraCiclo = findByIdMateriaCarreraCiclo(id);
			getSession().delete(materiaCarreraCiclo);
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
