package part5;

public class FinallyBlock {

	public static void main(String[] args) {
		
		System.out.println("Program  is started");
		System.out.println("Program  is in progress");
		
		int a = 100;
		
		try {
		System.out.println(a/0);
		} catch(ArithmeticException e) {
			System.out.println("Entred in to catch block");
			e.printStackTrace();
		}finally {
			System.out.println("Entred in to finnaly block");
		}
		
		System.out.println("Program  is compiled");
		System.out.println("Program  is exited");

	}

}
