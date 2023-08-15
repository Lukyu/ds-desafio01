package com.lucastamb.dsdesafio01.service;

import org.springframework.stereotype.Service;

import com.lucastamb.dsdesafio01.entity.Order;

@Service
public class ShippingService {

	public Double shipment(Order order) {
		
		if(order.getBasic() < 100)
			return 20d;
		else if(order.getBasic() >= 100 && order.getBasic() < 200)
			return 12d;
		else
			return 0d;		
	}
	
}
