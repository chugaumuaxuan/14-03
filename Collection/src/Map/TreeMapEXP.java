package Map;

import java.util.Set;
import java.util.TreeMap;

public class TreeMapEXP {
	public static void main(String[] args) {
		
		TreeMap<Integer, String> car = new TreeMap<Integer, String>();	//TreeMap khong cho key null, value co the null
		
		car.put(1, "Toyota");
		car.put(2, "Honda");
		car.put(3, null);
		System.out.println(car);
		
		for(Integer i : car.keySet()) {
			System.out.println(i + " " + car.get(i));
		}
	}
}
