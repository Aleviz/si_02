package com.cargoacademico.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.CanvasjsChartData2;
 
@Repository
@Transactional
public class CanvasjsChartDaoImpl2 implements CanvasjsChartDao2 {
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData2() {
		return CanvasjsChartData2.getCanvasjsDataList();
	}
 
}     