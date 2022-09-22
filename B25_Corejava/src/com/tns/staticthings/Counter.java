package com.tns.staticthings;

public class Counter {
	static int x = 0; //it will get memory only once retain its value.
	Counter()
	{
		x++; //It will increment the static variable by 1 for each object creation.
	}
	void display() //instance method 
	{
		System.out.println(x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Counter c1 = new Counter();
		c1.display();
		Counter c2 = new Counter();
		c2.display();
		Counter c3 = new  Counter();
		c3.display();

	}

}
