package com.cargoacademico.service;

import java.util.List;
import java.util.Map;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.dao.CanvasjsChartDao2;

@Repository
@Transactional
public class CanvasjsChartServiceImpl2 implements CanvasjsChartService2 {
 
	@Autowired
	private CanvasjsChartDao2 canvasjsChartDao2;
 
	public void setCanvasjsChartDao2(CanvasjsChartDao2 canvasjsChartDao2) {
		this.canvasjsChartDao2 = canvasjsChartDao2;
	}
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData2() {
		return canvasjsChartDao2.getCanvasjsChartData2();
	}
 
}