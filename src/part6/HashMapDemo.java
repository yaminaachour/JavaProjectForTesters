package part6;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {

	public static void main(String[] args) {

//		- Declare Hashmap
		//HashMap m = new HashMap(); // Declaration 1
		HashMap<Integer, String> hm = new HashMap<Integer, String>();
		
//		- Add element to hashmap
		hm.put(101, "Barcelone");
		hm.put(102, "Tunis");
		hm.put(103, "Casablanca");
		hm.put(104, "Tanger");
		
		System.out.println(hm);
		
//		- Remove element from Hashmap
		hm.remove(101); // remove by key
		System.out.println("After removing a pair: " +hm);
		
//		- Read pairs of hashmap
         for(Map.Entry m: hm.entrySet()) {
        	 System.out.println(m.getKey()+ " " +m.getValue());
         }

	}

}
