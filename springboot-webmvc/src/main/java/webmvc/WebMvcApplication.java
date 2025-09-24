package webmvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication
 * = @SpringBootConfiguration + @ComponentScan + @EnableAutoConfiguration
 */
@SpringBootApplication
public class WebMvcApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebMvcApplication.class, args);
	}

}
