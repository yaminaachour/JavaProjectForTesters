package part3;

public class FinalVariableDemo {
	
	//without final we can change the value of the variable
	final int speed = 200; // final variable - we cannot change this value
	
	public static void main(String[] args) {
		
		FinalVariableDemo fvd = new FinalVariableDemo();
		fvd.speed = 500; // compile time error because of final
		System.out.println(fvd.speed);
		 
		
		
	}

}
