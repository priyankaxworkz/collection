package com.xworkz.flowers.things;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Flowers implements Comparable<Flowers> {

	private String flowerName;
	private int noOfFlowers;
	private String location;
	private int price;
	private String color;
	
	@Override
	public int compareTo(Flowers o) {
		System.out.println("this is compare to method");
		
		//sorting the string values
		int flowerName=this.flowerName.compareTo(o.flowerName);
		System.out.println("flowerName is:"+flowerName);
		return flowerName;
		
		//sorting the integer values
		//int value=this.price-o.price;
		//return value;
	}

}
