package com.tns.finalexample;

public class Cons {
	
	Cons( int a) //constructor
	{
		System.out.println("the value of a:" +a);
	}
	int add(int q, int p) // member function
	{
		int c=q+p;
		return c;
		
	}
	void display()
	{
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Cons ob = new Cons(10);
		ob.add(4, 5);
	}

}
