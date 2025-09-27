package com.datatypes;

import java.util.Arrays;

public class NonPrimitiveTypes {
	public static void main(String[] args) {
		//string
		String name="likhi";
		System.out.println("Your name:"+name);
	    //array
		int[] arr= {7,8,5,4,9};
		System.out.println("Your marks:"+Arrays.toString(arr));
		for(int i=0;i<5;i++) {
			System.out.println(arr[i]);
		}
	}
}
