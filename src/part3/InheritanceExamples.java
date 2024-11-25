package part3;

class A{ //Parent
	
	int a;
	
	void display() {
		System.out.println(a);
	}
}

class B extends A{ //B is child class, A is parent class
	
	int b;
	void print() {
		System.out.println(b);
	}
	
}

// Multilevel
class C extends B{
	int c;
	void show(){
		System.out.println(c);
	}
}


public class InheritanceExamples {

	public static void main(String[] args) {
		
		//Single
		A aobj = new A();
		aobj.a = 500;
		aobj.display();
		
		B bobj = new B();
		bobj.b = 200;
		bobj.a = 600;
		
		bobj.print();
		bobj.display();
		
		//Multilevel
		C cobj = new C();
		cobj.c = 900;
		cobj.show();
		cobj.b = 230;
		cobj.print();
		cobj.a = 530;
		cobj.display();
		
		
		

	}

}
