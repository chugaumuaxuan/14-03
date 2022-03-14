package Search;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import Comparator.Student;

public class Main {
	public static void main(String[] args) {
		Student st1 = new Student("B" , 12);
		Student st2 = new Student("A", 10);
		Student st3 = new Student("C", 11);

		List<Student> listStudent = new ArrayList<Student>();
		listStudent.add(st1);
		listStudent.add(st2);
		listStudent.add(st3);

		Collections.sort(listStudent);
		System.out.println(listStudent);
		
		//lay thong tin cua 1 phan tu bang binarySearch	
		int index = Collections.binarySearch(listStudent, st1);
		if(index >= 0) {
			st1 = listStudent.get(index);
		}
		System.out.println("Hoc sinh thu 1: " + st1);
	
	}
}
