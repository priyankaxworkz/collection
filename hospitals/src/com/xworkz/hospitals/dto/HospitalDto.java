package com.xworkz.hospitals.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class HospitalDto {

	private String hospitalName;
	private String location;
	private int noOfDoctors;
	
}
