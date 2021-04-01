
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App{
    public static void main( String[] args ){
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
    	System.out.println("Details from details class");
    	Details details = (Details)context.getBean("details");
    	System.out.println(details);
    }
}
