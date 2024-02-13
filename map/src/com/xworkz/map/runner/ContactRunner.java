package com.xworkz.map.runner;

import java.util.HashMap;
import java.util.Map;

public class ContactRunner {

	public static void main(String[] args) {
		
		Map<Long,String> number=new HashMap<Long,String>();
		
		number.put(6789765434l,"tilak");
		number.put(8792036739l,"mahesh");
		number.put(9880977023l,"nagratna");
		number.put(9980869950l,"timmappa");
		number.put(8884665632l,"priyanka");
		number.put(6364578745l,"nayana");
		number.put(9878675645l,"malathi");
		number.put(6543213423l,"chandra");
		number.put(9808767867l,"nitin");
		number.put(7656453423l,"nitika");
		
		System.out.println(number);
		
        System.out.println("contains by value:"+number.containsValue("nitin"));
		
		System.out.println("contains by key:"+number.containsKey(9878675645l));
		
		System.out.println("empty method is:"+number.isEmpty());
		
		System.out.println("key set is:"+number.keySet());
		
		System.out.println("value is:"+number.values());
		
		System.out.println("remove method:"+number.remove(6364578745l));
		
		System.out.println("size is:"+number.size());
		
		System.out.println("get method is:"+number.get(7656453423l));
		
		System.out.println("put if absent:"+number.putIfAbsent(9878675615l,"rishith"));
		
		System.out.println("equals method is:"+number.equals(number));
	}
}
