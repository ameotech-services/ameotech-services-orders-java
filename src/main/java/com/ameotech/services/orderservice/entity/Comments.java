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
@Table(name="tblcomment")
public class Comments extends BaseModel{
	
	@Column(name="placed_order_id")
	private int placedOrderId;
	@Column(name="customer_id")
	private int customerId;
	@Column(name="comment_text")
	private String commentText;

	public Comments() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Comments(long commentId, int placedOrderId, int customerId, String commentText,String tenantCode, LocalDate createdDate,
			LocalDate updatedTime, int deleted) {
		super();
		this.id = commentId;
		this.placedOrderId = placedOrderId;
		this.customerId = customerId;
		this.commentText = commentText;
		this.createdDate = createdDate;
		this.tenantCode=tenantCode;
		UpdatedTime = updatedTime;
		this.deleted = deleted;
	}
	
	public int getPlacedOrderId() {
		return placedOrderId;
	}
	public void setPlacedOrderId(int placedOrderId) {
		this.placedOrderId = placedOrderId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCommentText() {
		return commentText;
	}
	public void setCommentText(String commentText) {
		this.commentText = commentText;
	}
	@Override
	public String toString() {
		return "Comments [placedOrderId=" + placedOrderId + ", customerId=" + customerId + ", commentText="
				+ commentText + ", id=" + id + ", tenantCode=" + tenantCode + ", createdDate=" + createdDate
				+ ", UpdatedTime=" + UpdatedTime + ", deleted=" + deleted + "]";
	}
	
	
	
}
