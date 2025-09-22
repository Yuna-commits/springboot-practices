package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication { // Bootstrap Class

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greeting", "hello world");
	}

	// Application Entry Point
	public static void main(String[] args) {
		// Bootstrapping Method
		ApplicationContext applicationContext = SpringApplication.run(ExApplication.class, args);
		System.out.println(applicationContext.getBean("myMap", Map.class).get("greeting"));
	}

}
