package com.tns.assignment;
import java.util.Scanner;
public class Library {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int days=sc.nextInt();
		int fine;
		System.out.println("Enter the number of days late :"+days);
		if(days<=5) {
			fine=days*1;
		}else if(days<10) {
			fine=(5*1)+(days-5)*5;
		}else {
			fine=(5*1)+(5*5)+(days-10)*10;
		}
		System.out.println("For"+days+"days late.fine is "+fine);
		sc.close();
	}

}
