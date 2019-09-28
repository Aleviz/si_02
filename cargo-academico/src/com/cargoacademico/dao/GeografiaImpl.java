package com.cargoacademico.dao;




import java.util.LinkedList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SQLQuery;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Coordenadas;
import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.Facultad;




@SuppressWarnings("unchecked")
@Transactional
@Repository
public class GeografiaImpl implements GeografiaDao {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public Session getSession() {
		return sessionFactory.getCurrentSession();
	}
	
	
	// IMPL COORDENADAS

	@Override
	public void saveCoordenadas(Coordenadas coordenada) {
		getSession().save(coordenada);
	}
	
	@Override
	public List<Coordenadas> allCoordenadas() {	
		Query query = getSession().createQuery("from Coordenadas") ;
		return query.list();
	}
	
	
	
	@Override
	public List<Empleado> buscarDecano() {	
		String sql ="SELECT empleado.id_empleado AS idEmpleado," + 
				" empleado.primer_nombre AS primerNombre," + 
				" empleado.segundo_nombre AS segundoNombre," + 
				" empleado.primer_apellido AS primerApellido," + 
				" empleado.segundo_apellido AS segundoApellido," + 

				" roles.nombre AS nombreRol" + 
				" FROM empleado empleado " + 

				" INNER JOIN usuarios usuarios ON" + 
				" empleado.usuario = usuarios.id_usuario" + 
				" INNER JOIN roles roles ON" + 
				" usuarios.rol = roles.id_rol" + 
				" WHERE roles.id_rol = 1;";
		SQLQuery query = getSession().createSQLQuery(sql)
//				.addEntity("empleado", Empleado.class) 
//				.addEntity("tipo_docentes", TipoDocentes.class)
//				.addEntity("usuarios" , Usuarios.class)
//				.addEntity("roles", Roles.class)
				;
//				.addJoin(tableAlias, path);
		
		
		try {
			
		
		List<Empleado> emlist = new LinkedList<>();
		
		List<Object[]> rows = query.list();
//		Empleado empleado;
//		

		for(Object[] row: rows) {
			Empleado emp = new Empleado();
			emp.setIdEmpleado(Integer.parseInt(row[0].toString()));
			emp.setPrimerNombre(row[1].toString());
			emp.setSegundoNombre(row[2].toString());
			emp.setPrimerApellido(row[3].toString());
			emp.setSegundoApellido(row[4].toString());
			
			
			
			System.out.println("ID DEL EMPLEADO = "+emp.getIdEmpleado());
			System.out.println("Primer N  = "+emp.getPrimerNombre());
			System.out.println("Segundo N  = "+emp.getSegundoNombre());
			System.out.println("Primer A  = "+emp.getPrimerApellido());
			System.out.println("Segundo A  = "+emp.getSegundoApellido());
			System.out.println("ROL  = "+row[5].toString());

			emlist.add(emp);
			
		}
		
		return emlist;
		
		
		} catch (NumberFormatException  nfe) {
			System.out.println("erroooor  "+nfe);
			System.out.println("error");
			return null;
		}
	}
	
	
	
	
	@Override
	public Coordenadas findByIdC (int id) {
		Criteria crit = getSession().createCriteria(Coordenadas.class);
		crit.add(Restrictions.eq("idCoordenada", id));
		return (Coordenadas)crit.uniqueResult();
	}
	

	
	
	
	//IMPL FACULTAD
	@Override
	public void saveFacultad(Facultad facultad) {
		getSession().save(facultad);
	}

	@Override
	public List<Facultad> allFacultad() {
		Query query = getSession().createQuery("from Facultad");
		return query.list();
	}
	
	@Override
	public Facultad findByIdF (int id) {
		Criteria crit = getSession().createCriteria(Facultad.class);
		crit.add(Restrictions.eq("idFacultad", id));
		return (Facultad)crit.uniqueResult();
	}
	
	@Override
	public  List<Facultad>  findByNameF(String name) {
		Query query = getSession().createQuery("from Facultad where facultad ='"+name+"'");
		System.out.println("hola  "+name+" xxxxxx "+query.list().size());
		return query.list();
	}
	

	@Override
	public  List<Facultad>  findByCampus(int idCampus) {
		Query query = getSession().createQuery("from Facultad where campus ='"+idCampus+"'");
		System.out.println("hola  "+idCampus+" xxxxxx "+query.list().size());
		return query.list();
	}
	
	
	@Override
	public void updateFacultad(Facultad facultad) {
		getSession().update(facultad);
	}

	
	
	//IMPL CAMPUS
	@Override
	public void saveCampus(Campus campus) {
		getSession().save(campus);
	}

	@Override
	public List<Campus> allCampus() {
		Query query = getSession().createQuery("from Campus");
		return query.list();
	}
	
	@Override
	public Campus findByNameCp (String nameCampus) {
		Criteria crit = getSession().createCriteria(Campus.class);
		crit.add(Restrictions.eq("campus", nameCampus));
		return (Campus)crit.uniqueResult();
	}
	

	@Override
	public void updateCampus(Campus campus) {
		getSession().update(campus);
	}




}