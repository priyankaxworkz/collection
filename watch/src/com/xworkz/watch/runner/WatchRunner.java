package com.xworkz.watch.runner;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.xworkz.watch.dto.WatchDto;

public class WatchRunner {

	public static void main(String[] args) {
		
		WatchDto watchdto=new WatchDto("Omegasa",1247600,"omega",4.9,'m',true);
		WatchDto watchdto1=new WatchDto("Beritlingsa",311600,"Beritling",4.9,'m',true);
		WatchDto watchdto2=new WatchDto("titan",6995,"fastrack",4.8,'s',true);
		WatchDto watchdto3=new WatchDto("royaloak",30000,"royal",4.8,'s',true);
		WatchDto watchdto4=new WatchDto("cartierinternational snc",45000,"cartier",4.7,'m',true);
	List<WatchDto> list=new ArrayList<WatchDto>();
//		list.add(watchdto);
//		list.add(watchdto1);
//		list.add(watchdto2);
	//	list.add(new WatchDto("royaloak",30000,"royal",4.8,'s',true));
		//list.add(new WatchDto("cartierinternational snc",45000,"cartier",4.7,'m',true));
		list.add(new WatchDto("samsung",60000,"apple",4.8,'l',true));
		list.add(new WatchDto("audemars",4700000,"royaloak",4.9,'s',true));
		list.add(new WatchDto("plorf",50000,"tisto",4.6,'s',true));
		list.add(new WatchDto("technicalprecision",45000,"citizen",4.8,'s',true));
		list.add(new WatchDto("sporty",43000,"tagheuer",4.9,'s',true));
		
		System.out.println("list is :"+list);
		
		ArrayList<WatchDto> arrayList=new ArrayList<WatchDto>();
		arrayList.add(watchdto);
		arrayList.add(watchdto1);
		arrayList.add(watchdto2);
		arrayList.add(watchdto3);
		arrayList.add(watchdto4);
		
		System.out.println("array list is:"+arrayList);
		
		System.out.println(arrayList.contains(watchdto4));
		
		System.out.println(arrayList.equals(arrayList));
		
		int value=arrayList.hashCode();
		System.out.println("hashcode value is:"+value);
		
		System.out.println(arrayList.indexOf(watchdto3));
		
		System.out.println(arrayList.isEmpty());
		
		System.out.println(arrayList.lastIndexOf(watchdto4));

	//	System.out.println(arrayList.remove(watchdto4));
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.size());
		
		System.out.println(arrayList.get(3));
		
		System.out.println(arrayList.iterator());
		
		System.out.println(arrayList.listIterator());
		
		System.out.println(arrayList.listIterator(0));
		
	//	System.out.println(arrayList.remove(0));
		
		//System.out.println(arrayList.set(0, watchdto3));
		
		System.out.println(arrayList);
		
		System.out.println(arrayList.subList(0, 3));
		
		//arrayList.clear();
		//System.out.println(arrayList);
		
	//	System.out.println(arrayList.ensureCapacity(5));
		
		arrayList.forEach((m)->System.out.println(m));
		
		System.out.println(arrayList.toArray());
		
	//	arrayList.sort(null);
		
	arrayList.trimToSize();
	
	arrayList.sort(Comparator.comparing(WatchDto::getCompanyName));
	
	System.out.println("sorted by name:"+arrayList);
	
    arrayList.sort(Comparator.comparing(WatchDto::getPrice));
    System.out.println("sorted by price:"+arrayList);
    
    //arrayList.replaceAll(null);
		
	}
}
