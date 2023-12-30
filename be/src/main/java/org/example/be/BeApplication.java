package org.example.be;

import org.example.be.dto.*;
import org.example.be.entities.Customer;
import org.example.be.service.CustomerService;
import org.example.be.service.OrderService;
import org.example.be.service.PerfumeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.ArrayList;
import java.util.List;

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
			System.out.println("******************** PERFUMES ******************");
			for (int i = 0; i < 10; i++) {
				PerfumeRequestDTO perfumeRequestDTO = PerfumeRequestDTO.builder()
						.name("ABC" + i)
						.description("Eélégance en toute circonstance")
						.price(50)
						.build();

				perfumeService.addPerfume(perfumeRequestDTO);
			}

			System.out.println("-------------------- PERFUMES LIST --------------------");
			List<PerfumeResponseDTO> perfumes = perfumeService.getPerfumes();
			perfumes.forEach(System.out::println);

			System.out.println("////////////////////////////////////////////////");
			System.out.println("////////////////////////////////////////////////");
			System.out.println("////////////////////////////////////////////////");

			System.out.println("******************** CUSTOMERS ******************");
			CustomerRequestDTO customerRequestDTO = CustomerRequestDTO.builder()
					.firstName("Baba")
					.lastName("Prince")
					.addressMail("iambabaprince@gmail.com")
					.phoneNumber("+212693823094")
					.build();

			CustomerRequestDTO customerRequestDTO1 = CustomerRequestDTO.builder()
					.firstName("Boris")
					.lastName("Samne")
					.addressMail("borissamne@gmail.com")
					.phoneNumber("+212693823094")
					.build();

			customerService.addCustomer(customerRequestDTO);
			customerService.addCustomer(customerRequestDTO1);

			System.out.println("-------------------- CUSTOMERS LIST --------------------");
			List<CustomerResponseDTO> customers = customerService.getCustomers();
			customers.forEach(System.out::println);

			System.out.println("////////////////////////////////////////////////");
			System.out.println("////////////////////////////////////////////////");
			System.out.println("////////////////////////////////////////////////");

			System.out.println("******************** ORDERS ******************");
//			Customer customer = new Customer();
//			customer.setFirstName("Salma");
//			customer.setLastName("Sasha");
//			customer.setAddressMail("salmasasha@gmail.com");
//			customer.setPhoneNumber("+212693823094");
			OrderRequestDTO orderRequestDTO = OrderRequestDTO.builder().build();
			orderService.createOrder(orderRequestDTO);
		};
	}

}
