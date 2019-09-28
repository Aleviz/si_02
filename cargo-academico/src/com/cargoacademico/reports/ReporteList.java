package com.cargoacademico.reports;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import com.cargoacademico.model.Campus;
import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.Facultad;
import com.cargoacademico.model.TipoDocente;
import com.cargoacademico.service.EmpleadoService;

public class ReporteList {
	
	private Empleado empleado;
	private EspEmpleado espEmpleado;
	private Campus campus;
	private Facultad facultad;
	private TipoDocente tipodocente;
	private List<EspEmpleado> listEspEmpleado;
	private List<Empleado> ListEmpleado;
	private List<Campus> ListCampus;
	private List<Facultad> ListFacultad;
	private List<TipoDocente> ListDocente;
	private EmpleadoService empleadoDao;
	
	
	public void ImprimirEmpleado(Integer cidcampus) {
		espEmpleado = new EspEmpleado();
		empleado = new Empleado();
		campus = new Campus();
		facultad=new Facultad();
		tipodocente =new TipoDocente();
		empleadoDao = new EmpleadoService();
		
		listEspEmpleado = new ArrayList<EspEmpleado>();
		
		SimpleDateFormat df = new SimpleDateFormat("dd-MMM-yyyy");
		
		
	}
	
}
