package com.xworkz.watch.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class WatchDto {

	private String companyName;
	private long price;
	private String watchName;
	private double quality;
	private char size;
	private boolean isGood;
}
