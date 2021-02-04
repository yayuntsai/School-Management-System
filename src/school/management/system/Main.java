package school.management.system;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args){
		Teacher Lizzy = new Teacher(1, "Lizzy", 500);
		Teacher Mellisa = new Teacher(2, "Mellisa", 600);
		Teacher Vick = new Teacher(3, "Vick", 700);
		
		List<Teacher> teacherList = new ArrayList<>();
		teacherList.add(Lizzy);
		teacherList.add(Mellisa);
		teacherList.add(Vick);
		
		Student Tamasha = new Student(1, "Tamasha", 4);
		Student Rabbi = new Student(2, "Rabbi", 6);
		Student Ruby = new Student(3, "Ruby", 7);
		
		List<Student> studentList = new ArrayList<>();
		studentList.add(Tamasha);
		studentList.add(Rabbi);
		studentList.add(Ruby);
		
		
		School ghs = new School(teacherList, studentList);
//		ghs.getTotalMoneyEarned();
		
		
		Tamasha.payFees(5000);
		System.out.print(ghs.getTotalMoneyEarned());
		Lizzy.receiveSalary(Lizzy.getSalary());
		System.out.print(ghs.getTotalMoneyEarned());
	}
}
