package com.xworkz.medicine.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class MedicineDto {

	private String medicineName;
	private int price;
	private String clinicName;
}
