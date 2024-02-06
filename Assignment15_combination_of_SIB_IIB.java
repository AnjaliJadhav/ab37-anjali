package org_assignments;
public class Assignment15_combination_of_SIB_IIB 
{
	//constructor
	public Assignment15_combination_of_SIB_IIB()
	{
		System.out.println("This is constructor");
	}
	//SIB
	static
	{
		System.out.println("SBI 1");
	}
	static
	{
		System.out.println("SBI 2");
	}
	//IIB
	{
		System.out.println("IIB");
	}
	//main
	public static void main(String[] args) 
	{
		new Assignment15_combination_of_SIB_IIB();
		System.out.println("Main Method");	
	}
}