package com.tns.staticthings;

public class TestStaticBlock {
	{
		//Declare two instance blocks.
		{
			System.out.println("Instance block-1");
		}
		{
			System.out.println("Instance block-2");
		}
		//Declare two static blocks.
		static 
		{
			System.out.println(" Static block-1");
		}
		static 
		{
			System.out.println(" Static block-2");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
