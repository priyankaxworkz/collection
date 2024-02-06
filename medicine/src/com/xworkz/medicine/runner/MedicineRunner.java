package com.xworkz.medicine.runner;

import java.util.ArrayList;
import java.util.ListIterator;

import com.xworkz.medicine.dto.MedicineDto;

public class MedicineRunner {

	public static void main(String[] args) {
		
		MedicineDto dto=new MedicineDto("dolo",10,"srs");
		
		MedicineDto dto1=new MedicineDto("citrizen",6,"prassana");
		
		ArrayList<MedicineDto> arraylists=new ArrayList<MedicineDto>();
		arraylists.add(dto);
		arraylists.add(dto1);
		System.out.println(arraylists);
		
		System.out.println(arraylists.contains(dto));
		
		System.out.println(arraylists.equals(arraylists));
		
		System.out.println(arraylists.indexOf(dto1));
		
		System.out.println(arraylists.isEmpty());
		
		System.out.println(arraylists.lastIndexOf(dto1));
		
		//System.out.println(arraylists.remove(dto));
		
		System.out.println(arraylists.size());
		System.out.println(arraylists.get(0));
		
		//System.out.println(arraylists.set(1, dto));
		
		System.out.println(arraylists.iterator());
		
		System.out.println(arraylists.listIterator());
		
		System.out.println(arraylists.spliterator());
		
		System.out.println(arraylists.subList(0, 1));
		
		arraylists.ensureCapacity(5);
		
		arraylists.forEach((s)->System.out.println(s));
		
		arraylists.trimToSize();
		
		//arraylists.clear();
		System.out.println(arraylists);
		
	ListIterator<MedicineDto> listiterator=arraylists.listIterator();
	while(listiterator.hasNext()) {
		System.out.println(listiterator.previousIndex());
		System.out.println(listiterator.nextIndex());
		System.out.println(listiterator.next());
	
	
	//if(listiterator.hasPrevious()) {
	//	System.out.println(listiterator.previous());
//	}
	}
	
	}
}
