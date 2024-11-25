package myPackage;

public class Operators {

	public static void main(String[] args) {

		int a = 10;
		int b = 20;
		
		//Arithmetic operators --> + - * %
		System.out.println("----------------- Arithmetic operators ----------------------------");
		System.out.println("Sum of a and b is: "+ (a + b ));
		System.out.println("Diff of a and b is: "+(a - b));
		System.out.println("Cof of a and b is: "+(a * b));
		System.out.println("Mod of a and b is: "+(a % b));
		
		//Relational operators --> == < > <= >= !=
		//Always return boolean value
		System.out.println("----------------- Relational operators ----------------------------");
		System.out.println(a == b); // false
		System.out.println(a > b); //false
		System.out.println(a < b); //true 
		System.out.println(a != b); //true
		
		//Logical operators --> && || !
		//Works between boolean
		System.out.println("----------------- Logical operators ----------------------------");
		boolean x = true;
		boolean y = false; 
		
		System.out.println(x && y);//false 
		System.out.println(x || y); //true
		System.out.println(! y); //true
		System.out.println(! x); //false
		
		// Increment / Decrement operators ++ --
		System.out.println("----------------- Increment / Decrement operators ----------------------------");
		a = 10;
		a ++; // a = a+1;
		System.out.println(a); //11
		
		b = 30;
		b --; //b = b-1;
		System.out.println(b); //29

	}

}
