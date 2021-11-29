package com.example.demo;





import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collation = "Order")
//@Entity
//@Table(name="ORDER_TB")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Order {

	@Id
	private int id;
	private String name;
	private double price;
	private int qty;
}
