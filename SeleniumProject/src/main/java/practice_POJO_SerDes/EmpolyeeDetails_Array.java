package practice_POJO_SerDes;

public class EmpolyeeDetails_Array {

	String name;
	int phone [];
	String Email;
	String Address;
	boolean isEmployed;
	
	public EmpolyeeDetails_Array(String name, int[] phone, String email, String address, boolean isEmployed) {
		super();
		this.name = name;
		this.phone = phone;
		this.Email = email;
		this.Address = address;
		this.isEmployed = isEmployed;
	}
	
	public EmpolyeeDetails_Array()
	{
		
	}
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}

	public boolean isEmployed() {
		return isEmployed;
	}

	public void setEmployed(boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	
	
	
}
