package com.cargoacademico.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsMultiFormatView;
import org.springframework.web.servlet.view.jasperreports.JasperReportsViewResolver;


import com.cargoacademico.service.EmpleadoService;



@Controller
public class ReporteController {
	
	@RequestMapping("/documentos")
    public ModelAndView verDocumento() {
        return new ModelAndView("documentos");
    }
	
	@Autowired
	private EmpleadoService empleadoService;
	

	
	 @Bean
	    public JasperReportsViewResolver getJasperReportsViewResolver() {
	        JasperReportsViewResolver resolver = new JasperReportsViewResolver();
	        resolver.setPrefix("classpath:/jasperreport/");
	        resolver.setSuffix(".jasper");
	        resolver.setReportDataKey("datasource");
	        resolver.setViewNames(new String[] {"*_report"});
	        resolver.setViewClass(JasperReportsMultiFormatView.class);
	        resolver.setOrder(1);
	        return resolver;
	    }
	
	@RequestMapping("/report")
    public String verReporte(Model model,
            @RequestParam(
                    value = "format",
                    defaultValue = "pdf",
                    required = false) String format) {

        model.addAttribute("format", format);
        model.addAttribute("datasource", empleadoService.findAll());
        

        return "allempleados_report";
    }
	
}
