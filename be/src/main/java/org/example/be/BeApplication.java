package org.example.be;

import org.example.be.entities.Perfume;
import org.example.be.service.PerfumeService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class BeApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeApplication.class, args);
	}

	@Bean
	CommandLineRunner start(PerfumeService perfumeService){
		return args -> {
//			perfumeService.addPerfume(new Perfume(null, "One Million", "Sensadffjfjerkjdfvdfkjvnfdj", 20));
			for (int i = 0; i < 150; i++) {
				Perfume perfume = Perfume.builder()
						.name("ABC" + i)
						.description("Eélégance en toute circonstance")
						.price(50)
						.build();

				perfumeService.addPerfume(perfume);
			}

			List<Perfume> perfumes = perfumeService.getPerfumes();
			perfumes.forEach(System.out::println);
		};
	}

}
