package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class AppsRunner {

	public static void main(String[] args) {
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		map.put(1,"linkdin");
		map.put(2,"naukri");
		map.put(3,"phone pay");
		map.put(4,"youtube");
		map.put(5,"google");
		map.put(6,"gallery");
		map.put(7,"getapps");
		map.put(8,"playstore");
		map.put(9,"whatsapp");
		map.put(10,"facebook");
		
		System.out.println(map);
		
       System.out.println("contains by value:"+map.containsValue("playstore"));
		
		System.out.println("contains by key:"+map.containsKey(6));
		
		System.out.println("empty method is:"+map.isEmpty());
		
		System.out.println("key set is:"+map.keySet());
		
		System.out.println("value is:"+map.values());
		
		System.out.println("remove method:"+map.remove(1));
		
		System.out.println("size is:"+map.size());
		
		System.out.println("get method is:"+map.get(6));
		
		System.out.println("put if absent:"+map.putIfAbsent(11,"apna"));
		
		System.out.println("equals method is:"+map.equals(map));
	}
}
