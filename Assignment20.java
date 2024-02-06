package org_assignments;
/*WAP with 3 methods main,static add and static subtract. Declare a and b as static global variables 
and initialize then in each method and perform addition and subtraction */
public class Assignment20 
{
	static int a; //static global variable declaration
	static int b;

	static void add()
	{
		a=10; //static global variable initialization
		b=30;
		int add=a+b;
		System.out.println(add);
	}
	static void sub()
	{
		a=10;
		b=30;
		int sub=a-b;
		System.out.println(sub);
			
	}
	
	public static void main(String[] args) 
	{
		add();
		sub();		
	}

}