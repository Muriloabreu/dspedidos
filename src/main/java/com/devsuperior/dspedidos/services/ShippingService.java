package com.devsuperior.dspedidos.services;



import org.springframework.stereotype.Service;

import com.devsuperior.dspedidos.entities.Order;

@Service
public class ShippingService {
	
	
	//Constructor
	
	public ShippingService() {
		
	}

	//Método
	
	public double shipment(Order order) {		
		
		double	result = 0;
		
		if (order.getBasic() < 100) {
			
			result = order.getBasic() + 20;
			 
		} else if(order.getBasic() > 99 && order.getBasic()  < 200) {
			
			result = order.getBasic() + 12;
			
		}else {
			result = order.getBasic();
		}
		
		return result ;
	}
}
