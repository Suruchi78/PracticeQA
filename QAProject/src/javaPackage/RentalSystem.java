package javaPackage;

public class RentalSystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CarSystem obj= new CarSystem();
		obj.setModel("Hundai");
		System.out.println(obj.getModel());
	}

}


class CarSystem{
	
	private String model;
	private int year;
	private double rentalpriceperday;
	
	
	
	
	void setModel(String model)
	{
		this.model=model;
	}
	
	String getModel()
	{
		return model;
	}
}



