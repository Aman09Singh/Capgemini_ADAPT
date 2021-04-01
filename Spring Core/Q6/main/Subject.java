
public class Subject {
	private String name;
	private int id;
	private int credits;
	public Subject() {
		
	}
	public Subject(String name, int id, int credits) {
		super();
		this.name = name;
		this.id = id;
		this.credits = credits;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCredits() {
		return credits;
	}
	public void setCredits(int credits) {
		this.credits = credits;
	}
	@Override
	public String toString() {
		return "Subject [name=" + name + ", id=" + id + ", credits=" + credits + "]";
	}
	

}
