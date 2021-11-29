package com.example.demo;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "Product")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

	private int pId;
	private String productName;
	private String productStatus;
}
