package Map;

import java.util.LinkedHashMap;
import Set.Student;

public class LinkHashMapEXP {
	public static void main(String[] args) {
		
		//LinkedHashMap luu theo thu tu key
		LinkedHashMap<String, Integer> lhm = new LinkedHashMap<String, Integer>();
		
		lhm.put("five", 5);
		lhm.put("one", 1);
		lhm.put("two", 2);
		lhm.put("three", 3);
		lhm.put("four", 4);
		System.out.println(lhm);
		

		Student st1 = new Student("B", 12);
		Student st2 = new Student("C", 22);
		Student st3 = new Student("A", 32);
		
		LinkedHashMap<Integer, Student> SList = new LinkedHashMap<Integer, Student>();
		SList.put(3, st3);
		SList.put(1, st1);
		SList.put(2, st2);
		System.out.println(SList);
	}
}
