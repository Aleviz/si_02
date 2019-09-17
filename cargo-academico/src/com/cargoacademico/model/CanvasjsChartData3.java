package com.cargoacademico.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class CanvasjsChartData3 {
 
	static Map<Object,Object> map = null;
	static List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
	static List<Map<Object,Object>> dataPoints1 = new ArrayList<Map<Object,Object>>();
	
	static {
		map = new HashMap<Object,Object>(); map.put("name", "Overhead"); map.put("y", 9.1);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("name", "Problem Solving"); map.put("y", 3.7);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("name", "Debugging"); map.put("y", 36.4);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("name", "Writing Code"); map.put("y", 30.7);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("name", "Firefighting"); map.put("y", 20.1);dataPoints1.add(map);
		
		list.add(dataPoints1);
	}
 
	public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
		return list;
	}
}         