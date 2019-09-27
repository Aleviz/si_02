package com.cargoacademico.reports;

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
import org.springframework.web.bind.annotation.RequestMapping;

import com.cargoacademico.model.Empleado;
import com.cargoacademico.service.EmpleadoService;

import net.sf.jasperreports.engine.JasperRunManager;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;

public class Reporte_Empleado {
	SimpleDateFormat format;
	
	@Autowired
	ServletContext servletContext;
	
	@Autowired
	EmpleadoService empleadoService;
	List<TodoEmpleado> listacopiaempleado = new ArrayList<TodoEmpleado>();
	List<Empleado> listaempleado = new ArrayList<Empleado>();
	
	public void setServletContext(ServletContext servletContext) {
		this.servletContext = servletContext;
	}

	@RequestMapping("/report1")
	public void pdfEnVista(HttpServletResponse response, ServletOutputStream outputStream, HttpServletRequest request)
			throws ServletException, IOException {

		List<Empleado> listaempleado = new ArrayList<Empleado>();
		format = new SimpleDateFormat("dd/MM/YYYY");
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
				.getResourceAsStream("/resources/jasperreport/allempleados_report.jasper");

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
	
}
