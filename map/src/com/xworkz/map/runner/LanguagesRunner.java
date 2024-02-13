package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class LanguagesRunner {
public static void main(String[] args) {
	
	Map<Integer,String> map=new HashMap<Integer,String>();
	map.put(1,"hindi");
	map.put(2,"kannada");
	map.put(3,"english");
	map.put(4,"malyalum");
	map.put(5,"tamil");
	map.put(6,"telugu");
	map.put(7,"japanese");
	map.put(8,"korean");
	map.put(9,"panjabi");
	map.put(10,"urdu");
	
	System.out.println(map);
	
	 System.out.println("contains by value:"+map.containsValue("urdu"));
		
		System.out.println("contains by key:"+map.containsKey(4));
		
		System.out.println("empty method is:"+map.isEmpty());
		
		System.out.println("key set is:"+map.keySet());
		
		System.out.println("value is:"+map.values());
		
		System.out.println("remove method:"+map.remove(1));
		
		System.out.println("size is:"+map.size());
		
		System.out.println("get method is:"+map.get(2));
		
		System.out.println("put if absent:"+map.putIfAbsent(11,"marati"));
		
		System.out.println(map);
		
		System.out.println("equals method is:"+map.equals(map));
		
		map.clear();
		
		System.out.println(map);
}
}
