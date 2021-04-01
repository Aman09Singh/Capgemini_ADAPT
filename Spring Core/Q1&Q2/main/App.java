
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	static ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    public static void main( String[] args ){
    	
    }
    public String customerCase() {
    	ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
    	Customer customer = (Customer)context.getBean("customer");
    	String value = customer.toString();
    	return value;
    }
    public String listQuestion(){
    	ListQuestion lq = (ListQuestion)context.getBean("listQuestion");
    	return lq.toString();
    }
    public String setQuestion() {
    	SetQuestion sq = (SetQuestion)context.getBean("setQuestion");
    	return sq.toString();
    }
    public String mapQuestion() {
    	MapQuestion mq = (MapQuestion)context.getBean("mapQuestion");
    	return mq.toString();
    }
}
