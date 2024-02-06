package com.xworkz.event.runner;

import java.util.HashSet;
import java.util.LinkedHashSet;

import com.xworkz.event.dto.EventDto;

public class EventRunner {

	public static void main(String[] args) {
		
		EventDto dto=new EventDto("kabbadi","kundapura","ankul");
		
		EventDto dto1=new EventDto("volleyball","murdeswara","akash");
		
		HashSet<EventDto> hashsets=new HashSet<EventDto>();
		
		System.out.println(hashsets.size());
		hashsets.add(dto);
		hashsets.add(dto1);
		
		System.out.println(hashsets);
		
		System.out.println(hashsets.contains(dto));
		
		System.out.println(hashsets.isEmpty());
		
		System.out.println(hashsets.remove(dto));
		
		System.out.println(hashsets.iterator());
		
		System.out.println(hashsets.spliterator());
		
		//hashsets.clear();
		
		
		LinkedHashSet<EventDto> linkedhashSets=new LinkedHashSet<EventDto>();
		System.out.println(linkedhashSets.spliterator());
		
		
	}
}
