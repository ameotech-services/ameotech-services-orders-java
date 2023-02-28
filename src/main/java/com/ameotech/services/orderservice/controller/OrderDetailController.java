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

import com.ameotech.services.orderservice.entity.OrderDetails;
import com.ameotech.services.orderservice.service.OrderDetailsService;

@RestController
@RequestMapping("/api/order-details")
public class OrderDetailController {
	@Autowired
	private OrderDetailsService _orderDetailService;

	@GetMapping("/allorders")
	public ResponseEntity<List<OrderDetails>> getallorders() {
		List<OrderDetails> ordersdetails = null;
		try {
			ordersdetails = _orderDetailService.GetAll();
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<List<OrderDetails>>(ordersdetails, HttpStatus.OK);
	}
	
	@GetMapping("/getbyid/{orderDetailId}")
	public ResponseEntity<OrderDetails> getbyid(@PathVariable("orderDetailId")int orderDetailId) {
		OrderDetails orderdetails = null;
		try {
			orderdetails = _orderDetailService.GetById(orderDetailId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
	}
	
	@PostMapping("/addupdate")
	public ResponseEntity<OrderDetails> addupdateorder(@RequestBody OrderDetails orderDetail){
		OrderDetails _orderDetails = null;
		try {
			_orderDetails= _orderDetailService.AddUpdate(orderDetail);
		}
		catch(Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<OrderDetails>(_orderDetails, HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteorderdetail/{orderDetailId}")
	public ResponseEntity<OrderDetails> deleteOrder(@PathVariable("orderDetailId")int orderDetailId) {
		OrderDetails orderDetail = null;
		try {
			orderDetail = _orderDetailService.Delete(orderDetailId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<OrderDetails>(orderDetail, HttpStatus.OK);
	}
	
	@GetMapping("/getbyOrderId/{orderId}")
	public ResponseEntity<OrderDetails> getbyOrderId(@PathVariable("orderId")int orderId) {
		OrderDetails orderdetails = null;
		try {
			orderdetails = _orderDetailService.getDetailsbyOrderId(orderId);
		} catch (Exception ex) {
			ex.getMessage();
		}
		return new ResponseEntity<OrderDetails>(orderdetails, HttpStatus.OK);
	}
}
