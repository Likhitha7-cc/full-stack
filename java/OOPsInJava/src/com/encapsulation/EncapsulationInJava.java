package com.encapsulation;

class student{
	//instance variables
	/*
	 * this->it is a key word in java used to
	 * acces the instance variables and methods and staticalso
	 * of current object
	 */
	private String name;
	private int id;
	private int roll;
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "student [name=" + name + ", id=" + id + ", roll=" + roll + ", age=" + age + "]";
	}
	
	
}

public class EncapsulationInJava {
  public static void main(String[] args) {
	student s1=new student();
	s1.setName("likhi");
	s1.setAge(20);
	s1.setRoll(102);
	s1.setId(1001);
	System.out.println(s1);//toString
  }
}
