package com.cargoacademico.reports;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;


import com.cargoacademico.model.Empleado;
import com.cargoacademico.service.EmpleadoService;

import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Reporte_Empleado {
	private JasperPrint jp;
	private Empleado empleado;
	private List<Empleado> empleadoList;
	private EmpleadoService empleadoService;
	SimpleDateFormat formato;
	
	public void EmpleadoReport() {
		empleadoList = new ArrayList<Empleado>();
		empleadoList = empleadoService.findAll();
	}
	
	public void EmpleadoToPdf() throws IOException, JRException{
		EmpleadoReport();
		
		JRBeanCollectionDataSource jdbc = new JRBeanCollectionDataSource(empleadoList);
		
		
	}
}
