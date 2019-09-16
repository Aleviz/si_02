package com.cargoacademico.controller;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.cargoacademico.service.CanvasjsChartService2;
 
@Controller
public class CanvasjsChartController2 {
 
	@Autowired
	private CanvasjsChartService2 canvasjsChartService2;
 
	@RequestMapping(value ="/canvasjschart2", method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService2.getCanvasjsChartData2();
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		return "chart2";
	}
 
}   