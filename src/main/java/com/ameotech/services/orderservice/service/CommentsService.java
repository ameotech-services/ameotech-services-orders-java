package com.ameotech.services.orderservice.service;

import java.util.List;

import com.ameotech.services.orderservice.entity.Comments;

import ameotech.services.common.interfaces.IBaseService;
public interface CommentsService extends IBaseService<Comments>{	
	public List<Comments> getCommentsbyOrderId(int orderId);
	public List<Comments> getCommentsbyCustomerId(int customerId);
}
