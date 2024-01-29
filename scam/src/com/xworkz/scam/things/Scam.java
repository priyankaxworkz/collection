package com.xworkz.scam.things;

import java.time.LocalDate;
import java.util.Comparator;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Scam implements Comparator<Scam> {

	private String nameOfScam;
	private int numberOfScam;
	private String scamingArea;
	private LocalDate date;
	private boolean isOnlineScam;
	
	@Override
	public int compare(Scam o1, Scam o2) {
		System.out.println("this is comparator method");
		return 0;
	}
	
	

}
