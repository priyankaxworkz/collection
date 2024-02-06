package com.xworkz.product.runner;

import java.util.LinkedList;
import java.util.ListIterator;


import com.xworkz.product.dto.ProductDto;

public class ProductRunner {

	public static void main(String[] args) {
		
		ProductDto dto=new ProductDto("syrup",67895,250);
		ProductDto dto1=new ProductDto("medicine",676795,200);
		
		LinkedList<ProductDto> linkedList=new LinkedList<ProductDto>();
		linkedList.add(dto);
		linkedList.add(dto1);
		System.out.println(linkedList);
		
		linkedList.add(0, dto1);
		System.out.println(linkedList);
		
		linkedList.addFirst(dto1);
		
		linkedList.addLast(dto);
		
		//linkedList.clear();
		
		System.out.println(linkedList.contains(dto1));
		
		System.out.println(linkedList.equals(linkedList));
		
		System.out.println(linkedList.indexOf(dto));
		
		System.out.println(linkedList.isEmpty());
		
		System.out.println(linkedList.size());
		
		System.out.println(linkedList.element());
		
		System.out.println(linkedList.get(1));
		
		System.out.println(linkedList.peek());
		
		System.out.println(linkedList.pop());
		
		//System.out.println(linkedList.removeFirstOccurrence(dto));
		
		System.out.println(linkedList.getFirst());
		
		System.out.println(linkedList.getLast());
		
		System.out.println(linkedList.removeFirst());
		
		//linkedList.clear();
	
		ListIterator<ProductDto> listiterator=linkedList.listIterator();
		while(listiterator.hasNext()) {
			System.out.println(listiterator.previousIndex());
			System.out.println(listiterator.nextIndex());
			System.out.println(listiterator.next());
		
		
		//if(listiterator.hasPrevious()) {
		//	System.out.println(listiterator.previous());
//		}
		
		}
	}
}
