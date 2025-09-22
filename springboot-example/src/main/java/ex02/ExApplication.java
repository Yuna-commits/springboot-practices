package ex02;

import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

/**
 * Configuration Class
 */
@SpringBootApplication
public class ExApplication { // Bootstrap Class

	@Bean
	public Map<?, ?> myMap() {
		return Map.of("greeting", "hello world");
	}
	
	// Application Entry Point
	public static void main(String[] args) {
		// Bootstrapping method 종료 후, HelloWorldRunner Bean 실행
		// 웹애플리케이션인 경우에 실행하면 shutdown 됨, 사용 x
		try (ConfigurableApplicationContext ac = SpringApplication.run(ExApplication.class, args)) {
		} catch (Exception ignore) {}
	}

}
