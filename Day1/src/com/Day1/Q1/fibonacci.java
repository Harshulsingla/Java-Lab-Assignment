package com.Day1.Q1;

public class fibonacci {
	
	public static void main(String[] args) {
		int a = 1;
		int b = 1;
		int c = 0;
		double sum = 2;
		System.out.print(a + " " + b);
		for (int i = 0; i < 18; i++) {
			c = a + b;
			System.out.print(" " + c);
			sum = sum + c;
			a = b;
			b = c;
		}
		System.out.println(' ');
		System.out.println(sum / 20);
	}

}
