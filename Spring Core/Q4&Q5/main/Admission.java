
public class Admission {
	private long regNo;
	private String branch;
	public Admission() {
		
	}
	public Admission(long regNo, String branch) {
		super();
		this.regNo = regNo;
		this.branch = branch;
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
		return "Admission [regNo=" + regNo + ", branch=" + branch + "]";
	}
	
}
