package ex01;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExApplication { // Bootstrap Class
	
	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greeting", "hello world");
	}

	// Application Entry Point
	public static void main(String[] args) {
		// Bootstrapping Method 1
		// ConfigurableApplicationContext ac = null;
		// try {
		//		ac = SpringApplication.run(ExApplication.class, args);
		//		System.out.println(ac.getBean("myMap", Map.class).get("greeting"));
		// } catch (Exception ignore) {
		// } finally {
		// 		ac.close();
		// }

		// Bootstrapping Method 2
		// try (ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)) {
		// 	 System.out.println(ac.getBean("myMap", Map.class).get("greeting"));
		// } catch (Exception ignore) {}

		// Bootstrapping Method 3
		ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args);
		System.out.println(ac.getBean("myMap", Map.class).get("greeting"));
		ac.close();
	}

}
