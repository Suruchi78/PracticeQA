package javaPackage;

public class PracticeObjectAndJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car obj = new car("Toyota","Pink",2015, 779925);
		obj.displayDetail();
		honda obj1 = new honda("Ford","White", 1999, 67376363);
		obj1.displayDetail();

	}

}

class car {
	String carModel;
	int carYear;
	String carColor;
	int carNumber;

	car(String carModel, String carColor, int carYear, int carNumber) {
		this.carModel = carModel;
		this.carYear = carYear;
		this.carColor = carColor;
		this.carNumber = carNumber;

	}
	
	void displayDetail() {
		System.out.println("Car Model: " + carModel);
		System.out.println("Car Year: " + carYear);
		System.out.println("Car Color: " + carColor);
		System.out.println("Car Number: "+ carNumber);
		
		
	}

}

class honda extends car{
	 honda(String carModel, String carColor, int carYear, int carNumber ){
		 super(carModel,carColor,carYear,carNumber);
	
	}
	 

	
}
