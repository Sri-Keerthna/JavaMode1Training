package com.hcl.collections;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
public static void main(String[] args) {
	Map m=new HashMap();
	m.put("priya", "dharshini");
	m.put("laksh", "babbar");
	m.put("sri", "keerthi");
	m.put("kiruba", "lakshmi");
	
	String key="priya";
	String value=(String)m.getOrDefault(key, "notf found");
	System.out.println(value);
}
}
