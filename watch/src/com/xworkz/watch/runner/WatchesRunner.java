package com.xworkz.watch.runner;

import java.util.Comparator;
import java.util.LinkedList;

import com.xworkz.watch.dto.WatchDto;

public class WatchesRunner {

	public static void main(String[] args) {

		WatchDto watchdto=new WatchDto("Omegasa",1247600,"omega",4.9,'m',true);
		System.out.println(watchdto.toString());
		WatchDto watchdto1=new WatchDto("Beritlingsa",311600,"Beritling",4.9,'m',true);
		System.out.println(watchdto1.toString());
		WatchDto watchdto2=new WatchDto("titan",6995,"fastrack",4.8,'s',true);
		System.out.println(watchdto2);
		WatchDto watchdto3=new WatchDto("royaloak",30000,"royal",4.8,'s',true);
		System.out.println(watchdto3);
		WatchDto watchdto4=new WatchDto("cartierinternational snc",45000,"cartier",4.7,'m',true);
		System.out.println(watchdto4);
		WatchDto watchdto5=new WatchDto("samsung",60000,"apple",4.8,'l',true);
		System.out.println(watchdto5);
	    WatchDto watchdto6=new WatchDto("audemars",4700000,"royaloak",4.9,'s',true);
	    System.out.println(watchdto6);
	    WatchDto watchdto7=new WatchDto("plorf",50000,"tisto",4.6,'s',true);
	    System.out.println(watchdto7);
	    WatchDto watchdto8=new WatchDto("technicalprecision",45000,"citizen",4.8,'s',true);
	    System.out.println(watchdto8);
	    WatchDto watchdto9=new WatchDto("sporty",43000,"tagheuer",4.9,'s',true);
	    System.out.println(watchdto9);
	    
	    LinkedList<WatchDto> watchName=new LinkedList<WatchDto>();
	    watchName.add(watchdto);
	    watchName.add(watchdto1);
	    watchName.add(watchdto2);
	    System.out.println("watch name is:"+watchName);
	    
	    watchName.addFirst(watchdto6);
	    
	    System.out.println(watchName);
	    
	    watchName.addLast(watchdto8);
	    System.out.println(watchName);
	    
	    System.out.println(watchName.clone());
	    
	    System.out.println(watchName.contains(watchdto5));
	    
	    System.out.println(watchName.contains(watchdto));
	    
	    System.out.println(watchName.equals(watchName));
	    
	    System.out.println(watchName.indexOf(watchdto7));
	    
	    System.out.println(watchName.indexOf(watchdto1));
	    
	    System.out.println(watchName.lastIndexOf(watchdto9));
	    
	    System.out.println(watchName.lastIndexOf(watchdto2));
	    
	    System.out.println(watchName.offer(watchdto1));
	    
	    System.out.println(watchName.remove(watchdto2));
	    
	    System.out.println(watchName.removeFirstOccurrence(watchdto));
	    
	    System.out.println(watchName.size());
	    
	    System.out.println(watchName.get(0));
	    
	    System.out.println(watchName.set(2, watchdto9));
	    
	   watchName.addFirst(watchdto9);
	   System.out.println(watchName);
	   
	   watchName.sort(Comparator.comparing(WatchDto::getWatchName));
	   System.out.println(watchName);
	   
	   watchName.sort(Comparator.comparing(WatchDto::getPrice));
	   System.out.println(watchName);
	    
	    
	    
	    
	    
	}
}
