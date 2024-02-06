package org_assignments;

public class Assignment5_Nonstaticmethodcallinginsidemainmethod 
{
	public void add()
	{
		int a =10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	
	public void sub()
	{
		int a =30;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public void div()
	{
		int a =30;
		int b=10;
		int div=a/b;
		System.out.println(div);
	}
	
	public void mul()
	{
		int a=10;
		int b=30;
		int c=a*b;
		System.out.println(c);
	}
	public static void main(String[] args) 
	{
		Assignment5_Nonstaticmethodcallinginsidemainmethod Assignment4 = new Assignment5_Nonstaticmethodcallinginsidemainmethod();
		Assignment4.add();
		Assignment4.sub();
		Assignment4.div();
		Assignment4.mul();
	}
}