package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class FruitsRunner {

	public static void main(String[] args) {
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"banana");
		map.put(2,"guva");
		map.put(3,"graphes");
		map.put(4,"dates");
		map.put(5,"apple");
		map.put(6,"mango");
		map.put(7,"sapota");
		map.put(8,"muskmelon");
		map.put(9,"pears");
		map.put(10,"watermelon");
		
		System.out.println(map);
		
		 System.out.println("contains by value:"+map.containsValue("pears"));
			
			System.out.println("contains by key:"+map.containsKey(2));
			
			System.out.println("empty method is:"+map.isEmpty());
			
			System.out.println("key set is:"+map.keySet());
			
			System.out.println("value is:"+map.values());
			
			System.out.println("remove method:"+map.remove(1));
			
			System.out.println("size is:"+map.size());
			
			System.out.println("get method is:"+map.get(2));
			
			System.out.println("put if absent:"+map.putIfAbsent(11,"papaya"));
			
			System.out.println(map);
			
			System.out.println("equals method is:"+map.equals(map));
			
			map.clear();
			
			System.out.println(map);
	}
}
