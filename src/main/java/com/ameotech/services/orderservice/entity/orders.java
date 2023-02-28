package com.ameotech.services.orderservice.entity;
import ameotech.services.common.models.*;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name="tblorder")
public class orders extends BaseModel {


@Column(name="order_date")
private LocalDate orderDate;

@Column (name="order_status")
private String orderStatus;

@Column(name="processed_by")
private int processedBy;

@Column(name="customer_id")
private int customerId;

@Column(name="location_id")
private int LocationId;

@Column(name="quantity")
private int quantity;

public orders() {
	super();
	// TODO Auto-generated constructor stub
}

public LocalDate getOrderDate() {
	return orderDate;
}

public void setOrderDate(LocalDate orderDate) {
	this.orderDate = orderDate;
}

public String getOrderStatus() {
	return orderStatus;
}

public void setOrderStatus(String orderStatus) {
	this.orderStatus = orderStatus;
}

public int getProcessedBy() {
	return processedBy;
}

public void setProcessedBy(int processedBy) {
	this.processedBy = processedBy;
}

public int getCustomerId() {
	return customerId;
}

public void setCustomerId(int customerId) {
	this.customerId = customerId;
}



public int getLocationId() {
	return LocationId;
}

public void setLocationId(int locationId) {
	LocationId = locationId;
}

public int getQuantity() {
	return quantity;
}

public void setQuantity(int quantity) {
	this.quantity = quantity;
}



public orders(Long id, String tenantCode, LocalDate createdDate, LocalDate updatedTime, int deleted,
		LocalDate orderDate, String orderStatus, int processedBy, int customerId, int locationId, int quantity) {
	super(id, tenantCode, createdDate, updatedTime, deleted);
	this.orderDate = orderDate;
	this.orderStatus = orderStatus;
	this.processedBy = processedBy;
	this.customerId = customerId;
	LocationId = locationId;
	this.quantity = quantity;
}

@Override
public String toString() {
	return "orders [orderDate=" + orderDate + ", orderStatus=" + orderStatus + ", processedBy=" + processedBy
			+ ", customerId=" + customerId + ", LocationId=" + LocationId + ", quantity=" + quantity + ", id=" + id
			+ ", tenantCode=" + tenantCode + ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime
			+ ", deleted=" + deleted + "]";
}



}

