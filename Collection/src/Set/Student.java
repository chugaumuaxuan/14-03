package Set;

public class Student implements Comparable<Student> {
	private String name;
	private int age;
	
	public Student(String n, int a){
		name = n;
		age = a;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String toString() {
		return "Ten " + name + " Tuoi " + age;
		
	}

	@Override
	public int compareTo(Student student) {	//so sanh ten de sap xep tra ve gia tri 
		return this.getName().compareTo(student.getName());
		
	}
	
	
}
