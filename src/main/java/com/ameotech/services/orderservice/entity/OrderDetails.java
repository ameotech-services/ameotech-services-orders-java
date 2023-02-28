package com.ameotech.services.orderservice.entity;

import ameotech.services.common.models.*;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
@Entity
@Table(name="tblorderdetails")
public class OrderDetails extends BaseModel{


@Column(name="amount")
private double amount;

@Column(name="no_of_serving")
private int servings;

@Column(name="total_amount")
private double totalAmount;

@Column(name="order_id")
private int orderId;

@Column(name="menu_id")
private int menuId;

@Column(name="item_id")
private int itemId;

public OrderDetails() {
	super();
	// TODO Auto-generated constructor stub
}

public OrderDetails(long orderDetalsId, double amount, int servings, double totalAmount, int orderId, int menuId,
		 int itemId) {
	super();
	this.id = orderDetalsId;
	this.amount = amount;
	this.servings = servings;
	this.totalAmount = totalAmount;
	this.orderId = orderId;
	this.menuId = menuId;
	this.itemId = itemId;
}

public double getAmount() {
	return amount;
}

public void setAmount(double amount) {
	this.amount = amount;
}

public int getServings() {
	return servings;
}

public void setServings(int servings) {
	this.servings = servings;
}

public double getTotalAmount() {
	return totalAmount;
}

public void setTotalAmount(double totalAmount) {
	this.totalAmount = totalAmount;
}

public int getOrderId() {
	return orderId;
}

public void setOrderId(int orderId) {
	this.orderId = orderId;
}

public int getMenuId() {
	return menuId;
}

public void setMenuId(int menuId) {
	this.menuId = menuId;
}

public int getItemId() {
	return itemId;
}

public void setItemId(int itemId) {
	this.itemId = itemId;
}

@Override
public String toString() {
	return "OrderDetails [amount=" + amount + ", servings=" + servings + ", totalAmount=" + totalAmount + ", orderId="
			+ orderId + ", menuId=" + menuId + ", itemId=" + itemId + ", id=" + id + ", tenantCode=" + tenantCode
			+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
}




}
