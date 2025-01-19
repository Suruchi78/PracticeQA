package javaPackage;


//withdraw/ deposit/display

public class PracticeBank {
	int amt = 6000;
	
	void deposit(int dep) {
		dep = amt + 2000;
		System.out.println("The amount after deposit " + dep);
		
	}
	
	
	void withdraw(int wth) {
		wth = amt - 1000;
		System.out.println("The amount after withdraw " + wth);
		
	}
	
	 int display() {
		return amt ;
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		PracticeBank obj3 = new PracticeBank();
			obj3.deposit(1000);
			obj3.withdraw(6000);
			
			System.out.println("Amount: "+ obj3.display());
			
			
			
			
		}
		
	}


