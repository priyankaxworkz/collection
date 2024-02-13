package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class TreeRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"banyantree");
		map.put(2,"guvatree");
		map.put(3,"graphes");
		map.put(4,"bannanatree");
		map.put(5,"appletree");
		map.put(6,"mangotree");
		map.put(7,"oaktree");
		map.put(8,"peepaltree");
		map.put(9,"peartree");
		map.put(10, "sandaltree");
		
		System.out.println(map);
		
		 System.out.println("contains by value:"+map.containsValue("sandaltree"));
			
			System.out.println("contains by key:"+map.containsKey(4));
			
			System.out.println("empty method is:"+map.isEmpty());
			
			System.out.println("key set is:"+map.keySet());
			
			System.out.println("value is:"+map.values());
			
			System.out.println("remove method:"+map.remove(1));
			
			System.out.println("size is:"+map.size());
			
			System.out.println("get method is:"+map.get(2));
			
			System.out.println("put if absent:"+map.putIfAbsent(12,"babultreee"));
			
			System.out.println(map);
			
			System.out.println("equals method is:"+map.equals(map));
			
			map.clear();
			
			System.out.println(map);
	}
}
