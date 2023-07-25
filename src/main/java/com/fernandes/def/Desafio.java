package com.fernandes.def;

import java.util.Scanner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.fernandes.entities.Order;
import com.fernandes.services.OrderService;

@SpringBootApplication
@ComponentScan({"com.fernandes"})

public class Desafio implements CommandLineRunner{

	Scanner sc = new Scanner(System.in);

	@Autowired
	private OrderService orderService;

	public static void main(String[] args) {
		SpringApplication.run(Desafio.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.print("Ente com o código do pedido: ");
		int code = sc.nextInt();
		System.out.print("Entre com o valor da compra: ");
		double basic = sc.nextDouble();
		System.out.print("Porcentagem de desconto: ");
		double discount = sc.nextDouble();

		Order order = new Order(code, basic, discount);
		System.out.println("Pedido código: " + order.getCode());
		System.out.println("Valor total: " + String.format("%.2f",orderService.total(order)));

	}

}
