package oopsdemo;

class Student{
	int id;
	String name,address;
	long phno;
	
public void setData(int i, String n, String add, long ph) //assigning value using method
{
	id=i;
	name=n;
	address=add;
	phno=ph;
}

public void getData()//
{
	System.out.println("ID: "+id+"\nName: "+name+"\nAddress: "+address+""
			+ "\nPhone No.: "+phno);
}


}

public class ClassDemo {

	public static void main(String[] args) {
		//create object / class instantiation
		Student student=new Student();
		//System.out.println(student);
		/*using instance of a class(not safe)
		student.id=101;
		student.name="Shawin";
		student.address="Darjeeling";
		student.phno=123456789l;*/
		
		//assigning method using method
		student.setData(101,"Shawin","Darjeeling",123456789L);
		student.getData();
		
		
	}

}


//Assigning values in variable
//1) using instance of a class(not secure)
//2) using method
//3) using constructor
