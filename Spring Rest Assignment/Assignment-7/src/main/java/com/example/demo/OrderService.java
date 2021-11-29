package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.order.entity.Order;
import com.order.repository.OrderRepository;

@Service
public class OrderService {

	@Autowired
	private OrderRepository orderRepository;
    
	public Order saveOrder(Order order)
	{
		return orderRepository.save(order);
	}
	
	


}
