package com.ibm.demo;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class OrderController {
	@PostMapping("/order")
	String order() {
		return "Order";
	}
	@GetMapping("/order")
	String getOrder() {
		return "order created";	
	}
	@PutMapping("/order/{id}")
	String updateOrder(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "Order Update";	
	}
	@DeleteMapping("/order/{id}")
	String deleteOrder(@PathVariable("id") int orderId) {
		System.out.println(orderId);
		return "Order deleted";
		
	}
	
}
