package oops;

public class Student_Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student s = new Student(); // object of Student created. s is ref. variable and new Student() is object
		// default value when object is created
		System.out.println(s.name);
		System.out.println(s.age);
		// after assigning values
		s.name = "Darshan";
		s.age = 20;
		System.out.println(s.name);
		System.out.println(s.age);

		// creating new Student object with ref variable s1
		Student s1 = new Student();
		s1.name = "Daksh";
		s1.age = 21;
		System.out.println(s1.name);
		System.out.println(s1.age);
		
		s.Intro_yourself();
		s1.Intro_yourself();
	}

}
