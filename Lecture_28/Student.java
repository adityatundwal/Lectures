package Lecture_28;

import java.util.ArrayList;

public class Student {

	String name;
	int age;					//ye class ka data member hai
	static int count = 0;		//Ye class a static variable hai
	//Sabse pehle static variable banta hai class mai

	// Class is a type of blueprint (Predefined)
	public void Introduce_yourSelf() {

//		System.out.println("My Name is " + name + " My age is " + age);
		System.out.println("My Name is " + this.name + " My age is " + this.age);

	}

	public void SayHey(String name) {
		System.out.println(name + " Say hey " + this.name);
	}

	public static void MentorName() {
		Student s = new Student();
		System.out.println(s.name);
	}
	
	//this is a static block
	static{
		System.out.println("In Static");
	}
	
	//you can put as much as static block as you want
	static{
		System.out.println("In Static1");
	}
	
	static{
		System.out.println("In Static2");
	}
	
	//Static block will only work after accessing the class but it  will get executed first
	
}
