// program to show multilevel and hierarchical inheritance in one program
package oopsdemo;
class College1 
{
	public void displayName() {
		System.out.println("Name of College: SJC");
	}
}

class Department extends College1 
{
	public void deptCourse()
	{
		System.out.println("1) Science 2) Commerce 3) Arts");
	}
}
class Branches extends Department{ 
	public void branchName()
	{
		System.out.println("This is Computer Science under Science Department.");
	}
}

class Student12 extends College1
{
	public void studentBelong()
	{
		System.out.println("This students belongs to SJC college.");
	}
}

public class CollegeDemo {

	public static void main(String[] args) {
		Student12 st= new Student12();
		st.displayName();
		st.studentBelong();
		System.out.println();
		
		Branches br = new Branches();
		br.displayName();
		br.deptCourse();
		br.branchName();	
	}

}
