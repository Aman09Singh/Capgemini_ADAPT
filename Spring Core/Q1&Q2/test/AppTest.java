import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.TestInstance.Lifecycle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@TestInstance(Lifecycle.PER_CLASS)
class AppTest {
	static ApplicationContext context;
	static App app;
	//@TestInstance(Lifecycle.PER_CLASS)
	@BeforeAll
	void init() {
		context = new ClassPathXmlApplicationContext("spring.xml");
		app = new App();
	}
	
	@Test
	void testApp() {
		String exp[] = {"Customer customerId=10, customerName=ABCDEFGH, customerContact=8900000000, customerAddress=Address street=WallStreet, state=Maharastra, zip=12450, country=India",
				"ListQuestion [questionId=1, question=Sample Question, answers=[Answer 1, Answer 2, Answer 3, Answer 4]]",
				"SetQuestion [questionId=2, question=Sample Question, answers=[Answer 1, Answer 2, Answer 3, Answer 4]]",
				"MapQuestion [questionId=3, question=Sample Question, answers={1=Answer 1, 2=Answer 2, 3=Answer 3, 4=Answer 4}]"};
		String act[] = {app.customerCase(),app.listQuestion(),app.setQuestion(),app.mapQuestion()};
		//
		for(int i=0;i<exp.length;i++) {
			assertEquals(exp[i],act[i]);
		}
	}

}
