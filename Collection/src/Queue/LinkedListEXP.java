package Queue;

import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class LinkedListEXP {
	public static void main(String[] args) {
		
		Queue<String> animals = new LinkedList<String>();
		animals.add("cat");
		animals.add("dog");
		animals.add("lion");
		
		for(String a : animals) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		
		//offer() is used when add() can't be used
		animals.offer("mouse");	
		
		for(String a : animals) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		String accessAnimals = animals.peek(); //tra ve phan tu dau
		System.out.println(accessAnimals);
		
		
		String p = animals.poll(); //tra ve va loai bo phan tu dau
		System.out.println(p);
		System.out.println(animals);
		
	//	Queue<String> animals3 = new PriorityQueue<String>();

	}
}
