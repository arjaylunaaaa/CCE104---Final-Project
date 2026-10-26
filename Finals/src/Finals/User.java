package Finals;

public class User {

	private String username;
	private String password;
	private String email_address;
	private String contact_number;
	
	
	
	public User(String username, String password, String email_address, String contact_number) {
		this.username = username;
		this.password = password;
		this.email_address = email_address;
		this.contact_number = contact_number;
	}
	
	public String getUsername() {
		return username;
	}
	public String getPassword() {
		return password;
	}
	public String getEmail_address() {
		return email_address;
	}
	public String getContact_number() {
		return contact_number;
	}
	
	
}
