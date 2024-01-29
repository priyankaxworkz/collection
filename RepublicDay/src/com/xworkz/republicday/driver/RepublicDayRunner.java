package com.xworkz.republicday.driver;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.List;

import com.xworkz.republicday.things.RepublicDay;

public class RepublicDayRunner {

	public static void main(String[] args) {
		
		System.out.println("main method is running");
		
	//	RepublicDay republicDay=new RepublicDay("yathnal","belgavi",15,"2024-01-26","narendra modi","siddarmaya");
		List<RepublicDay> list=new ArrayList<RepublicDay>();
		//list.add(republicDay);
		list.add(new RepublicDay("mankala","uttarkannada",25,new Date(),"narendra modi","siddarmaya"));
		list.add(new RepublicDay("m.krasnappa","banglore",50,new Date(),"narendra modi","siddarmaya"));
		
		Collections.sort(list);
		System.out.println("list of republic day is:"+list);
		
		//using local date
		System.out.println(LocalDate.now());
		System.out.println(LocalDateTime.now());
	}
}
