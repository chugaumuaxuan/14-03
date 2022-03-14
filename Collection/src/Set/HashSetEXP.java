package Set;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetEXP {
	public static void main(String[] args) {
		
		Set<String> fruits = new HashSet<String>();	//Hashset khong add theo thu tu 
		fruits.add("Banana");
		fruits.add("Apple");
		fruits.add("Watermelon");
		
		for(String f : fruits) {
			System.out.print(f + " ");
		}
		
		System.out.println();
		System.out.println("Co tat ca " + fruits.size() + " phan tu");
		System.out.println("fruits co chua Lemon khong? " + fruits.contains("Lemon"));
		
		//copy du lieu sang setB
		Set<String> setB = new HashSet<String>();
		setB.addAll(fruits);
		System.out.println(setB);
		
		//convert Set to List
		List<String> A = new ArrayList<String>();
		A.addAll(setB);
		System.out.println(A);
	}
}
