package javaPackage;

public class InhertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Manager obj=new Manager("Suruchi",1001,1000.00);
		obj.displayDetail();
		
		
		
	}

}


class Employee
{
	String name;
	int id;
	double salary;
	
	Employee(String name,int id,double salary)
	{
		this.name=name;
		this.id=id;
		this.salary=salary;
		
	}
	
	void displayDetail(){
		System.out.println("The name of employee "+name);
		System.out.println("The id of employee "+id);
		System.out.println("The salary of employee "+salary);
	}
	
}


class Manager extends Employee
{

	Manager(String name, int id, double salary) {
		super(name, id, salary);
		// TODO Auto-generated constructor stub
	}
	

	
}

