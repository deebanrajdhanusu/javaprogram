package Collection;

public class Employee {
	private String empName;
	private String empId;
	private int empAge;
	private int empSalery;
	private boolean empIsMale;
	private String empRole;
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public int getEmpAge() {
		return empAge;
	}
	public void setEmpAge(int empAge) {
		this.empAge = empAge;
	}
	public int getEmpSalery() {
		return empSalery;
	}
	public void setEmpSalery(int empSalery) {
		this.empSalery = empSalery;
	}
	public boolean isEmpIsMale() {
		return empIsMale;
	}
	public void setEmpIsMale(boolean empIsMale) {
		this.empIsMale = empIsMale;
	}
	public String getEmpRole() {
		return empRole;
	}
	public void setEmpRole(String empRole) {
		this.empRole = empRole;
	}
	public Employee(String empName, String empId, int empAge, int empSalery, boolean empIsMale, String empRole) {
		this.empName = empName;
		this.empId = empId;
		this.empAge = empAge;
		this.empSalery = empSalery;
		this.empIsMale = empIsMale;
		this.empRole = empRole;
	}
	public String toString() {
		return" empName=" + empName + ", empId=" + empId + ", empAge=" + empAge + ", empSalery=" + empSalery
				+ ", empIsMale=" + empIsMale + ", empRole=" + empRole;
	}
	
	
	
	
	

}
