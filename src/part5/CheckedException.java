package part5;

public class CheckedException {

	public static void main(String[] args) throws InterruptedException {
		
		System.out.println("Program  is started");
		System.out.println("Program  is in progress");
		
		//By using keyword -- throws InterruptedException
		//Thread.sleep(3000);
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Program  is compiled");
		System.out.println("Program  is exited");

	}

}
