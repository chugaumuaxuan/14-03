package List;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;
import java.util.Vector;

public class ListEXP {
	public static void main(String[] args) {
		
		//ArrayList
		List<String> list1 = new ArrayList<String>();
		list1.add("A");
		list1.add("B");
		list1.add("C");
		list1.add("" + 1);
			
		for(String l: list1 ) {
			System.out.print(l + " ");
		}
		
		System.out.println(" ");
		
		//LinkedList
		List<String> list2 = new LinkedList<String>();
		list2.add("Nguyen");
		list2.add("Tran");
		list2.add("Pham");
		
		
		for(String l2: list2) {
			System.out.print(l2 + " ");
		}
				
		System.out.println(" ");
		
		//Vector
		int v = 5;
		List<String> list3 = new Vector();
		for(int i = 0; i < v; i++) {
			list3.add("0" + i);
		}
		System.out.println(list3);	
		
		//Stack extends Vector
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println(stack);
		
//		Integer i = stack.pop();
//		System.out.println(i); //tra ve doi tuong cuoi cung dong thoi xoa khoi mang
		
//		Integer j = stack.peek();
//		System.out.println(j);// tra ve doi duong cuoi cung
		
		int position = stack.search(1);
		System.out.println(position); 
		
		boolean empty = stack.empty();
		System.out.println(empty);
		
			
	}
}

