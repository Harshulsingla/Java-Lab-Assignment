package com.Day1.Q4;

public class Ques4 {
	
	public static int[] copyOf(int[] array) {
		int b[]= new int[array.length];
		for(int i=0;i<array.length;i++) {
			b[i]=array[i];
		}
		return b;
	}
	
	public static void main(String[] args) {
		int array[]= { 2,6,8,5,3,1,6};
		
		for(int temp:array) {
			System.out.print(temp + " ");
		}
		System.out.println();
		int copyArray[]= copyOf(array);
		
		for(int temp:copyArray) {
			System.out.print(temp + " ");
		}
	}
	
}
