package Map;

import java.util.HashMap;
import java.util.Map;

import Set.Student;

public class HashMapEXP {
	public static void main(String[] args) {
		
		//HashMap khong luu the thu tu
		Map<String, Integer> map = new HashMap<String, Integer>();

		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("four", 4);
		map.put("five", 5);
		map.put("five", 6);
		
		System.out.println(map);
		
		Student st1 = new Student("B", 12);
		Student st2 = new Student("C", 22);
		Student st3 = new Student("A", 32);
		
		Map<Integer, Student> m = new HashMap<Integer, Student>();
		m.put(1, st1);
		m.put(2, st2);
		m.put(3, st3);
		
		System.out.println(m);
		
		m.remove(1); //remove obj by key
		System.out.println(m);
		
		System.out.println(m.keySet());// tim tat ca cac key
		
	}
}
