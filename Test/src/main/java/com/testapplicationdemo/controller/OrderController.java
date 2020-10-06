package com.testapplicationdemo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.testapplicationdemo.Repository.OrderRepository;
import com.testapplicationdemo.model.CustomerOrder;


@RestController
public class OrderController {

	@Autowired
	public OrderRepository orderRepository;
	
	
	@PostMapping(value="/save")
	public String insertData(@RequestBody CustomerOrder c) {
		orderRepository.save(c);
		return "Inserted Successfully";
	}
	
}
