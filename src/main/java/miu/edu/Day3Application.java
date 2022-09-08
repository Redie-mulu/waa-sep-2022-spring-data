package miu.edu;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class Day3Application {

	@Bean
	public ModelMapper returnMapper() {
		return new ModelMapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(Day3Application.class, args);
	}

}
