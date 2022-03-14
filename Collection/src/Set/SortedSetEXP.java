package Set;

import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetEXP {
	public static void main(String[] args) {
		
		Student st1 = new Student("B", 12);
		Student st2 = new Student("C", 22);
		Student st3 = new Student("A", 32);
			
		SortedSet<Student> ss = new TreeSet<Student>();
		ss.add(st1);
		ss.add(st2);
		ss.add(st3);
		
		System.out.println(ss);
		
		//kiem tra phan tu
		Student st4 = new Student("D", 32);
		System.out.println("Kiem tra co phan tu st4 khong? " + ss.contains(st4));
		
		//xoa phan tu
		ss.remove(st3);
		System.out.println(ss);
		
		for(Student s : ss) {
			System.out.println(s);
		}
	}
}
