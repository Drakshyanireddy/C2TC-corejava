package com.tns.volume;

public class ExampleOfVolume {
	double volume(double r) {
		double vol = (4 /3.0)*(22/7.0)*r*r*r;
		return vol;
	}
	double volume(double h,double r) {
		double vol = (22 / 7.0)* r* r *h;
		return vol;
	}
	double volume(double l, double b, double h) {
		double vol= l* b* h;
		return vol;
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ExampleOfVolume obj = new ExampleOfVolume();
		System.out.println("Sphere Volume ="+ obj.volume(6));
		System.out.println("Cylinder Volume ="+ obj.volume(5,3.5));
		System.out.println("Cuboid Volume ="+ obj.volume(7.5,3.5,2));
		

	}

}
