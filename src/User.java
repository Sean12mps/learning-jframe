
public class User {
	
	private String name, email, capability;

	private boolean gender;
	
	public User() {}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getCapability() {
		return capability;
	}

	public void setCapability(String capability) {
		this.capability = capability;
	}

	public String getGender() {
		return ( gender ? "male" : "female" );
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

}
