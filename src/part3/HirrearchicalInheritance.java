package part3;

class Parent{
	
	int a;
	void display() {
		System.out.println(a);
	}
}

class Child1 extends Parent{
	int x;
	void show() {
		System.out.println(x);
	}
}

class Child2 extends Parent{
	int y;
	void print() {
		System.out.println(y);
	}
}


public class HirrearchicalInheritance {

	public static void main(String[] args) {
		
		Child1 ch1 = new Child1();
		ch1.a = 650;
		ch1.x = 700;
		ch1.display();
		ch1.show();
		
		Child2 ch2 = new Child2();
		ch2.a = 850;
		ch2.y = 500;
		ch2.display();
		ch2.print();

	}

}
