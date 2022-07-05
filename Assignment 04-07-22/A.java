package mypack;
public class A
{
	public void message()
	{
		System.out.println("Hello Everyone");
	}
	public void fact(int n)
{
	int fact=1;
	for(int i=1;i<=n;i++)
	{
		fact= fact*i;
	}
	System.out.println("Factorial of "+n+" is "+fact);
}
	public void min(int n, int m)
	{
		if (n>m)
			System.out.println(""+n+" is greater than "+m+"");
		else
			System.out.println(""+m+" is greater than "+n+"");
	}
}
