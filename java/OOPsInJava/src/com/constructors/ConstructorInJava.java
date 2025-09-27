package com.constructors;

class GrandParent{
	public GrandParent() {
		super();
		System.out.println("Grand parent Constructor");
	}
}
class person extends GrandParent{
	int parent_id=20;
	public person() {
		System.out.println("Person Constructor");
	}
}
class Student extends person {
	public int id;
	public String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Student(int id) {
		super();
		System.out.println(super.parent_id);
		this.id = id;
	}
}

public class ConstructorInJava {
	public static void main(String[] args) {
		Student s1 = new Student(101, "liki");
		Student s2 = new Student(102);
		System.out.println("First name:");
		System.out.println("id:" + s1.id);
		System.out.println("name:" + s1.name);
		System.out.println("second name:");
		System.out.println("id:" + s2.id);
		System.out.println("name:" + s2.name);
	}
}
