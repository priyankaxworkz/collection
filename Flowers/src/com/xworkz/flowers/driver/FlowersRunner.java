package com.xworkz.flowers.driver;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.xworkz.flowers.things.Flowers;

public class FlowersRunner {

	public static void main(String[] args) {
		
		Flowers flowers=new Flowers("Jasmin",10,"bhatkal",30,"white");
		
		List<Flowers> listOfFlowers=new ArrayList<Flowers>();
		
		listOfFlowers.add(flowers);
		listOfFlowers.add(new Flowers("Hibiscus",20,"india",20,"orange"));
		listOfFlowers.add(new Flowers("rose",10,"banglore",15,"red"));
		listOfFlowers.add(new Flowers("sunflower",5,"hubali",20,"yellow"));
		
		Collections.sort(listOfFlowers);
		
		System.out.println("list os the flower is:"+listOfFlowers);
	}
}
