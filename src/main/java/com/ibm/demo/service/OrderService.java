package com.ibm.demo.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import com.ibm.demo.entity.Order;
import com.ibm.demo.repo.OrderRepository;


@Service
public class OrderService { // Spring Beans
	@Autowired
	OrderRepository orderRepository;
	public String createOrder(@RequestBody Order order) {
		Order savedOrder = orderRepository.save(order);
		return savedOrder.getId();
	}

	public List<Order> getOrders() {
		return orderRepository.findAll();
	}

	public void updateOrder(int orderId) {
	}

	public void deleteOrder(int orderId) {
		System.out.println("order deleted");
	}

	public Optional<Order> getOrder(String orderId){
		return orderRepository.findById(orderId);
	}
}