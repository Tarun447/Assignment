package com.example.demo;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "Employee")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	@Id
	private int id;
	@Field
	private  String employeename;
	@Field
	private String employeedept;
	@Field
	private String employeedesg;
	@Field
	private int salary;
}
