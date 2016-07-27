
public class Customer {
	int customerId;
	String name;
	String email;
	String phone;
	String ssn;
	
	Address address;
	Account account;
	

	public Customer(int customerId, String name, Address address, String email, String phone, String ssn, Account account) {
		this.customerId = customerId;
		this.name = name;
		this.address = address;
		this.email = email;
		this.phone = phone;
		this.ssn = ssn;
		this.account = account;
	}
	
	public Account getAccount() {
		return account;
	}
	public void setAccount(Account account) {
		this.account = account;
	}
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
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
	public String getSsn() {
		return ssn;
	}
	public void setSsn(String ssn) {
		this.ssn = ssn;
	}
	
}
