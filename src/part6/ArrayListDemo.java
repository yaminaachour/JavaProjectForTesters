package part6;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {

//		- How to declare arraylist
		//ArrayList list = new ArrayList(); //we can store any type of elements (string /integer)
		
		//ArrayList <Integer> list = new ArrayList<Integer>(); // store Integer elements
		ArrayList <String> list = new ArrayList<String>(); //Store  string elements
		
//		- How to add element / values to array list
		list.add("Walid");
		list.add("Souaad");
		list.add("Mariem");
		list.add("Marouen");
		list.add("Hedia");

		//list.add(100); //Integer /Number
		//list.add('A'); //Char
		
		//print all the value
		System.out.println(list);
		
//		- Find size of array list
		System.out.println(list.size());
		System.out.println("Before removing element: " +list);
		
//		- Remove element / values from array list
		list.remove(2);
		System.out.println(list.size());
		System.out.println("After removing element: " +list);
		
//		- Insert a new element in the middle of array list
		list.add(4, "Saiid");
		System.out.println(list.size());
		System.out.println("After insert element: " +list);
		
//		- Read value from arra list
//		for(String s:list) {
//			System.out.println(s);
//		}
		
		//Object we can store any type of value
		for(Object s:list) {
			System.out.println(s);
		}


	}

}
