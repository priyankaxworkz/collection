package com.xworkz.cards.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;



public class Cards {

	public static void main(String[] args) {
		
		
		Iterable<String> cards=new ArrayList<String>(10);
		
		cards.forEach((s)->System.out.println(s));
		
		System.out.println(cards.iterator());
		System.out.println(cards.spliterator());
		
		List<String> list=new ArrayList<String>();
		list.add("atm");
		list.add("debit");
		list.add("crdit");
		list.add("pan");
		list.add("adhar");
		System.out.println(list);
		
		//iterator
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

