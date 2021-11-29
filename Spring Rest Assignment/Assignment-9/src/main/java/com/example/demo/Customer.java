package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "Customer")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customer {

	@Id
	private int id;
	@Field
    private String customerName;
	@Field
    private String customerMail;
	@Field
    private int customerPhoneNum;
	@Field
    private String gender;
	
}
