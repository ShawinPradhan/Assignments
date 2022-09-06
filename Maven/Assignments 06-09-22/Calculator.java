package com.test;

public class Calculator {
	
	
public int addition(int a,int b)
{
	return a+b;
}

public int multiplication(int a,int b)
{
	return a*b;
}

public int substraction(int a,int b)
{
	if(a>b)
		return a-b;
	else
		return b-a;
}

public double division(int a,int b)
{
	if(a>b)
		return a/b;
	else
		return b/a;
}

public int factorial(int n)
{
	int i,f=1;
	for(i=1;i<=n;i++)
	{
		f *= i;
	}
	return f;
}

}
