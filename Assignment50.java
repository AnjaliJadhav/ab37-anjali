package org_assignments;

interface One
{
	void add();

	
	void sub();
	
}

interface Two
{
	void div();

	
	void mul();
	
}

public class Assignment50 implements One, Two
{	
	public static void main(String[] args) 
	{
	
		Assignment50 a=new Assignment50();
		a.add();
		a.sub();
		a.div();
		a.mul();
	
	}

	public void div() 
	{
		int a=100;
		int b= 20;
		int c= a/b;
		System.out.println(c);
		
	}

	public void mul() 
	{
		int a=10;
		int b= 20;
		int c= a*b;
		System.out.println(c);	
		
	}

	public void add() 
	{
		int a=10;
		int b= 20;
		int c= a+b;
		System.out.println(c);
		
	}

	public void sub() 
	{
		int a=10;
		int b= 20;
		int c= a-b;
		System.out.println(c);
		
	}
}