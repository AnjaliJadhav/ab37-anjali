package org_assignments;
/*WAP with 3 methods main,static add and static subtract. Declare and initialize 
a and b global variables as non- static in nature and then perform 
addition and subtraction with static methods */

public class Assignment21 
{
	int a=10; // non static global variable declaration and initialization
	int b=30;
	int add=a+b;
	int sub=a-b;

	static void add()
	{
		Assignment21 d=new Assignment21(); //calling non static global variable in static method
		System.out.println(d.add);
	}
	static void sub()
	{
		Assignment21 d= new Assignment21();
		System.out.println(d.sub);
	}
	public static void main(String[] args) 
	{
		add();
		sub();		
	}
}