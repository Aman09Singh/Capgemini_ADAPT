

public class Student {
	private String name;
	private long regNo;
	private double rating;
	private Subject subject;
	public Student() {
		
	}
	public Student(String name, long regNo, double rating, Subject subject) {
		super();
		this.name = name;
		this.regNo = regNo;
		this.rating = rating;
		this.subject = subject;
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
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	public Subject getSubject() {
		return subject;
	}
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", regNo=" + regNo + ", rating=" + rating + ", \nsubject=" + subject + "]";
	}
	
	
}
