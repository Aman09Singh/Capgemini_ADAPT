
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestInstance(Lifecycle.PER_CLASS)
class BankAccountControllerTest {
	ApplicationContext context;
	BankAccountController controller;

	@BeforeEach
	void init() {
		context= new ClassPathXmlApplicationContext("spring.xml");
		controller = (BankAccountController)context.getBean("bankAccountController");
	}
	
	@Test
	void WithdrawTest() {
		double expected = 234.0;
		double actual = controller.withdraw(10, 10000);
		assertEquals(expected,actual);
		
	}
	@Test
	void DipositTest() {
		double expected = 3345646578.0;
		double actual = controller.deposit(10, 5);
		assertEquals(expected,actual);
	}

}
