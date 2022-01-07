
public class Customer {
	private String email;
	private String password;
	private String name;
	private String mobile;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Override
	public String toString() {
		return "Customer [email=" + email + ", password=" + password + ", name=" + name + ", mobile=" + mobile + "]";
	}

	public Customer(String email, String password, String name, String mobile) {
		super();
		this.email = email;
		this.password = password;
		this.name = name;
		this.mobile = mobile;
	}

}
