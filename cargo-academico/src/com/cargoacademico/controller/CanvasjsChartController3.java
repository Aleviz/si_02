package com.cargoacademico.controller;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
 
import com.cargoacademico.service.CanvasjsChartService3;
 
@Controller
public class CanvasjsChartController3 {
 
	@Autowired
	private CanvasjsChartService3 canvasjsChartService3;
 
	@RequestMapping(value ="/canvasjschart3", method = RequestMethod.GET)
	public String springMVC(ModelMap modelMap) {
		List<List<Map<Object, Object>>> canvasjsDataList = canvasjsChartService3.getCanvasjsChartData3();
		modelMap.addAttribute("dataPointsList", canvasjsDataList);
		return "chart3";
	}
 
}