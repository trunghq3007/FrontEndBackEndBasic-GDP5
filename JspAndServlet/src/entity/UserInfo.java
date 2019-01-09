package entity;

public class UserInfo {
	private String fullName;
	private String address;
	private String granduation;
	private String major;
	private String email;
	private String phone;

	public UserInfo(String fullName, String address, String granduation, String major, String email, String phone) {
		this.fullName = fullName;
		this.address = address;
		this.granduation = granduation;
		this.major = major;
		this.email = email;
		this.phone = phone;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getAddresss() {
		return address;
	}

	public void setAddresss(String addresss) {
		this.address = addresss;
	}

	public String getGranduation() {
		return granduation;
	}

	public void setGranduation(String granduation) {
		this.granduation = granduation;
	}

	public String getMajor() {
		return major;
	}

	public void setMajor(String major) {
		this.major = major;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
