package org_assignments;

public class Assignment11_StaticandNonstaticmethod_withsamemethodName 
{
	public static void samemethod(int a)
	{
		System.out.println(a);
	}
	
	public static void samemethod(double a)
	{
		System.out.println(a);
	}
	
	public static void samemethod(char a)
	{
		System.out.println(a);
	}
	
	public void samemethod(boolean a)
	{
		System.out.println(a);
	}
	
	public void samemethod(String a)
	{
		System.out.println(a);
	}
	public static void main(String[] args) 
	{
		System.out.println("Calling static method");
		samemethod(10);
		samemethod(10.1);
		samemethod('c');
		
		System.out.println("Calling non static method");
		Assignment11_StaticandNonstaticmethod_withsamemethodName Assignment4 = new Assignment11_StaticandNonstaticmethod_withsamemethodName();
		Assignment4.samemethod(true);
		Assignment4.samemethod("Hi I'm String");

	}
}