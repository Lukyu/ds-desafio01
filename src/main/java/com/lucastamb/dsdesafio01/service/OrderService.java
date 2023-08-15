package com.lucastamb.dsdesafio01.service;

import org.springframework.stereotype.Service;

import com.lucastamb.dsdesafio01.entity.Order;
import com.lucastamb.dsdesafio01.service.interfaces.OrderServiceInterface;
import com.lucastamb.dsdesafio01.service.interfaces.ShippingServiceInterface;

@Service
public class OrderService implements OrderServiceInterface {

	private ShippingServiceInterface shippingService;
	
	public OrderService(ShippingServiceInterface shippingService) {
		this.shippingService = shippingService;
	}
	
	public Double total(Order order) {
		
		Double total = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
		
		total += this.shippingService.shipment(order);
		
		return total;
	}
	
}
