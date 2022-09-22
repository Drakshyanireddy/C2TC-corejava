package com.tns.staticthings;

public class StaticMethod {
	//Instance Area.
	static int x = 20; //static variable 
	int y = 30; //instance variable
	//Delcare an instance method.
	void display()
	{
		//Instance area. So we can directly call instance variable withour using object reference  varible
		System.out.println(x); // since we can access static member within the instance area. therefore 
		System.out.println(y);
	}
	// Declare a static method.
	static void show()
	{
		//Static area. so we can call S.V directly inside the S.M.
		System.out.println(x);
		//System.out.println(y); //complie time error because instance variable cannot access instance
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Create the object of the class.
		StaticMethod st = new StaticMethod();
		//call instance method using reference variable st.
		st.display();
		//call static method.
		StaticMethod.show();

		

	}

}
