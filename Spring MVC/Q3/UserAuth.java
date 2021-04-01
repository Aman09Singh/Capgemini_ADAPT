public class UserAuth {
	
	private String user = "ABCDEFG";
	private String pass = "HIJKLMNOP";
	public boolean isValid(String username, String password) {
		if(username.equalsIgnoreCase(user) && password.equals(pass)) {
			return true;
		}
		return false;
	}
}
