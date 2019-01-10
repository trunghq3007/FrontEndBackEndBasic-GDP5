/**
 * 
 */
package entity;

/**
 * @author User
 *
 */
public class Contact {
	private int id;
	private String name;
	private String phone;
	private String address;
	private String graduate;
	private String major;
	private String email;
	public Contact() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Contact(String name, String phone, String address, String graduate, String major, String email) {
		super();
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.graduate = graduate;
		this.major = major;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
	public String getGraduate() {
		return graduate;
	}
	public void setGraduate(String graduate) {
		this.graduate = graduate;
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
	@Override
	public String toString() {
		return "Contact [id=" + id + ", name=" + name + ", phone=" + phone + ", address=" + address + ", graduate="
				+ graduate + ", major=" + major + ", email=" + email + "]";
	}
	
}
