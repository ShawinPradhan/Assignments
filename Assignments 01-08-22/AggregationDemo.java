package abstractiondemo;

class Company{
	int compid;
	String compName;
	
	Address address; //entity reference

	public int getCompid() {
		return compid;
	}

	public String getCompName() {
		return compName;
	}

	public Address getAddress() {
		return address;
	}


	public Company(int compid, String compName, Address address) {
		super();
		this.compid = compid;
		this.compName = compName;
		this.address = address;
	}
	
	
}
public class AggregationDemo {

	public static void main(String[] args) {
		Address add1 = new Address(756401,"India","Kolkata","WB");
		Address add2 = new Address(7001,"USA","Detriot","LA");
		
		Company company1 = new Company(123,"TCS",add1);
		Company company2 = new Company(345,"TCS US",add2);
		
		System.out.println("First Company");
		System.out.println("ID: "+company1.getCompid()+" "+
		"Company_Name: "+company1.getCompName());
		
		System.out.println("Pincode: "+company1.getAddress().getPincode()+
				" City: "+company1.getAddress().getCity()+
				" Country: "+company1.getAddress().getCountry());
		
		System.out.println();
		System.out.println("Second Company");
		System.out.println("ID: "+company2.getCompid()+" "+
				"Company_Name: "+company2.getCompName());
				
		System.out.println("Pincode: "+company2.getAddress().getPincode()+
				" City: "+company2.getAddress().getCity()+
				" Country: "+company2.getAddress().getCountry());
	}

}
