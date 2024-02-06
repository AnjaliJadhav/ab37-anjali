package org_assignments;

public class Assignment9_Subtraction_Multiplication_Division 
{
	public void sub()
	{
		int a =30;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
	}	
	public void mul()
	{
		int a=10;
		int b=30;
		int c=a*b;
		System.out.println(c);
	}	
	public void div()
	{
		int a =30;
		int b=10;
		int div=a/b;
		System.out.println(div);
	}
	
	public static void main(String[] args) 
	{
		Assignment9_Subtraction_Multiplication_Division Assignment4 = new Assignment9_Subtraction_Multiplication_Division();
		Assignment4.sub();
		Assignment4.div();
		Assignment4.mul();
	}
}