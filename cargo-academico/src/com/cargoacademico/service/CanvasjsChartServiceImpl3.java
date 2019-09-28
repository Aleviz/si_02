package com.cargoacademico.service;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.dao.CanvasjsChartDao3;
 
@Repository
@Transactional
public class CanvasjsChartServiceImpl3 implements CanvasjsChartService3 {
 
	@Autowired
	private CanvasjsChartDao3 canvasjsChartDao3;
 
	public void setCanvasjsChartDao(CanvasjsChartDao3 canvasjsChartDao3) {
		this.canvasjsChartDao3 = canvasjsChartDao3;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData3() {
		return canvasjsChartDao3.getCanvasjsChartData3();
	}
 
}  