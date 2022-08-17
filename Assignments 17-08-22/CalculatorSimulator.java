package exceptionhandling;
import java.util.Scanner;

class TaxCalculator{
	
	public void calculateTax(String empName, boolean isIndian, double empSal) 
			throws CountryNotValidException, EmployeeNameInvalidException, TaxNotEligibleException 
	{
		double taxAmount;
		
		if(isIndian==true)
		{
			if(empName!="")
			{
				if(empSal>=100000)
				{
					taxAmount = empSal *8/100;
				}
				else if(empSal>=50000 && empSal<100000)
				{
					taxAmount = empSal * 6/100;
				}
				else if(empSal>=30000 && empSal<50000)
				{
					taxAmount = empSal *5/100;
				}
				else if(empSal>=10000 && empSal<30000)
				{
					taxAmount = empSal *4/100;
				}
				else
					throw new TaxNotEligibleException("The employee does not need to pay tax.");
			}	
			else
				throw new EmployeeNameInvalidException("The employee name cannot be empty.");
		}
		else
			throw new CountryNotValidException("The employee should be an Indian citizen for calculating tax.");
		
		System.out.println("Tax Amount is: "+taxAmount);
	}
}
	
public class CalculatorSimulator {
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		TaxCalculator tc = new TaxCalculator();
		String name;
		boolean indian;
		double sal;
		System.out.println("Are you an Indian?");
		indian = sc.nextBoolean();
		sc.nextLine();
		System.out.println("Enter your name:");
		name = sc.nextLine();
		System.out.println("Enter your salary:");
		sal = sc.nextDouble();
		try {
			tc.calculateTax(name, indian, sal);
		} 
		catch(CountryNotValidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(EmployeeNameInvalidException e)
		{
			System.out.println(e.getMessage());
		}
		catch(TaxNotEligibleException e)
		{
			System.out.println(e.getMessage());
		}
		finally {
			sc.close();
			System.out.println("Thank You!!");
		}
		
		
	}
}
