package com.tns.assignment;
import java.util.Scanner;
public class Multiple {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int number=sc.nextInt();
		if(number%3==0) {
			System.out.println("mutliple of 3");
		}else {
			System.out.println("not multilple of 3");
		}
		sc.close();
	}

}
