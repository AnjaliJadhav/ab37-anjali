package org_assignments;
public class Assignment8_calling_manyconstructors 
{
	public Assignment8_calling_manyconstructors()
	{	this(1,2);
		System.out.println("This constructor has no arguments");
	}
	public Assignment8_calling_manyconstructors(int a, int b, int c, int d)
	{	this("ram");
		int add=a+b+c+d;
		System.out.println(add);
	}	
	public Assignment8_calling_manyconstructors(int a, int b)
	{	this(0,1,100,700);
		int add=a+b;
		System.out.println(add);
	}	
	public Assignment8_calling_manyconstructors(String a)
	{	this('c');
		System.out.println("Hi I'm String");
	}	
	public Assignment8_calling_manyconstructors(char a)
	{
		System.out.println('a');
	}
	public static void main(String[] args) 
	{	
		new Assignment8_calling_manyconstructors();		
		new Assignment8_calling_manyconstructors(10,10);
		//By creating an object we can call a constructor
				//Assignment7_calling_constructor A = new Assignment7_calling_constructor();
				//we can also call by this way
			
	}
}