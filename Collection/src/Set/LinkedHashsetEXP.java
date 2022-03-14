package Set;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashsetEXP {
	public static void main(String[] args) {
		
		Set<String> car = new LinkedHashSet<String>(); //sap xep theo danh sach
		car.add("Toyota");
		car.add("Huyndai");
		car.add("Honda");
		
		for(String c: car) {
			System.out.print(c + " ");
		}
		
	}
}
