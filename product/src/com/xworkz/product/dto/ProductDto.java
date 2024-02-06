package com.xworkz.product.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class ProductDto {

	private  String productName;
	private int productCode;
	private int noOfProduct;
}
