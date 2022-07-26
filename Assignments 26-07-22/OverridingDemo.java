// for overriding the child class method name should be same as parent method name
// the parameter passed in the method should also be same
// there should be a IS-A relationship (parent/child class)
package oopsdemo;
class ParentBank{
	public void loanInterest() {
		System.out.println("9% Loan Interest");
	}
}

class ChildSbi extends ParentBank{
	public void loanInterest() {
		System.out.println("SBI: 5% Loan Interest");
	}
}

class ChildAxis extends ParentBank{
	public void loanInterest() {
		System.out.println("Axis: 12% Loan Interest");
	}
}
class ChildHdfc extends ParentBank{
	public void loanInterest() {
		System.out.println("HDFC: 8.5% Loan Interest");
	}
}
public class OverridingDemo {

	public static void main(String[] args) {
		ParentBank pbank;
		pbank = new ChildAxis();
		pbank.loanInterest();
		System.out.println();
		pbank = new ChildHdfc();
		pbank.loanInterest();
	}

}
