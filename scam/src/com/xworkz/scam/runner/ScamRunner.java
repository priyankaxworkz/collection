package com.xworkz.scam.runner;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import com.xworkz.scam.things.Scam;

public class ScamRunner {
	public static void main(String[] args) {
		
		Scam scam=new Scam("propertyScam",10,"pune",LocalDate.of(2022, 12, 26),true);
		
		List<Scam> listOfScam=new ArrayList<Scam>();
		listOfScam.add(scam);
		listOfScam.add(new Scam("computerhacking",25,"banglore",LocalDate.of(2023, 11,24),true));
		listOfScam.add(new Scam("onlineShopping",20,"hyderbad",LocalDate.of(2023,12,03),true));
		listOfScam.add(new Scam("robocalls",20,"india",LocalDate.of(2022, 12, 01),true));
		listOfScam.add(new Scam("Upitransaction",10,"india",LocalDate.of(2023,01,14),true));
		listOfScam.add(new Scam("games scam",10,"world",LocalDate.of(1998,12,24),true));
		listOfScam.add(new Scam("Iplscam",10,"india",LocalDate.of(2022,07,12),true));
		listOfScam.add(new Scam("VoiceprintScam",10,"india",LocalDate.of(2024,12,03),true));
		listOfScam.add(new Scam("pensions scam",10,"karnatka",LocalDate.of(2022, 12, 05),false));
		listOfScam.add(new Scam("Tech support scam",10,"india",LocalDate.of(2024,12,03),true));
		
		System.out.println(listOfScam);
		listOfScam.sort(Comparator.comparing(Scam::getNameOfScam));
		listOfScam.sort(Comparator.comparing(Scam::getDate).reversed());
		listOfScam.sort(Comparator.comparing(Scam::getScamingArea));
		listOfScam.sort(Comparator.comparing(Scam::getNumberOfScam));
		System.out.println(listOfScam);
		
	}

}
