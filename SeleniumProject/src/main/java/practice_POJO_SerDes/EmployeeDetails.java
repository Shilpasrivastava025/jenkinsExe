package practice_POJO_SerDes;

public class EmployeeDetails {
	
	//step1: declare all variables globally
	
	String Name;
	int Phone;
	String EmpId;
	String Email;
	Boolean isEmployed;
	
	// Steps2: Create a constructor to initialize the local variables 
	
	public EmployeeDetails(String name, int phone, String empId, String email, Boolean isEmployed) {
	
		this.Name = name;
		this.Phone = phone;
		this.EmpId = empId;
		this.Email = email;
		this.isEmployed = isEmployed;
	}
	
	public EmployeeDetails()
	{
		// empty constructor for De-Serialization
	}
	// Step 3: Provide Getters and Setters
	
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getPhone() {
		return Phone;
	}

	public void setPhone(int phone) {
		Phone = phone;
	}

	public String getEmpId() {
		return EmpId;
	}

	public void setEmpId(String empId) {
		EmpId = empId;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	public Boolean getIsEmployed() {
		return isEmployed;
	}

	public void setIsEmployed(Boolean isEmployed) {
		this.isEmployed = isEmployed;
	}
	
	
	
	

}
