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
	
	
	public static void main(String[] args) {
		SpringApplication.run(DspedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Order order1 = new Order(1034, 150.00, 20.0 );					
		System.out.println("Pedido Código: " + order1.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order1));
		
		
		Order order2 = new Order(2282, 800.00, 10.0 );				
		System.out.println("Pedido Código: " + order2.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order2));
		
		
		Order order3 = new Order(1309, 95.90, 00.0 );				
		System.out.println("Pedido Código: " + order3.getCode());
		System.out.println("Valor Total: R$ " + orderService.total(order3));
		
	}

}
