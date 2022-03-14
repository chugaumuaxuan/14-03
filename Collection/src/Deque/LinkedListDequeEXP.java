package Deque;

import java.util.Deque;
import java.util.LinkedList;

public class LinkedListDequeEXP {
	public static void main(String[] args) {
		
		Deque<String> city = new LinkedList<String>();
		city.add("Tokyo");
		city.add("Hanoi");
		city.add("Paris");
		
		city.addFirst("Venice");
		
		for(String c : city) {
			System.out.print(c + " ");
		}
		
		System.out.println();
		
		city.addLast("HCM city");
		for(String c : city) {
			System.out.print(c + " ");
		}	
	}
}
