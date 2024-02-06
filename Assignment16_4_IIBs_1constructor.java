package org_assignments;
/*WAP with 4 IIBs and 1 constructor*/
public class Assignment16_4_IIBs_1constructor 
{
	public Assignment16_4_IIBs_1constructor()
	{
		System.out.println("This is contructor");
	}
	
	//IIB's
	{
		System.out.println("IIB 1");
	}
	{
		System.out.println("IIB 2");
	}
	{
		System.out.println("IIB 3");
	}
	static
	{
		System.out.println("SIB 1");
	}
	
	//Main
	
	public static void main(String[] args) 
	
	{
		new Assignment16_4_IIBs_1constructor();
	}
}