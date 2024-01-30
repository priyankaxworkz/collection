package com.xworkz.cards.runner;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class ArrayLists {
	public static void main(String[] args) {
		
		ArrayList<String> arrayList=new ArrayList<String>();
		 arrayList.add("hindi");
		 arrayList.add("kannada");
		 arrayList.add("english");
		 arrayList.add("telugu");
		 
		 System.out.println( arrayList);
		 
		 System.out.println( arrayList.addAll(arrayList));
		 
		 System.out.println( arrayList.addAll(3,arrayList));
		 
		 System.out.println(arrayList.clone());
		 
		 System.out.println(arrayList.contains("hindi"));
		 
		 System.out.println(arrayList.containsAll(arrayList));
		 
		 System.out.println(arrayList.equals(arrayList));
		 
		 System.out.println(arrayList.get(3));
		 System.out.println(arrayList.hashCode());
		 
		 System.out.println(arrayList.indexOf("telugu"));
		 
		 System.out.println(arrayList.isEmpty());
		 
		 System.out.println(arrayList.lastIndexOf(arrayList));
		 
		// System.out.println(arrayList.remove(0));
		 
		// System.out.println(arrayList.remove(arrayList));
		 
		// System.out.println(arrayList.removeAll(arrayList));
		 
		 System.out.println(arrayList.set(3, "malyalaum"));
		 
		 System.out.println(arrayList.size());
		 
		 System.out.println(arrayList.iterator());
		 
		 System.out.println(arrayList.spliterator());
		 
		 System.out.println(arrayList.listIterator(2));
		 System.out.println(arrayList.listIterator());
		 
		 System.out.println(arrayList.spliterator());
		 
		 System.out.println(arrayList.subList(0, 3));
		 System.out.println(arrayList.toArray());
		 
		// arrayList.clear();
		 
		arrayList.ensureCapacity(10);
		arrayList.forEach((s)->System.out.println(s));
		
		arrayList.trimToSize();
		
Iterator<String> iterator=arrayList.iterator();
		
		iterator.forEachRemaining((s)->System.out.println(s));
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		} 
		
ListIterator<String> listiterator=arrayList.listIterator();
		
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


