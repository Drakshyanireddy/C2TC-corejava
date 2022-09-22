package com.tns.staticthings;

public class StaticBlockTest {
	//Declare two instance blocks.
	{
		System.out.println("Instance block-1");
	}
	{
		System.out.println("Instance block-2");
	}
	//Declare two static blocks.
	static {
		System.out.println("Static block-1");
	}
	static {
		System.out.println("Static block-2");
	}
	//Declare zero parameter contructor.
	StaticBlockTest()
	{
		System.out.println("0-args constructor");
	}
	//Declare one parameter constructor with int parameter named a.
	StaticBlockTest(int a)
	{
		System.out.println("1-args constructor");
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//create an object of class.
		new StaticBlockTest(); //Nameless object.
		

	}

}
