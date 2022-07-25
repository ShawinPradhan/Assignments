// In a hierarchical inheritance there is one parent class and multiple child class.
//One parent can have multiple child.
package oopsdemo;

class Bank{ //parent class
	public void loanInterest() {
		System.out.println("9% Interest Rate");
	}
}

class Sbi extends Bank{ //child 1
	public void pensionScheme()
	{
		System.out.println("Min. 5 years scheme needs to be taken.");
	}
}


class Hdfc extends Bank{ //child 2
	public void fixedDeposit()
	{
		System.out.println("Tenor year is 5 years.");
	}
}
public class HierarchicalInheritanceDemo {

	public static void main(String[] args) {
		Sbi sb= new Sbi();
		sb.loanInterest();
		sb.pensionScheme();
		System.out.println();
		
		Hdfc hd= new Hdfc();
		hd.loanInterest();
		hd.fixedDeposit();

	}

}
