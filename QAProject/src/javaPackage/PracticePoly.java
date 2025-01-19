package javaPackage;

public class PracticePoly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student1 obj = new Student1();
		
		HighSchoolStudent1 obj1 = new HighSchoolStudent1();
		
		CollegeStudent1 obj2 = new CollegeStudent1();
		
		//method overiding
		
		obj.describee();
		obj1.describee();
		obj2.describee();
		
		//method overloading 
		
		System.out.println("The study hour of student(5 subjects)" + obj.studyhours(5));
		System.out.println("The study hour of student(5 subjects)" + obj1.studyhours(5));
		System.out.println("The study hour of student(5 subjects)" + obj2.studyhours(5, 3));

	}
}

	class Student1 {
		void describee() {
			System.out.println("I am a student.");
			
			}
		
		public int studyhours(int subjects) {
			return subjects*2;
			
		}
		
		public int studyhours(int subjects, int hours) {
		return subjects*hours;
		
	}
	}
	class HighSchoolStudent1 extends Student1 {
		void describee() {
			System.out.println("I am a high school student.");

		}
	}

	class CollegeStudent1 extends Student1 {
		void describee() {
			System.out.println("I am a college student.");

		}
	}
	

