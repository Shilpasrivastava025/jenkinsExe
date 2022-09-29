package practice_POJO_SerDes;

public class EmployeeDetails_Object {
	
	String name;
	int []a;
	String Email;
	Object Spouse;
	String EmpId;
	
	
	public EmployeeDetails_Object(String name, int[] a, String email, Object spouse, String empId) {
	
		this.name = name;
		this.a = a;
		this.Email = email;
		this.Spouse = spouse;
		this.EmpId = empId;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int[] getA() {
		return a;
	}
	public void setA(int[] a) {
		this.a = a;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Object getSpouse() {
		return Spouse;
	}
	public void setSpouse(Object spouse) {
		Spouse = spouse;
	}
	public String getEmpId() {
		return EmpId;
	}
	public void setEmpId(String empId) {
		EmpId = empId;
	}

}
