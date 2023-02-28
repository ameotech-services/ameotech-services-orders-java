package com.ameotech.services.orderservice.entity;

import java.time.LocalDate;


public class orderclass {
	public int orderId;

	public LocalDate orderDate;

	public String orderStatus;

	public int processedBy;

	public int customerId;
	public String teanantCode;

	public LocalDate CreatedDate;

	public LocalDate UpdatedTime;

	public int LocationId;

	public int quantity;
	
	public OrderDetails details;
	
}
