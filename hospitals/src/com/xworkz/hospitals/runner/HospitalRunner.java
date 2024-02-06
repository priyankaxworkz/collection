package com.xworkz.hospitals.runner;

import java.util.ArrayList;
import java.util.List;

import com.xworkz.hospitals.dto.HospitalDto;

public class HospitalRunner {

	public static void main(String[] args) {
		
		HospitalDto dto=new HospitalDto("chinamaya","kundapura",100);
		
		HospitalDto dto1=new HospitalDto("parsanna","mangalore",150);
		List<HospitalDto> lists=new ArrayList<HospitalDto>();
		
		lists.add(dto);
		lists.add(dto1);
		System.out.println(lists);
		
		System.out.println(lists.contains(dto));
		
		System.out.println(lists.equals(dto));
	
		System.out.println(lists.equals(lists));
		
		System.out.println(lists.indexOf(dto1));
		
		System.out.println(lists.isEmpty());
		
		System.out.println(lists.lastIndexOf(dto));
		
		//System.out.println(lists.remove(dto1));
		
		System.out.println(lists);
		
		System.out.println(lists.size());
		
		System.out.println(lists.get(0));
		
		System.out.println(lists.iterator());
		
		System.out.println(lists.spliterator());
		
		System.out.println(lists.listIterator());
		
		System.out.println(lists.listIterator(0));
		
		//System.out.println(lists.set(0, dto1));
		
		System.out.println(lists.subList(0, 1));
		System.out.println(lists);
		
		lists.clear();
		System.out.println(lists);
		
	}
}
