package org_assignments;

public class Assignment17_4constructors_1IIB 
{
	public Assignment17_4constructors_1IIB(String a)
	{
		System.out.println("Contructor 1");
	}
	public Assignment17_4constructors_1IIB(String a, String b)
	{
		System.out.println("Contructor 2");
	}
	public Assignment17_4constructors_1IIB(int a)
	{
		System.out.println("Contructor 3");
	}
	public Assignment17_4constructors_1IIB(int a, String b)
	{
		System.out.println("Contructor 4");
	}
	//iib
	{
		System.out.println("This is SIB");
	}
	public static void main(String[] args) 
	{
		new Assignment17_4constructors_1IIB("Testing");
		new Assignment17_4constructors_1IIB("Testing", "Testing");
		new Assignment17_4constructors_1IIB(5);
		new Assignment17_4constructors_1IIB(5, "Assignment17_4constructors_1IIB");		
	}

}