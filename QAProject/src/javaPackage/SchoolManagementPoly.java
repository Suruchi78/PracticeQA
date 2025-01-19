package javaPackage;

public class SchoolManagementPoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		
		PrimaryStudent obj1 = new PrimaryStudent();

		HighSchoolStudent obj2 = new HighSchoolStudent();
		
		// method overriding  // compile time 
		obj.describe();
		obj1.describe();
		obj2.describe();
		
		// method overloading // runtime 
		
		System.out.println("The study hour of student (5 subject) "+obj.studyhours(5));
		System.out.println("The study hour of studet (5 subject) "+obj1.studyhours(5));
		System.out.println("The study hour of student (5 subject,3 hours) "+obj2.studyhours(5,3));
	}
	
	

	
}

class Student {
	void describe() {
		System.out.println("I am a student.");
	}
	
	public int studyhours(int subjects)
	{
		return subjects*2;
	}
	
	public int studyhours(int subjects,int hours)
	{
		return subjects*hours;
	}
}

class PrimaryStudent extends Student {
	void describe() {
		System.out.println("I am in PrimarySchool.");

	}
}

class HighSchoolStudent extends Student {
	void describe() {
		System.out.println("I am in highSchool.");
	}

}
