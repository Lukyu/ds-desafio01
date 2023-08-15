package com.lucastamb.dsdesafio01.service;

import org.springframework.stereotype.Service;

import com.lucastamb.dsdesafio01.entity.Order;

@Service
public class OrderService {

	public Double total(Order order) {
		
		Double totalDesconto = order.getBasic() - (order.getBasic() * (order.getDiscount() / 100));
		
		return totalDesconto;
	}
	
}
