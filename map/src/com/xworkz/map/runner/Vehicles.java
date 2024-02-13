package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class Vehicles {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"bus");
		map.put(2,"bycycle");
		map.put(3,"car");
		map.put(4,"scotty");
		map.put(5,"bike");
		map.put(6,"train");
		map.put(7,"school bus");
		map.put(8,"jeep");
		map.put(9,"boat");
		map.put(10, "ambulence");
		
		System.out.println(map);
		
		 System.out.println("contains by value:"+map.containsValue("train"));
			
			System.out.println("contains by key:"+map.containsKey(6));
			
			System.out.println("empty method is:"+map.isEmpty());
			
			System.out.println("key set is:"+map.keySet());
			
			System.out.println("value is:"+map.values());
			
			System.out.println("remove method:"+map.remove(1));
			
			System.out.println("size is:"+map.size());
			
			System.out.println("get method is:"+map.get(6));
			
			System.out.println("put if absent:"+map.putIfAbsent(11,"bullettrain"));
			
			System.out.println(map);
			
			System.out.println("equals method is:"+map.equals(map));
	}
}
