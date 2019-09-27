package com.cargoacademico.controller;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cargoacademico.model.Empleado;
import com.cargoacademico.model.Escuela;
import com.cargoacademico.reports.EspMayaCurricular;
import com.cargoacademico.reports.TodoEmpleado;
import com.cargoacademico.service.EmpleadoService;
import com.cargoacademico.service.EscuelaService;

import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

@Controller
public class pruebareporte {
	SimpleDateFormat format;
	
	@Autowired
	ServletContext servletContext;
	
	@Autowired
	EmpleadoService empleadoService;
	
	@Autowired
	EscuelaService escuelaService;
	
	
	
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@RequestMapping("/report1")
	public void pdfEnVista(HttpServletResponse response, ServletOutputStream outputStream, HttpServletRequest request)
			throws ServletException, IOException {

		List<Empleado> listaempleado = new ArrayList<Empleado>();
		List<TodoEmpleado> listacopiaempleado = new ArrayList<TodoEmpleado>();
		
		listaempleado = empleadoService.findAll();
		
		
		for(Empleado em : listaempleado) {
			TodoEmpleado copiaempleado = new TodoEmpleado();
			copiaempleado.setEprimernombre(em.getPrimerNombre());
			copiaempleado.setEsegundonombre(em.getSegundoNombre());
			copiaempleado.setEprimerapellido(em.getPrimerApellido());
			copiaempleado.setEsegundoapellido(em.getSegundoApellido());
			copiaempleado.setEfechanacimiento(em.getFechaNacimiento());
			copiaempleado.setEcarnet(em.getCarnet());
			copiaempleado.setTdtipodocente(em.getTipoDocente().getTipoDocente());
			listacopiaempleado.add(copiaempleado);
		}
		
		InputStream ubicacionReporte = null;
		ubicacionReporte = request.getSession().getServletContext()
				.getResourceAsStream("/jasper/allempleados_report.jasper");

		try {
			

			Map<String, Object> parameter = new HashMap<String, Object>();
			byte[] bytes = JasperRunManager.runReportToPdf(ubicacionReporte, parameter, new JRBeanCollectionDataSource(listacopiaempleado));

			response.setContentType("application/pdf");
			response.setContentLength(bytes.length);
			response.setHeader("Content-disposition", "inline; filename=personas_report.pdf");

			outputStream = response.getOutputStream();
			outputStream.write(bytes, 0, bytes.length);

			outputStream.flush();
			outputStream.close();

		} catch (Exception e) {

			System.out.println("Error en pdfEnVista" + e.getMessage());

		}
	}
	
	@RequestMapping("/report2")
	public void pdfEnVista2(HttpServletResponse response, ServletOutputStream outputStream, HttpServletRequest request)
			throws ServletException, IOException {
		if(null != request.getParameter("paramFacu")) {
			
			int idFacultad = Integer.parseInt(request.getParameter("paramFacu"));
			List<EspMayaCurricular> ListcopiaMaya = new ArrayList<EspMayaCurricular>();
			List<Escuela> listaMaya = new ArrayList<Escuela>();
			
			listaMaya = escuelaService.buscarescuela( idFacultad);
			
			
			for(Escuela es : listaMaya) {
				EspMayaCurricular copiamaya = new EspMayaCurricular();
				copiamaya.setEsnombreescuela(es.getNombreEscuela());
				copiamaya.setFfacultad(es.getFacultad().getFacultad());
				copiamaya.setEsdescripcion(es.getDescripcion());
				copiamaya.setEsvision(es.getVision());
				copiamaya.setEsmision(es.getMision());
				copiamaya.setEsobjectivo(es.getObjetivo());
				copiamaya.setFubicacion(es.getFacultad().getUbicacion());
				copiamaya.setEstelefono(es.getTelefono());
			}
			
			InputStream ubicacionReporte = null;
			ubicacionReporte = request.getSession().getServletContext()
					.getResourceAsStream("/jasper/maya_curricular.jasper");

			try {
				

				Map<String, Object> parameter = new HashMap<String, Object>();
				byte[] bytes = JasperRunManager.runReportToPdf(ubicacionReporte, parameter, new JRBeanCollectionDataSource(ListcopiaMaya));

				response.setContentType("application/pdf");
				response.setContentLength(bytes.length);
				response.setHeader("Content-disposition", "inline; filename=personas_report.pdf");

				outputStream = response.getOutputStream();
				outputStream.write(bytes, 0, bytes.length);

				outputStream.flush();
				outputStream.close();

			} catch (Exception e) {
				System.out.println("Error en pdfEnVista" + e.getMessage());
			}
		}else {
			return;
		}
		
	}	
		
	
}
