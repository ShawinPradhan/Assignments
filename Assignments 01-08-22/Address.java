package abstractiondemo;

public class Address {
	int pincode;
	String country, city, state;
	
	public Address(int pincode,String country, String city, String state)
	{
		super();
		this.pincode = pincode;
		this.country = country;
		this.city = city;
		this.state = state;
		
	}
	//it can have more methods
	//getter setter method from Source
	public int getPincode() {
		return pincode;
	}

	public void setPincode(int pincode) {
		this.pincode = pincode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	//toString method from Source
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", country=" + country + ", city=" + city + ", state=" + state + "]";
	}

	public static void main(String[] args) {
		
		
		

	}

}
