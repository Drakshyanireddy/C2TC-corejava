package com.tns.assignment;
import java.util.Scanner;
public class WaterConservation {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		// TODO Auto-generated method stub
		int wcd=sc.nextInt();
		if(wcd<=45) {
			System.out.println("No Tax");
		}else if (wcd<75 && wcd>45) {
			System.out.println("tax :475");
		}else if (wcd<125 && wcd>75) {
			System.out.println("tax:750");
		}else if (wcd<200 && wcd>125) {
			System.out.println("tax:1225");
		}else if (wcd<350 && wcd>200) {
			System.out.println("tax:1650");
		}else {
			System.out.println("tax : 2000");
		}
		sc.close();
	}
}
