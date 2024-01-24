package com.xworkz.collection.driver;

import java.util.ArrayList;
import java.util.Collection;

public class TestRunner {

	public static void main(String[] args) {
		
		Collection<String> collection=new ArrayList<String>();
		collection.add("java");
		collection.add("Sql");
		collection.add("web");
		collection.add("c");
		collection.add("Jdbc");
		collection.add("Html");
		System.out.println(collection);
		
		collection.forEach((s)->System.out.println(s));
		
		System.out.println("spliterator method:"+collection.spliterator());
		
		System.out.println("contains:"+collection.contains("java"));
		
		System.out.println("equals method:"+collection.equals(collection));
		
		System.out.println("hashcode:"+collection.hashCode());
		
		System.out.println("checking the empty:"+collection.isEmpty());
		
		System.out.println("removing the element:"+collection.remove("java"));
		System.out.println(collection);
		
		System.out.println("size of the collection:"+collection.size());
		
		System.out.println("iterator method:"+collection.iterator());
		System.out.println(collection);
		
		System.out.println("parrallel stream method:"+collection.parallelStream());
		System.out.println(collection);
		
//	int str=collection.hashCode();
//	System.out.println(str);
		System.out.println("stream is:"+collection.stream());
		
		System.out.println("to array is:"+collection.toArray());
		System.out.println(collection);
		
		//System.out.println(collection.toArray());
		
		collection.clear();
		System.out.println("using clear:"+collection);
	}
}
