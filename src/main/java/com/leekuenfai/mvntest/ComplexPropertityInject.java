package com.leekuenfai.mvntest;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class ComplexPropertityInject {

	private String[] arrs;
	private List list;
	private Map<String,String> map;
	private Properties property;
	
	public String[] getArrs() {
		return arrs;
	}
	public List getList() {
		return list;
	}
	public Map<String, String> getMap() {
		return map;
	}
	public Properties getProperty() {
		return property;
	}
	public void setArrs(String[] arrs) {
		this.arrs = arrs;
	}
	public void setList(List list) {
		this.list = list;
	}
	public void setMap(Map<String, String> map) {
		this.map = map;
	}
	public void setProperty(Properties property) {
		this.property = property;
	}
	
	public void printeach() {
		System.out.println("arrs" + arrs.toString());
		System.out.println("list" + list.toString());
		System.out.println("map" + map.toString());
		System.out.println("property" + property.toString());
	}
}
