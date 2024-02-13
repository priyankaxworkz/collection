package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class MovieNamesRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> names=new HashMap<Integer,String>();
		
		names.put(1,"jawan");
		names.put(2,"katera");
		names.put(3,"kgf");
		names.put(4,"animal");
		names.put(5,"upadyaksha");
		names.put(6,"jurasic park");
		names.put(7,"joe");
		names.put(8,"kranthi");
		names.put(9,"ranna");
		names.put(10,"hebuli");
		
		System.out.println("names is:"+names);
		
		System.out.println("contains by value:"+names.containsValue("kgf"));
		
		System.out.println("contains by key:"+names.containsKey(6));
		
		System.out.println("empty method is:"+names.isEmpty());
		
		System.out.println("key set is:"+names.keySet());
		
		System.out.println("value is:"+names.values());
		
		System.out.println("remove method:"+names.remove(1));
		
		System.out.println("size is:"+names.size());
		
		System.out.println("get method is:"+names.get(6));
		
		System.out.println("put if absent:"+names.putIfAbsent(11,"pailwan"));
		
		System.out.println("equals method is:"+names.equals(names));
	}
}
