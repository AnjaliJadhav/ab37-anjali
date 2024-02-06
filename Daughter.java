package org_assignments;

public class Daughter extends Parent{
	
	public void add()
	{
		System.out.println("This is doughter class method");
		
	}


	public static void main(String[] args) 
	{
		Daughter d1= new Daughter();
		d1.add();
		d1.add1();

	}

}
