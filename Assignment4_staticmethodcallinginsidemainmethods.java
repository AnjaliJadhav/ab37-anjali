package org_assignments;

public class Assignment4_staticmethodcallinginsidemainmethods 
{
	public static void add()
	{
		int a =10;
		int b=20;
		int add=a+b;
		System.out.println(add);
	}
	
	public static void sub()
	{
		int a =30;
		int b=10;
		int sub=a-b;
		System.out.println(sub);
	}
	
	public static void div()
	{
		int a =30;
		int b=10;
		int div=a/b;
		System.out.println(div);
	}
	public static void main(String[] args) 
	{
		add();
		sub();
		div();
	}
}