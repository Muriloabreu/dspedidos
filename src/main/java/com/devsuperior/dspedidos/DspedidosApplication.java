package com.devsuperior.dspedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.devsuperior.dspedidos.entities.Order;
import com.devsuperior.dspedidos.services.OrderService;
import com.devsuperior.dspedidos.services.ShippingService;

@SpringBootApplication
public class DspedidosApplication implements CommandLineRunner{
	
	@Autowired
	OrderService orderService;
	
	@Autowired
	ShippingService shippingService;

	public static void main(String[] args) {
		SpringApplication.run(DspedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order = new Order(001, 95.90, 0 );
		
		orderService.total(order);
				
		
		System.out.println("\n------------------------------------------------------ ");
		System.out.println("Pedido Código: " + order.getCode());
		System.out.println("Valor Total: R$ " + shippingService.shipment(order));
		System.out.println("\n------------------------------------------------------ ");
		
		
	}

}
