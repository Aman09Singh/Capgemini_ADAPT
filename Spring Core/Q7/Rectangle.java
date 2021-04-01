

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Rectangle implements InitializingBean, DisposableBean{
	
	private int length;
	private int breadth;
	private int height;
	
	public int getLength() {return length;}
	public void setLength(int length) {this.length = length;}
	
	public int getBreadth() {return breadth;}
	public void setBreadth(int breadth) {this.breadth = breadth;}
	
	public int getHeight() {return height;}
	public void setHeight(int height) {this.height = height;}
	
	
	@Override
	public void destroy() throws Exception {
		System.out.println("Destroying Rectangle BEAN");
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("Initializing Rectangle BEAN");
		
	}
	
	
	
}
