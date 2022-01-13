package com.Day2.Q1;

class Circle{
	private double radius;
	private String name;
	public Circle() {}
	public Circle(double r) {
		radius=r;
	}
	public double getradius() {
		return radius;
	}
	public double getArea() {
		return 3.14*radius*radius;
	}
}

public class Ques1 {
	public static void main(String[] args) {
		Circle circle=new Circle(2.5);
		System.out.println("Area is: "+circle.getArea());
	}
}
