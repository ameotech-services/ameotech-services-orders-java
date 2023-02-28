package com.ameotech.services.orderservice.service;
import com.ameotech.services.orderservice.entity.OrderDetails;

import ameotech.services.common.interfaces.IBaseService;

public interface OrderDetailsService extends IBaseService<OrderDetails>{
		public OrderDetails getDetailsbyOrderId(int orderId);
}
