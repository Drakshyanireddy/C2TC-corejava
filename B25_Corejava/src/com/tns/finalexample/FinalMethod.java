package com.tns.finalexample;
class MethodTest
{
	MethodTest() //constructor
	{
		System.out.println("this is a default contructor");
	}
	final int a = 20; //fianl variable.
	final void show() //final method
	{
		System.out.println("Value of a :" +a);
	}
}

public class FinalMethod extends MethodTest {
	void show()
	{
		//Complie time error because we can not override the final method from FinaMethodEx.
		System.out.println(" this is the final method of FinalMethoEx class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create an object of FinalMethodEx class.
		FinalMethod fm = new FinalMethod();
		
		//Call final method using reference variable fm.
		fm.show();

	}

}
