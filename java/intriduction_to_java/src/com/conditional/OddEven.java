package com.conditional;

import java.util.Scanner;

public class OddEven {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int userInput;
		System.out.println("Enter a number:");
	    userInput = sc.nextInt();
		System.out.println("You entered value is :"+userInput);
		if(userInput==0) {
			System.out.println("zero");
		}
		else if(userInput<0){
			System.out.println("negative");
			
		}
		else if(userInput%2==0){
			System.out.println("even");
		}
		else {
			System.out.println("odd");
		}
		sc.close();
	}
}
