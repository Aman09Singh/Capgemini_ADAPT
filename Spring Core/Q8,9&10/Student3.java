
import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Student3 implements ApplicationContextAware{
	private String name;
	private long regNo;
	private String branch;
	private ApplicationContext context = null;
	public Student3() {
		
	}
	public Student3(String name, long regNo, String branch) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.branch = branch;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getRegNo() {
		return regNo;
	}
	public void setRegNo(long regNo) {
		this.regNo = regNo;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	@Override
	public String toString() {
		return "Student3 [name=" + name + ", regNo=" + regNo + ", branch=" + branch + "]";
	}
	@PostConstruct
	public void postCont() {
		System.out.println("PostConstruct method is called for Student 3");
	}
	@PreDestroy
	public void preDest() {
		System.out.println("PreDestroy method is called for Student 3");
	}
	@Override
	public void setApplicationContext(ApplicationContext context) throws BeansException {
	
		this.context=context;
	}

}
