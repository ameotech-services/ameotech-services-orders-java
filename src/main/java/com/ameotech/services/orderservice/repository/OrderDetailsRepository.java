package com.ameotech.services.orderservice.repository;

import org.springframework.stereotype.Repository;

import com.ameotech.services.orderservice.entity.OrderDetails;

import ameotech.services.common.repos.BaseRepository;

@Repository
public interface OrderDetailsRepository extends BaseRepository<OrderDetails, Integer> {
	
	OrderDetails findByOrderId(int orderId);
}
