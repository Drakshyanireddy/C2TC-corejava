package com.tns.assignment;
import java.util.Scanner;
public class Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		if(a>b) {
			System.out.println("A is greater");
		}else if(b>c) {
			System.out.println("B is greater");
		}else if(c>a) {
			System.out.println("C is greater");
		}else {
			System.out.println("All is eqal");
		}
		sc.close();
	}
}
