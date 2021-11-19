package Practice;

public class Employee {
    private String empId;
	private String empName;
	private int deptId;
	private String status;
	private String salary;
	public Employee(String empId, String empName, int deptId, String status, String salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.deptId = deptId;
		this.status = status;
		this.salary = salary;
	}
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", deptId=" + deptId + ", status=" + status
				+ ", salary=" + salary + "]";
	}
	
	

}
