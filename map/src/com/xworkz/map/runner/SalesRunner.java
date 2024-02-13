package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class SalesRunner {

	public static void main(String[] args) {
		
		Map<String,String> sales=new HashMap<String,String>();
		
		sales.put("neha@gmail.com","neha");
		sales.put("mansa@gmail.com","mansa");
		sales.put("ruchita@gmail.com","ruchitha");
		sales.put("nandana@gmail.com","nandana");
		sales.put("vani@gmail.com","vani");
		sales.put("hita@gamil.com","hita");
		sales.put("raksha@gmail.com","raksha");
		sales.put("tilak@gmail.com","tilak");
		sales.put("nitin@gmail.com","nitin");
		sales.put("nayna@gmail.com","nayna");
		
		System.out.println(sales);
		
		System.out.println("contains method by key is:"+sales.containsKey("hita@gamil.com"));
		
		System.out.println("contains method by value is:"+sales.containsValue("neha"));
		
		System.out.println("size is:"+sales.size());
		
		System.out.println("equlas method is:"+sales.equals(sales));
		
		System.out.println("get method is:"+sales.get("mansa@gmail.com"));
		
		System.out.println("put if absent:"+sales.putIfAbsent("nitika@gmail.com","nitika"));
		
		System.out.println("key set method is:"+sales.keySet());
		
		System.out.println("value method is:"+sales.values());
		
		System.out.println("remove method is:"+sales.remove("tilak@gmail.com"));
		
		sales.clear();
		System.out.println(sales);
	}
}
