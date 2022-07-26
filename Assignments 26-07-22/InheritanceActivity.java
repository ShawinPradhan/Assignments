package oopsdemo;
class Employee3
{	
	long employeeId, employeePhone;
	String employeeName, employeeAddress;
	double basicSalary;
	static double specialAllowance=250.80;
	static double hra=1000.50;
	
	public void setData(long employeeId, String employeeName, String employeeAddress,
			long employeePhone, double basicSalary)
	{
		this.employeeId=employeeId;
		this.employeeName=employeeName;
		this.employeeAddress= employeeAddress;
		this.employeePhone= employeePhone;
		this.basicSalary=basicSalary;
	}
	
	public void calculateSalary() {
		double salary;
		salary = basicSalary + (basicSalary * specialAllowance/100) + 
				(basicSalary * hra/100);
		System.out.println("Salary: "+salary);
	}

	@Override
	public String toString() {
		return "Employee3 [employeeId=" + employeeId + ", employeePhone=" + employeePhone + ", employeeName="
				+ employeeName + ", employeeAddress=" + employeeAddress + ", basicSalary=" + basicSalary + "]";
	}
	
	public void displayEmp() {
		System.out.println("Employee ID: "+employeeId);
		System.out.println("Employee Name: "+employeeName);
		System.out.println("Employee Phone: "+employeePhone);
		System.out.println("Employee Address: "+employeeAddress);
		System.out.println("Basic Salary: "+basicSalary);
		
	}
}	


class Manager extends Employee3
	{
		public double calculateTransportAllowance() {
			double transportAllowance = 15* basicSalary/100;
			return transportAllowance;
		}
	}
	
class Trainee extends Employee3
	{
		public double calculateTransportAllowance() {
			double transportAllowance = 10* basicSalary/100;
			return transportAllowance;
		}
	}


public class InheritanceActivity {

	public static void main(String[] args) {
		Manager mm= new Manager();
		mm.setData(126534,"Peter","Chennai India",237844,65000);
		mm.displayEmp();
		mm.calculateSalary();
		System.out.println("Transport Allowance: "+mm.calculateTransportAllowance());
		
		System.out.println();
		Trainee tt = new Trainee();
		tt.setData(29846, "Jack", "Mumbai India", 442085, 45000);
		System.out.println(tt);
		tt.calculateSalary();
		System.out.println("Transport Allowance: "+tt.calculateTransportAllowance());
		
		

	}

}
