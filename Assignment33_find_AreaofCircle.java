package org_assignments;

public class Assignment33_find_AreaofCircle 
{
	final static double pi=3.14; //static global final variable
	
	void radious1()
	{
		int r1=7;
		double area1=pi*r1;
		System.out.println("Area of first circle is " +area1);
		
	}
	
	void radious2()
	{
		int r2=14;
		double area2=pi*r2;
		System.out.println("Area of second circle is " +area2);
		
	}
	public static void main(String[] args) 
	{
		Assignment33_find_AreaofCircle Assignment33=new Assignment33_find_AreaofCircle();
		Assignment33.radious1();
		Assignment33.radious2();	
			
	}

}