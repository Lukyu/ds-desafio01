package com.lucastamb.dsdesafio01.service;

import org.springframework.stereotype.Service;

import com.lucastamb.dsdesafio01.entity.Order;
import com.lucastamb.dsdesafio01.service.interfaces.ShippingServiceInterface;

@Service
public class ShippingService implements ShippingServiceInterface {
	
	public Double shipment(Order order) {
		
		if(order.getBasic() < 100)
			return 20d;
		else if(order.getBasic() >= 100 && order.getBasic() < 200)
			return 12d;
		else
			return 0d;		
	}
	
}
