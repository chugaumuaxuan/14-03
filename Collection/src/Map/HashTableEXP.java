package Map;

import java.util.Hashtable;
import java.util.Set;

import Set.Student;

public class HashTableEXP {
	public static void main(String[] args) {
		
		Hashtable<String, Integer> ht = new Hashtable<String, Integer>();
		
	  //ht.put(null, null);	Khong cho key hoac value null
		ht.put("five", 5);
		ht.put("one", 1);
		ht.put("two", 2);
		ht.put("three", 3);
		ht.put("four", 4);
		System.out.println(ht);
		

		Student st1 = new Student("B", 12);
		Student st2 = new Student("C", 22);
		Student st3 = new Student("A", 32);
		
		Hashtable<Integer, Student> stList  = new Hashtable<Integer, Student>();
		stList.put(1, st1);	
		stList.put(2, st2);		
		stList.put(3, st3);
		
		for(Integer i: stList.keySet()) {
			System.out.println(i + " " + stList.get(i) );
		}
	}
}
