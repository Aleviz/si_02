package com.cargoacademico.model;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
 
public class CanvasjsChartData2 {
 
	static Map<Object,Object> map = null;
	static List<List<Map<Object,Object>>> list = new ArrayList<List<Map<Object,Object>>>();
	static List<Map<Object,Object>> dataPoints1 = new ArrayList<Map<Object,Object>>();
	
	static {
		map = new HashMap<Object,Object>(); map.put("label", "Mount Everest"); map.put("y", 8848);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "K2"); map.put("y", 8611);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Kangchenjunga"); map.put("y", 8586);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Lhotse"); map.put("y", 8516);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Makalu"); map.put("y", 8485);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Cho Oyu"); map.put("y", 8201);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Dhaulagiri"); map.put("y", 8167);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Manaslu"); map.put("y", 8163);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Nanga Parbat"); map.put("y", 8126);dataPoints1.add(map);
		map = new HashMap<Object,Object>(); map.put("label", "Annapurna"); map.put("y", 8091);dataPoints1.add(map);
		
		list.add(dataPoints1);
	}
 
	public static List<List<Map<Object, Object>>> getCanvasjsDataList() {
		return list;
	}
} 