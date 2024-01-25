package com.xworkz.coffee.driver;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ListIterator;

import com.xworkz.coffee.things.CoffeeDto;

public class CoffeeRunner {

	public static void main(String[] args) {
		
		CoffeeDto dto=new CoffeeDto();
		dto.setCafeName("malnadCafe");
		dto.setFlavour("chocolate");
		dto.setPrice(20);
		dto.setTasty(true);
		dto.setTotalFlavour(25);
		
		CoffeeDto dto1=new CoffeeDto();
		dto1.setCafeName("mahimaCafe");
		dto1.setFlavour("vanila");
		dto1.setPrice(12);
		dto1.setTasty(true);
		dto1.setTotalFlavour(20);
		
		
		Collection<CoffeeDto> collection=new ArrayList<CoffeeDto>();
		
		collection.add(dto);
		collection.add(dto1);
		System.out.println("collection of dto is:"+collection);
		
		System.out.println("checking the cotains:"+collection.contains(dto1));
        
		System.out.println("checking the equals:"+collection.equals(collection));
		
		System.out.println("checking the empty:"+collection.isEmpty());
		
		System.out.println("removing the element:"+collection.remove(dto1));
		System.out.println(collection);
		
		System.out.println("size method is:"+collection.size());
		
		System.out.println("iterator method is:"+collection.iterator());
		
		System.out.println(collection);
		
		System.out.println("parralle strem method is:"+collection.parallelStream());
		
		System.out.println("spiterator method is:"+collection.spliterator());
		
		System.out.println("stream method is:"+collection.stream());
		
		System.out.println("array method is:"+collection.toArray());
		
	collection.clear();
	System.out.println(collection);
	
	List<CoffeeDto> list=new ArrayList<CoffeeDto>();
	list.add(dto);
	list.add(dto1);
	//System.out.println("list of dto is:"+list);
	
	System.out.println("this is list iterator method");
	ListIterator<CoffeeDto> listiterator=list.listIterator();
	
	while(listiterator.hasNext()) {
		System.out.println("previous index is:"+listiterator.previousIndex());
		System.out.println("next index is:"+listiterator.nextIndex());
		System.out.println("next element is:"+listiterator.next());
	
	//if(listiterator.hasPrevious()) {
		//System.out.println("previous element is:"+listiterator.previous());
//	}
	}
	System.out.println("removing the element");
	listiterator.remove();
	
	}
}
