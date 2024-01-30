package com.xworkz.cards.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Lists {
	public static void main(String[] args) {
		List<String> list=new ArrayList<String>();
		
		list.add("kabbadi");
		list.add("cricket");
		list.add("khokho");
		list.add("rele");
		list.add("long jump");
		list.add("high jump");
		System.out.println(list);
		
		System.out.println(list.contains(list));
		
		System.out.println(list.containsAll(list));
		
		System.out.println(list.equals(list));
		
		System.out.println(list.addAll(list));
		System.out.println(list);
		
		System.out.println(list.get(3));
		
		System.out.println(list.hashCode());
		
		System.out.println(list.indexOf("high jump"));
		
		System.out.println(list.isEmpty());
		
		System.out.println(list.lastIndexOf(list));
		
		//System.out.println(list.remove(2));
		
	//	System.out.println(list.remove(list));
		
	//	System.out.println(list.removeAll(list));
		
		System.out.println(list.set(3,"chess"));
		
		System.out.println(list.size());
		
		System.out.println(list.iterator());
		
		System.out.println(list.listIterator());
		
		System.out.println(list.listIterator(2));
		
		System.out.println(list.spliterator());
		
		System.out.println(list.subList(0, 4));
		
		System.out.println(list.toArray());
		
		//list.clear();
		
	//	System.out.println(list.sort(null));
		
Iterator<String> iterator=list.iterator();
		
		iterator.forEachRemaining((s)->System.out.println(s));
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		} 
		
ListIterator<String> listiterator=list.listIterator();
		
		while(listiterator.hasNext()) {
			System.out.println("previous index:"+listiterator.previousIndex());
			System.out.println("next index:"+listiterator.nextIndex());
			System.out.println("next element:"+listiterator.next());
			
//			if(listiterator.hasPrevious()) {
//				System.out.println(listiterator.previous());
//			}
	}
			
			//listiterator.set(null);
			//listiterator.forEachRemaining((s)->System.out.println(s));
			
			System.out.println("removing the element");
			listiterator.remove();
			
			//listiterator.forEachRemaining((s)->System.out.println(s));
		
		
		}
		
	}


