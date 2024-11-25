package part4;

interface ABC {
	int x = 10;
	void m1();
}

interface XYZ {
	int y = 200;
	void m2();
}

public class MultipleIheritance implements ABC, XYZ {
	
	public void m1() {
		System.out.println(x);
	}
	
	public void m2() {
		System.out.println(y);
	}

	public static void main(String[] args) {

		MultipleIheritance mi = new MultipleIheritance();
		mi.m1();
		mi.m2();
	}

}
