package com.tns.finalexample;

public class FinalVariable {
	
	//Declare a final instance variable.
	int a = 10 ;
	//Declare an instance method.
	void change()
	{
		//Change the value of the final instance variable .
		a = 60; //complie timw error, A final variable's value can not  be changed.
		System.out.println(a);
		
		//Declare a final local variable inside the methos.
		 int i = 0;
		for (i=0; i<5; i++) //complie time error.
		{
			System.out.println("Value of I :"+i);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create an object of the class.
		FinalVariable fv = new FinalVariable ();
		//Callchange() method using reference variable fv.
		fv.change();

	}

}
