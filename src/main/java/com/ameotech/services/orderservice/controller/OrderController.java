package com.ameotech.services.orderservice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ameotech.services.orderservice.entity.orders;
import com.ameotech.services.orderservice.service.OrderService;

@RestController
@RequestMapping("/api/orders")
public class OrderController {
	@Autowired
	private OrderService _orderService;

	@GetMapping("/allorders")
	public ResponseEntity<List<orders>> getallorders() {
		List<orders> orders = null;
		try {
			orders = _orderService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<orders>>(orders, HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{orderId}")
	public ResponseEntity<orders> getbyid(@PathVariable("orderId")int orderId) {
		orders order = null;
		try {
			order = _orderService.GetById(orderId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<orders>(order, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<orders> addupdateorder(@RequestBody orders order){
		orders _order = null;
		try {
			_order= _orderService.AddUpdate(order);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<orders>(_order, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteorder/{orderId}")
	public ResponseEntity<orders> deleteOrder(@PathVariable("orderId")int orderId) {
		orders order = null;
		try {
			order = _orderService.Delete(orderId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<orders>(order, HttpStatus.OK);
	}
}
