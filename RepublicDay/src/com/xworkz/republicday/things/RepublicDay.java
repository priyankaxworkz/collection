package com.xworkz.republicday.things;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RepublicDay implements Comparable<RepublicDay> {

	private String chiefGuest;
	private String location;
	private int noOfGuest;
	private Date date;
	private String pm;
	private String cmName;
	
	@Override
	public int compareTo(RepublicDay o) {
	System.out.println("this is compare to method");
    return o.date.compareTo(date);
		}

}
