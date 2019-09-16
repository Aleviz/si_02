package com.cargoacademico.dao;

import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cargoacademico.model.CanvasjsChartData3;
 
@Repository
@Transactional
public class CanvasjsChartDaoImpl3 implements CanvasjsChartDao3 {
 
	@Override
	public List<List<Map<Object, Object>>> getCanvasjsChartData3() {
		return CanvasjsChartData3.getCanvasjsDataList();
	}
 
}     