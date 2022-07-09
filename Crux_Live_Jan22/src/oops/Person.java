package oops;

public class Person {

	String name;
	int age;

	public Person() { // non-paramaterized constructor
		this.name = "Motu";
		this.age = 24;

	}

	public Person(String name, int age) { // paramaterized constructor
		this.name = name;
		this.age = age;

	}

	public void fun() {  
		int Adhar_no = 901981;
		System.out.println(this.name + " " + this.age + " " + Adhar_no);
	}
}
