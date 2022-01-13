package com.Day1.Ques3;

import java.util.Scanner;

public class Ques3 {
	public static void main(String[] args) {
		System.out.print("Enter the number of students: ");
		Scanner sc= new Scanner(System.in);
		int numStudents=sc.nextInt();
		
		int grades[]=new int[numStudents];
		int sum=0;
		for(int i=0;i<numStudents;i++) {
			int j=i+1;
			System.out.print("Enter the grade for the student "+ j +" :");
			grades[i]=sc.nextInt();
			
			if(grades[i]>=0 && grades[i]<=100) {
				sum+=grades[i];
			}
			else {
				System.out.println("Invalid, try again ");
				i--;
			}
		}
		sc.close();
		int avg=sum/numStudents;
		System.out.println("The average grade is: "+ avg);
	}
}
