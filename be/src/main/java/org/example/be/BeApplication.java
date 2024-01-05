package org.example.be;

import org.example.be.entities.Customer;
import org.example.be.entities.Order;
import org.example.be.entities.Perfume;
import org.example.be.enums.OrderStatus;
import org.example.be.service.CustomerService;
import org.example.be.service.OrderService;
import org.example.be.service.PerfumeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeApplication.class, args);
	}

	@Bean
	CommandLineRunner start(
			PerfumeService perfumeService,
			CustomerService customerService,
			OrderService orderService){
		return args -> {

			Perfume perfume = Perfume.builder()
					.name("One Million")
					.description("Perfect")
					.price(50)
					.build();
			Perfume perfume1 = Perfume.builder()
					.name("Legend")
					.description("Perfect")
					.price(50)
					.build();
			Perfume perfume2 = Perfume.builder()
					.name("Invictus")
					.description("Perfect")
					.price(50)
					.build();
			perfumeService.addPerfume(perfume);
			perfumeService.addPerfume(perfume1);
			perfumeService.addPerfume(perfume2);

			System.out.println("******************** CUSTOMERS ******************");
			Customer customer = Customer.builder()
					.firstName("Baba")
					.build();
			Customer customer1 = Customer.builder()
					.firstName("Prince")
					.build();
			Customer customer2 = Customer.builder()
					.firstName("Boris")
					.build();
			customerService.addCustomer(customer);
			customerService.addCustomer(customer1);
			customerService.addCustomer(customer2);

			System.out.println("******************** ORDERS ******************");
			Order order = new Order();
			order.setStatus(OrderStatus.IN_PROGRESS);
			Order order1 = new Order();
			order1.setStatus(OrderStatus.CONFIRMED);
			Order order2 = new Order();
			order2.setStatus(OrderStatus.ARCHIVED);
			orderService.createOrder(order);
			orderService.createOrder(order1);
			orderService.createOrder(order2);

			System.out.println("******************** ADD PERFUME TO ORDER ******************");
			orderService.addPerfumeToOrder(perfume.getId(), order.getId());

			System.out.println("******************** ADD CUSTOMER TO ORDER ******************");
			orderService.addCustomerToOrder(customer.getId(), order.getId());
		};
	}

}
