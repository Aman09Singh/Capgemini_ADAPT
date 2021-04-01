
import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:dbConfig.properties")
public class Project {
	private String projectName;
	private Student student;
	private Subject subject;

	@Autowired
	Environment env;

	public Project() {
		
	}

	public Project(String projectName, Student student, Subject subject) {
		super();
		this.projectName = projectName;
		this.student = student;
		this.subject = subject;
	}
	
	public String getProjectName() {
		return projectName;
	}
	@Value("ABCD")
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public Student getStudent() {
		return student;
	}
	@Resource
	public void setStudent(Student student) {
		this.student = student;
	}
	public Subject getSubject() {
		return subject;
	}
	@Resource
	public void setSubject(Subject subject) {
		this.subject = subject;
	}
	@Override
	public String toString() {
		return env.getProperty("user.Name")+" Project [projectName=" + projectName + ", \nstudent=" + student + ", subject=" + subject + "]";
	}
	

}
