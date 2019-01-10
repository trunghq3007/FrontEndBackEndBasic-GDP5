package entity;

public class UserContact {
	private String fullName ;
	private String phone;
	private String address;
	private String isGraduation;
	private String major;
	private String email;
	public UserContact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserContact(String fullName, String phone, String address, String isGraduation, String major, String emai) {
		super();
		this.fullName = fullName;
		this.phone = phone;
		this.address = address;
		this.isGraduation = isGraduation;
		this.major = major;
		this.email = emai;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getIsGraduation() {
		return isGraduation;
	}
	public void setIsGraduation(String isGraduation) {
		this.isGraduation = isGraduation;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getEmai() {
		return email;
	}
	public void setEmai(String emai) {
		this.email = emai;
	}
	
}
