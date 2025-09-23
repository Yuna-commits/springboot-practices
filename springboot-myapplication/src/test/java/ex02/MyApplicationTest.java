package ex02;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;

import ex02.component.MyComponent;

@SpringBootTest
public class MyApplicationTest {

	/**
	 * MyComponent란 이름의 컴포넌트 스캔, 빈 생성
	 */
	public void testMyComponentNotNull(ApplicationContext applicationContext) {
		MyComponent myComponent = applicationContext.getBean("MyComponent", MyComponent.class);
		assertNotNull(myComponent);
	}

}
