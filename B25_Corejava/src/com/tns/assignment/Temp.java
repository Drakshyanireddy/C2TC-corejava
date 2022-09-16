package com.tns.assignment;
import java.util.Scanner;
public class Temp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner SC = new Scanner(System.in);
		int temp= SC.nextInt();
		int week = 5;
				for (int i=1;i<week;i++)
				{
					temp=temp-2;
					System.out.println(temp);
				}
				SC.close();
	}

}
