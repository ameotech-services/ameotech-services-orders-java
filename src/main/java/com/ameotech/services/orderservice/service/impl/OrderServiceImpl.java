package com.ameotech.services.orderservice.service.impl;

import org.springframework.stereotype.Service;
import com.ameotech.services.orderservice.entity.orders;
import com.ameotech.services.orderservice.service.OrderService;
import ameotech.services.common.repos.BaseRepository;
import ameotech.services.common.services.BaseService;
@Service
public class OrderServiceImpl extends BaseService<orders, BaseRepository<orders,Integer>> implements OrderService {
	
}
