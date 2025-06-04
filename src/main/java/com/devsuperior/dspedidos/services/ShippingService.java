package com.devsuperior.dspedidos.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.devsuperior.dspedidos.entities.Order;

@Service
public class ShippingService {
	
	@Autowired
	OrderService orderService;
	
	//Constructor
	
	public ShippingService() {
		
	}

	//Método
	
	public double shipment(Order order) {
		
		//double result = 0;

		double	result = orderService.total(order);
		
		if (result < 100) {
			
			result += 20;
			 
		} else if(result >= 100 && result  < 200) {
			
			result += 12;
			
		}
		
		return result;
	}
}
