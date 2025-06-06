package com.devsuperior.dspedidos.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dspedidos.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;

	// Constructor
	public OrderService() {

	}

	//Método	
		
	public double total(Order order) {

		double vDiscount = order.getBasic() * (order.getDiscount() / 100);

		double result = order.getBasic() - vDiscount;
		order.setBasic(result);
		result = shippingService.shipment(order);
		
		return  result;

	}

}
