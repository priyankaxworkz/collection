package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class ZooRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> zoo=new HashMap<Integer,String>();
		zoo.put(1,"amirthi Zoological Park");
		zoo.put(2,"Bannerghata");
		zoo.put(3,"Arignar Anna");
		zoo.put(4,"vandalur");
		zoo.put(5,"Bondla wildlife");
		zoo.put(6,"chattirbir zoo");
		zoo.put(7,"hisra deer park");
		zoo.put(8,"kurukshetra Zoo");
		zoo.put(9,"mysore Zoo");
		zoo.put(10,"Rohtak zoo");
		
		System.out.println("name od the zoo:"+zoo);
		
		System.out.println("contains using key:"+zoo.containsKey(3));
		
		System.out.println("contains using value:"+zoo.containsValue("Rohtak zoo"));
	//	System.out.println(zoo);
		
		System.out.println("Empty method is:"+zoo.isEmpty());
		
		System.out.println("size is:"+zoo.size());
		
		System.out.println("equals method:"+zoo.equals(zoo));
		
		System.out.println("set the value:"+zoo.putIfAbsent(11,"panna"));
		System.out.println(zoo);
		
		System.out.println("set the value:"+zoo.putIfAbsent(10,"Rohtak zoo"));
		
		System.out.println("get method:"+zoo.get(5));
		
		System.out.println("set method:"+zoo.keySet());
		
		System.out.println("values method:"+zoo.values());
		
		System.out.println("remove method:"+zoo.remove(7));
		System.out.println(zoo);
		
		System.out.println("remove method:"+zoo.remove(1,"amirthi Zoological Park"));
		System.out.println(zoo);
		
		zoo.clear();
		System.out.println(zoo);
		
	}
}
