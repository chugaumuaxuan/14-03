package Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComparableEXP {
	public static void main(String[] args) {
		
		Student st1 = new Student("B" , 12);
		Student st2 = new Student("A", 10);
		Student st3 = new Student("C", 11);

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);
		
		Collections.sort(listStudent);
		for(Student s : listStudent) {
			System.out.println(s);
		}
		
		List<Student> listStudent2 = new ArrayList<Student>();
		listStudent2.addAll(listStudent);
	}
}
