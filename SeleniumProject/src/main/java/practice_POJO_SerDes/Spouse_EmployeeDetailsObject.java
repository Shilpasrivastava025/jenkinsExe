package practice_POJO_SerDes;

public class Spouse_EmployeeDetailsObject {
	String SpouseName;
	String SpouseEmail;
	int [] phone;
	String SpouseEmpId;
	
	public Spouse_EmployeeDetailsObject(String spouseName, String spouseEmail, int[] phone, String spouseEmpId) {
		
		this.SpouseName = spouseName;
		this.SpouseEmail = spouseEmail;
		this.phone = phone;
		this.SpouseEmpId = spouseEmpId;
	}

	public String getSpouseName() {
		return SpouseName;
	}

	public void setSpouseName(String spouseName) {
		SpouseName = spouseName;
	}

	public String getSpouseEmail() {
		return SpouseEmail;
	}

	public void setSpouseEmail(String spouseEmail) {
		SpouseEmail = spouseEmail;
	}

	public int[] getPhone() {
		return phone;
	}

	public void setPhone(int[] phone) {
		this.phone = phone;
	}

	public String getSpouseEmpId() {
		return SpouseEmpId;
	}

	public void setSpouseEmpId(String spouseEmpId) {
		SpouseEmpId = spouseEmpId;
	}
	

}
