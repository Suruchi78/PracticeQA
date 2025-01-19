package javaPackage;

public class Calcultaorr implements Calculate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calcultaorr obj= new Calcultaorr();
		obj.add(10, 10);
		obj.add(10, 20,30);
		obj.add(10, 20.50);
		
	}

	
	void add(int a,int b) {
		int sum=a+b;
		System.out.println(sum);
		
	}
	
	void add(int a,int b,int c) {
		int sum =a+b+c;
		System.out.println(sum);
}
	
	void add(int a,double b) {
		
		double sum =a+b;
		System.out.println(sum);
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void subtract() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void multiply() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public void dividde() {
		// TODO Auto-generated method stub
		
	}
	}
