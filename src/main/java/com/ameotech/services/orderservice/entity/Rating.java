package com.ameotech.services.orderservice.entity;

import java.time.LocalDate;

import ameotech.services.common.models.BaseModel;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
@Entity
@Table(name="tblrating")
public class Rating extends BaseModel{


@Column(name="score")
private int score;

@Column(name="remarks")
private String remarks;
  
@Column(name="date_recorded")
private LocalDate dateRecorded;

@Column(name="menu_id")
private int menuId;

@Column(name="customer_id")
private int customerId;
public Rating() {
	super();
	// TODO Auto-generated constructor stub
}

public int getScore() {
	return score;
}
public Rating(Long id, String tenantCode, LocalDate createdDate, LocalDate updatedTime, int deleted, int score,
		String remarks, LocalDate dateRecorded, int menuId, int customerId) {
	super(id, tenantCode, createdDate, updatedTime, deleted);
	this.score = score;
	this.remarks = remarks;
	this.dateRecorded = dateRecorded;
	this.menuId = menuId;
	this.customerId = customerId;
}

public void setScore(int score) {
	this.score = score;
}
public String getRemarks() {
	return remarks;
}
public void setRemarks(String remarks) {
	this.remarks = remarks;
}
public LocalDate getDateRecorded() {
	return dateRecorded;
}
public void setDateRecorded(LocalDate dateRecorded) {
	this.dateRecorded = dateRecorded;
}
public int getMenuId() {
	return menuId;
}
public void setMenuId(int menuId) {
	this.menuId = menuId;
}
public int getCustomerId() {
	return customerId;
}
public void setCustomerId(int customerId) {
	this.customerId = customerId;
}

@Override
public String toString() {
	return "Rating [ratingId=" + id + ", score=" + score + ", remarks=" + remarks + ", dateRecorded="
			+ dateRecorded + ", menuId=" + menuId + ", customerId=" + customerId + ", tenantCode=" + tenantCode
			+ ", createdDate=" + createdDate + ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
}

}
