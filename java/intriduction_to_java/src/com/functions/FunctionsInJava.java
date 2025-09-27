package com.functions;

public class FunctionsInJava {
	public int add(int num1, int num2) {
		return num1+num2;
	}
	public static void main(String[] args) {
		//syntax
		//classname obj_name=new classname()
		FunctionsInJava obj1=new FunctionsInJava();
		int res =obj1.add(19,10);
		System.out.println("res:"+res);
		int res1 =obj1.add(190,100);
		System.out.println("res1:"+res1);
	}

}
  