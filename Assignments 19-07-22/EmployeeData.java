package oopsdemo;
import java.util.Scanner;

class Employee{
	int empid,join,curr,ta;
	String emp_name,pos;
	float emp_sal;
	
public void setData(int i, String n, float sal,int j, int c,String p,int t) 
{
	empid = i;
	emp_name = n;
	emp_sal = sal;
	join=j;
	curr= c;
	pos=p;
	ta=t;
	
}

public double getAppraisal()
{
	if(curr-join>=1)
	{
		float salary = emp_sal + (emp_sal*0.1f);
		return salary;
	}
	else
		return emp_sal;
}
public int TA()
{
	ta =0;
	if(pos.equals("manager")||pos.equals("Manager"))
		ta = 3000;
	else
		ta = 1000;
	return ta;
}
public void displayEmp()
{
	System.out.println("Emp_Id: "+empid);
	System.out.println("Emp_Name: "+emp_name);
	System.out.println("Position: "+pos);
	System.out.println("Salary: "+getAppraisal());
	System.out.println("Travel Allowance: "+TA());
}
}


public class EmployeeData {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int id,cur,joi;
		String name,pos1;
		float sal;
		System.out.println("Enter emp_id: ");
		id = sc.nextInt();
		System.out.println("Enter Employee Name: ");
		name = sc.next();
		System.out.println("Enter Joining year: ");
		joi= sc.nextInt();
		System.out.println("Enter Current year: ");
		cur = sc.nextInt();
		System.out.println("Enter Position: ");
		pos1 = sc.next();
		System.out.println("Enter Salary: ");
		sal = sc.nextFloat();
		Employee e = new Employee();
		e.setData(id, name, sal, joi, cur, pos1, joi);
		System.out.println();
		e.displayEmp();
	}

}
