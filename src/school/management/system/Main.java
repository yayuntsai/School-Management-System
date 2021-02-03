package school.management.system;

import java.util.List;

public class Main {
	public static void main(String[] args){
		Teacher Lizzy = new Teacher(id:1, name:"Lizzy", salary:500);
		Teacher Mellisa = new Teacher(id:2, name:"Mellisa", salary:600);
		Teacher Vick = new Teacher(id:3, name:"Vick", salary:700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(Mellisa);
		teacherList.add(Vick);
		
		Student Tamasha = new Student(id:1, name:"Tamasha", grade:4);
		Student Rabbi = new Student(id:2, name:"Rabbi", grade:6);
		Student Ruby = new Student(id:3, name:"Ruby", grade:7);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(Tamasha);
		studentList.add(Rabbi);
		studentList.add(Ruby);
	}
}
