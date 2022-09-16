package com.tns.assignment;
import java.util.Scanner;
public class PNZ {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int number = sc.nextInt();
		if(number>0) {
			System.out.println("Number is positive:"+number);
		} else if (number<0) {
			System.out.println("Number is Negative:"+number);
		}else {
			System.out.println(" Number is Zero:"+number);
		}
		sc.close();
	}

}
