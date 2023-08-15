package com.lucastamb.dsdesafio01;

import java.util.Locale;
import java.util.Scanner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.lucastamb.dsdesafio01.entity.Order;
import com.lucastamb.dsdesafio01.service.OrderService;
import com.lucastamb.dsdesafio01.service.ShippingService;

@SpringBootApplication
@ComponentScan({"com.lucastamb.dsdesafio01"})
public class DsDesafio01Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(DsDesafio01Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Código do pedido: ");
		Integer code = sc.nextInt();
		
		System.out.print("Valor: ");
		Double basic = sc.nextDouble();

		System.out.print("Porcentagem de desconto: ");
		Double discount = sc.nextDouble();
		
		Order order = new Order(code, basic, discount);

		ShippingService shippingService = new ShippingService();
		OrderService orderService = new OrderService(shippingService);
		
		System.out.println("Pedido código: "+order.getCode());
		System.out.println("Valor total: "+String.format("%.2f", orderService.total(order)));
		
		sc.close();
	}

}
