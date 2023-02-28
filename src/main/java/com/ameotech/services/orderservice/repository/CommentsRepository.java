package com.ameotech.services.orderservice.repository;

import java.util.List;

import com.ameotech.services.orderservice.entity.Comments;

import ameotech.services.common.repos.BaseRepository;

public interface CommentsRepository extends BaseRepository<Comments, Integer> {

	List<Comments> findByPlacedOrderId(int orderId);
	
	List<Comments> findByCustomerId(int customerId);
}
