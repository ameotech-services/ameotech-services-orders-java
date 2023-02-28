package com.ameotech.services.orderservice.service.impl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ameotech.services.orderservice.entity.OrderDetails;
import com.ameotech.services.orderservice.repository.OrderDetailsRepository;
import com.ameotech.services.orderservice.service.OrderDetailsService;

import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;
@Service
public class OrderDetailServiceImpl extends BaseService<OrderDetails, BaseRepository<OrderDetails,Integer>> implements OrderDetailsService {
@Autowired
private OrderDetailsRepository _orderDetailsRepo;
	@Override
	public OrderDetails getDetailsbyOrderId(int orderId) {
		OrderDetails _details = null;
		try {
			_details = _orderDetailsRepo.findByOrderId(orderId);
		}
		catch(Exception ex) {
			throw ex;
		}
		return _details;
	}

}
