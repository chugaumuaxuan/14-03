package Set;

import java.util.TreeSet;

public class TreeSetEXP {
	public static void main(String[] args) {
		TreeSet<String> flowers = new TreeSet<String>(); //sap xep theo gia tri
		flowers.add("Roses");
		flowers.add("Violet");
		flowers.add("Sunflower");	
		
		for(String f : flowers) {
			System.out.print(f + " ");
		}
		
		System.out.println();
		
		Student st1 = new Student("Nguyen", 12);
		Student st2 = new Student("Pham", 22);
		
		TreeSet<Student> studentList = new TreeSet<Student>();
		studentList.add(st1);
		studentList.add(st2);
		
		for(Student s : studentList) {
			System.out.println(s.toString());
		}
		
		
	}
}
