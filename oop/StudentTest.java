package oop;

class Student
{
	public int roll_no;
	public String name;
	public String course;
	public double m1,m2,m3;
	
	public double total()
	{
		return m1+m2+m3;
	}
	public double average()
	{
		return total()/3;
	}
	public char grade()
	{
		if(average()>=70)
			return 'A';
		else if(average()>=60 && average()<70)
			return 'B';
		else if(average()>=50 && average()<60)
			return 'C';
		else if(average()>=40 && average()<50)
			return 'D';
		else
			return 'F';
	}
	public String details()
	{
		return "Roll No: "+roll_no+"\n"+"Name:"+name+"\n"+"Course:"+course+"\n";
	}
}
	

public class StudentTest {

	public static void main(String[] args) {
	Student s=new Student(); //object s of Student created in heap
		
		s.roll_no=1;
		s.name="Rahul";
		s.course="CS";
		s.m1=20;
		s.m2=80;
		s.m3=65 ;
		
		System.out.println("Total: " +s.total());
		System.out.println("Average: "+s.average());
		System.out.println("Grade: " +s.grade());
		System.out.println("Details: \n " +s.details());


	}

}
