package org_assignments;
public class Assignment7_calling_constructor 
{
	public Assignment7_calling_constructor()
	{
		System.out.println("This is constructor calling in main method");
	}
	public static void main(String[] args) 
	{
		//By creating an object we can call a constructor
		//Assignment7_calling_constructor A = new Assignment7_calling_constructor();
		//we can also call by this way
		new Assignment7_calling_constructor();
	}
}