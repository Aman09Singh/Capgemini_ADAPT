
import org.springframework.beans.factory.annotation.Autowired;
import javax.annotation.Resource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Configuration
public class Details {
	private Admission aDetails;
	private Student studentDetails;
	private Mentor mentorDetails;
	public Details() {
		
	}
	public Details(Admission aDetails, Student studentDetails, Mentor mentorDetails) {
		super();
		this.aDetails = aDetails;
		this.studentDetails = studentDetails;
		this.mentorDetails = mentorDetails;
	}
	public Admission getaDetails() {
		return aDetails;
	}
	@Autowired
	public void setaDetails(Admission aDetails) {
		this.aDetails = aDetails;
	}
	public Student getStudentDetails() {
		return studentDetails;
	}
	@Autowired
	public void setStudentDetails(Student studentDetails) {
		this.studentDetails = studentDetails;
	}
	public Mentor getMentorDetails() {
		return mentorDetails;
	}
	@Resource
	public void setMentorDetails(Mentor mentorDetails) {
		this.mentorDetails = mentorDetails;
	}
	@Override
	public String toString() {
		return "Details [aDetails=" + aDetails + ", studentDetails=" + studentDetails + ", mentorDetails="
				+ mentorDetails + "]";
	}
	
}
