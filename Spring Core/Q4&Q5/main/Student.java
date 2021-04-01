
import javax.inject.Inject;

public class Student {
	private String name;
	private int age;
	private double CGPA;
	private Admission aDetails;
	public Student() {
		
	}
	public Student(String name, int age, double cGPA, Admission aDetails) {
		super();
		this.name = name;
		this.age = age;
		CGPA = cGPA;
		this.aDetails = aDetails;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getCGPA() {
		return CGPA;
	}
	public void setCGPA(double cGPA) {
		CGPA = cGPA;
	}
	public Admission getaDetails() {
		return aDetails;
	}


	@Inject
	public void setaDetails(Admission aDetails) {
		this.aDetails = aDetails;
	}


	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", CGPA=" + CGPA + ", \naDetails=" + aDetails + "]";
	}

}
