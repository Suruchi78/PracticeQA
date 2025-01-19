package javaPackage;

public class PracticeObjectClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Employee1 obj2 = new Employee1("Raj Shrestha", 24, 2, "Computer Science");
		obj2.displayDetail();
         Manager1 obj3 = new Manager1("Shriya Gurung", 26, 1, "Information Technology");
		obj3.displayDetail();
		obj3.age();
		
		
		
	}

}

class Employee1{
	
String name;
int age;
int id;
String qualifaction;
	
   Employee1(String name, int age, int id, String qualifaction){
	   this.name= name;
	   this.age=age;
	   this.id=id;
	   this.qualifaction=qualifaction;
	
}
   
   void displayDetail() {
	   System.out.println("Name of the employee: " + name);
	   System.out.println("Age of the employee: " + age);
	   System.out.println("Id of the employee: " + id);
	   System.out.println("Qualifaction of the employee: " + qualifaction);
   }
}

class Manager1 extends Employee1{
	Manager1(String name, int age, int id, String qualifaction){
		super(name, age, id, qualifaction);
			
		
	}
	
	void age() {
		age = age*2;
		System.out.println("age after getting older: " + age);
		 
		
	}
	
	

	}
	
	
	

