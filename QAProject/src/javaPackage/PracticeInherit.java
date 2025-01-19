
package javaPackage;


public class PracticeInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		//Create an Employee object
		
	
	
	
	//create a object for manger
	
	Managerr mng1 = new Managerr("Rohit Thakuri", 1, 60000, 4);
	System.out.println("Manager Details: ");
	mng1.displayDetail();
	
	}

}

//Parent class/ Employee class

class Employees{
	
	//Common attributes for all employees
	
	String name;
	int id;
	double salary;
	
	// Constructor to initialize the employees details
	
	public Employees(String name, int id, double salary) {
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}

	public void displayDetail() {
		System.out.println("Employee ID: " + id);
		System.out.println("Name: "+ name);
		System.out.println("Salary: $" + salary);
	}
}

//Child class: Manager

class Managerr extends Employees {
	
	//Additional attribute for managers
	
	int teamSize;
	
	//Constructor to initialize manager details(Uses Employee Constructor)
	
	public Managerr(String name, int id, double Salary, int teamSize) {
		
		//Call the parent class constructor to initialize common attributes
		super(name, id, Salary);
		this.teamSize = teamSize;
		
	}
	
	
	//Method to calculate bonus based on team size
	
	public double calculateBonus() {
		return salary*0.1*teamSize; //bonus is 10% of salary per team members
		
	}
	
	
	//Override the displayDetail method to include team size and bonus
	
	@Override
	
	public void displayDetail() {
	
		System.out.println("Team Size: " + teamSize);
		System.out.println("Bonus: $" + calculateBonus() );
	
	
}
}
