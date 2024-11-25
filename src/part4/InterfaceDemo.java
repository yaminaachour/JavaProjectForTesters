package part4;


interface A{
	
	int a = 10; // by default variables in interface are static and final
	void m1(); //  Abstract method (without implementation of code), by default public
}

class B{
	
	int b;
}

public class InterfaceDemo extends B implements A{
	
	//Here we can implement the method
	public void m1() {
		System.out.println(a);
	}
	

	public static void main(String[] args) {
		
		//Here we can access to the method
		InterfaceDemo interDem = new InterfaceDemo() ;
		interDem.m1();
		
		//Another way to invoke m1
		A a = new InterfaceDemo(); // create memory for the interface, because interface don't have a memory by default
		a.m1();
		
	
	}

}

