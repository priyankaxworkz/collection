package com.xworkz.entertainment.runner;



import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.entertainment.things.Entertainment;

public class EntertainmentRunner {

	public static void main(String[] args) {
		
		Entertainment entertainment=new Entertainment("kabbadi","akash",LocalDate.now(),"karwar","rohith");
		
		List<Entertainment> list=new ArrayList<Entertainment>();
		list.add(entertainment);
		list.add(new Entertainment("Cricket","cfc",LocalDate.of(2024,02,12),"banglore","siddarmayya"));
		list.add(new Entertainment("Rangoli","ladiesclub",LocalDate.of(2024, 03, 24),"Mysore","kavya"));
		list.add(new Entertainment("food fest","sandyainstitue",LocalDate.of(2023, 11, 26),"banglore","manger"));
		list.add(new Entertainment("Holi","manipalinsitute",LocalDate.of(2024,04, 26),"manipal","anjali"));
		list.add(new Entertainment("spectrum","studentwelfarecouncil",LocalDate.of(2023,06,13),"udupi","principle"));
		list.add(new Entertainment("circus","global",LocalDate.of(2022,01, 24),"bhtkal","organization"));
		list.add(new Entertainment("streetDance","dancegroup",LocalDate.of(2023,12,04),"murdeswara","rudra"));
		list.add(new Entertainment("collegeFest","smsCollege",LocalDate.of(2024,02, 15),"brhmavar","collegeManagement"));
		list.add(new Entertainment("onam","college",LocalDate.of(2024,06, 12),"kerala","lectures"));
		
		System.out.println(list);
		
		list.sort(Comparator.comparing(Entertainment::getNameOfEvent));
		list.sort(Comparator.comparing(Entertainment::getDate).reversed());
		list.sort(Comparator.comparing(Entertainment::getLocation));
		
		System.out.println(list);
	}

}
