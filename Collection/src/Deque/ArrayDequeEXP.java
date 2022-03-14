package Deque;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeEXP {
	public static void main(String[] args) {
		
		Deque<String> capital = new ArrayDeque<String>();
		capital.add("Tokyo");
		capital.add("Hanoi");
		capital.add("Paris");
		
		for(String c : capital ) {
			System.out.print(c + " ");
		}
	}
}
