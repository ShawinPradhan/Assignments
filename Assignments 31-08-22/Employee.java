package collectionframework;

public class Employee {
	private int empID;
	private String empName;
	
	public int getEmpID() {
		return empID;
	}
	public void setEmpID(int empID) {
		this.empID = empID;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	
	
	public Employee(int empID, String empName) {
		super();
		this.empID = empID;
		this.empName = empName;
	}
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	public void display()
	{
		System.out.println("Emp ID: "+ getEmpID() +"  Emp Name: "+ getEmpName());
	}
}
