package ex01;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoSuchBeanDefinitionException;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

@SpringBootTest
public class MyApplicationTest {
	
	/**
	 * @SpringBootConfiguration : 설정 클래스 자동 스캔 o
	 */
	@Test
	public void testMyComponent01NotNull(ApplicationContext applicationContext) {
		MyComponent myComponent = applicationContext.getBean("myComponent01", MyComponent.class);
		assertNotNull(myComponent);
	}
	
	/**
	 * @Configuration : 설정 클래스 자동 스캔 x
	 */
	@Test
	public void testMyComponent02Null(ApplicationContext applicationContext) {
		assertThrows(NoSuchBeanDefinitionException.class, () -> {
			applicationContext.getBean("myComponent02", MyComponent.class);
		});
	}
	
}
