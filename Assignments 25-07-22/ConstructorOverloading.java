package oopsdemo;
class Employee2 {
	int id;
	String name, city, country,state,designation;
	long phno,salary;
	
	public Employee2(int id, String name, String city)
	{
		this.id = id;
		this.name=name;
		this.city=city;
	}
	
	public Employee2(int id, String name, String city,String country,String state) {
		this(id,name,city);
		this.country=country;
		this.state= state;
	}
	
	public Employee2(int id, String name, String city,String country,String state,
			long phno,long salary, String designation) {
		this(id,name,city,country,state);
		this.phno=phno;
		this.salary= salary;
		this.designation= designation;
	}

	@Override
	public String toString() {
		return "Employee2 [id=" + id + ", name=" + name + ", city=" + city + ", country=" + country + ", state=" + state
				+ ", designation=" + designation + ", phno=" + phno + ", salary=" + salary + "]";
	}
	
	
}
public class ConstructorOverloading {

	public static void main(String[] args) {
		Employee2 e2= new Employee2(101,"Shawin","Bangalore");
		System.out.println(e2);
		System.out.println();
		
		Employee2 e3= new Employee2(101,"Shawin","Bangalore","India","WB",987654321,50000,"Manager");
		System.out.println(e3);
	}

}
