import org.springframework.beans.factory.annotation.Required;

public class Mentor {
	private int id;
	private String name;
	private Student studentDetails;
	public Mentor() {
		
	}
	public Mentor(int id, String name, Student studentDetails) {
		super();
		this.id = id;
		this.name = name;
		this.studentDetails = studentDetails;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Student getStudentDetails() {
		return studentDetails;}



	@SuppressWarnings("deprecation")
	@Required
	public void setStudentDetails(Student studentDetails) {
		this.studentDetails = studentDetails;
	}


	@Override
	public String toString() {
		return "Mentor [id=" + id + ", name=" + name + ", \nstudentDetails=" + studentDetails + "]";
	}
	

}
