

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class GetRectangle {

	public static void main(String[] args) {
		
		
		AbstractApplicationContext fac = new ClassPathXmlApplicationContext("spring.xml");
		fac.registerShutdownHook();
		
	
		Rectangle r = (Rectangle)fac.getBean("rectangle");
		Calculate c = (Calculate)fac.getBean("Calculate");
		
		
		System.out.println("-----------------------------------------------------");
		System.out.println("length for Rectangle : " + r.getLength());
		System.out.println("breadth for Rectangle : " + r.getBreadth());
		System.out.println("height for Rectangle : " + r.getHeight());
		System.out.println("-----------------------------------------------------");
		System.out.println("Calculated perimeter for Rectanle : " + c.getPerimeter());
		System.out.println("Calculated volume for Rectanle	:" + c.getVolume());
		System.out.println("-----------------------------------------------------");
		
		
	}

}
