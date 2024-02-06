package com.xworkz.event.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class EventDto {

	private String eventName;
	private String location;
	private String nameOfGuest;
}
