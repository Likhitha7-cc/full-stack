package com.class_objects;

class car{
	String brand;
	int year;
	
	public void display() {
		System.out.println("brand:"+brand);
		System.out.println("year:"+year);
	}
}
public class ClassObject {
	public static void main(String[] args) {
		car obj1=new car();
		obj1.brand="Tesla";
		obj1.year=2018;
		obj1.display();
		
		car obj2=new car();
		obj2.brand="Tesla";
		obj2.year=2019;
		obj2.display();
		}
	}

