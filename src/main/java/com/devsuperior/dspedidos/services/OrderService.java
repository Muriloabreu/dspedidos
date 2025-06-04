package com.devsuperior.dspedidos.services;

import org.springframework.stereotype.Service;

import com.devsuperior.dspedidos.entities.Order;

@Service
public class OrderService {

	// Constructor
	public OrderService() {

	}

	//Método
	
	public double total(Order order) {

		double vDiscount = order.getBasic() * (order.getDiscount() / 100);

		return order.getBasic() - vDiscount;

	}

}
