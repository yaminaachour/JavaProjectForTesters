package part3;

final class Bike1{ // add final - we cannot extends into child class
	
	int speed = 300;
	void run() {
		System.out.println(speed);
	}

}

class Honda1 extends Bike1{
	
}

public class FinalClassDemo {

	public static void main(String[] args) {

	}

}
