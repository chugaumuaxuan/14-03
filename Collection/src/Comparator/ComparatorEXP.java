package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorEXP {
	public static void main(String[] args) {
		
		Student st1 = new Student("B" , 12);
		Student st2 = new Student("A", 10);
		Student st3 = new Student("C", 11);

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
		
		//sap xep theo tuoi
		System.out.println("Sap xep theo tuoi");
		Collections.sort(listStudent, new Comparator<Student>() {
		@Override
			public int compare(Student o1, Student o2) {
				return o1.getAge() > o2.getAge() ? 1 : -1;
			}
		});
			
		for(Student s : listStudent) {
			System.out.println(s);
		}
		
		
		Collections.sort(listStudent, new Comparator<Student>() {
			@Override
			public int compare(Student o1, Student o2) {
				return o1.getName().compareTo(o2.getName());
			}
		});
		
		System.out.println("Sap xep theo ten: ");
		for(Student s : listStudent) {
			System.out.println(s);
		}
		
		
	}
}
