package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class FlowersRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"rose");
		map.put(2,"lilly");
		map.put(3,"hibiscus");
		map.put(4,"jasmin");
		map.put(5,"sunflower");
		map.put(6,"dairy");
		map.put(7,"lavendor");
		map.put(8,"marigold");
		map.put(9,"tulip");
		map.put(10,"orchid");
		
		System.out.println(map);
		
		 System.out.println("contains by value:"+map.containsValue("tulip"));
			
			System.out.println("contains by key:"+map.containsKey(4));
			
			System.out.println("empty method is:"+map.isEmpty());
			
			System.out.println("key set is:"+map.keySet());
			
			System.out.println("value is:"+map.values());
			
			System.out.println("remove method:"+map.remove(1));
			
			System.out.println("size is:"+map.size());
			
			System.out.println("get method is:"+map.get(2));
			
			System.out.println("put if absent:"+map.putIfAbsent(11,"elderflower"));
			
			System.out.println(map);
			
			System.out.println("equals method is:"+map.equals(map));
			
			map.clear();
			
			System.out.println(map);
	}
}
