package oopsdemo;

//parent/super/base class
class User{
	int id;
	String name,address;
	
public void setData(int id, String name, String address)
{
	this.id= id;
	this.name=name;
	this.address= address;
	
}

public void display()
{
	System.out.println("ID: "+this.id);
	System.out.println("Name: "+this.name);
	System.out.println("Address: "+this.address );
}
}

//sub/child/derived class
class Employee1 extends User
{
	double salary;
	String designation;
	
	public void setData(int id, String name, String address,double salary,String designation)
	{
		super.setData(id, name, address);// parent class setData()
		
		this.salary= salary;
		this.designation= designation;
	}
	
	public void display()
	{
		super.display();// calling parent class display() using super keyword
		System.out.println("Salary: "+this.salary);
		System.out.println("Designation: "+this.designation);
	}
}
public class SingleInheritanceDemo {

	public static void main(String[] args) {
		Employee1 emp = new Employee1();
		emp.setData(121, "Chris", "Bangalore", 21000, "Java Developer");
		emp.display();
	}

}
