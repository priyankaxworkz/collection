package com.xworkz.entertainment.things;

import java.time.LocalDate;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Entertainment  {

	private String nameOfEvent;
	private String organiserName;
	private LocalDate date;
	private String location;
	private String guest;
	
	
}
