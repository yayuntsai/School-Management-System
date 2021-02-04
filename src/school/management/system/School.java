package school.management.system;

import java.util.List;

public class School {
	
//	private Teacher teacher;
//	private Student student;
//	private static int totalMoneyEarned;
//	private static int totalMoneySpent;
	

	private List<Teacher> teachers;
	private List<Student> students;
	private static int totalMoneyEarned;
	private static int totalMoneySpent;
	
	
	public School(List<Teacher> teachers, List<Student> students) {
		this.teachers = teachers;
		this.students = students;
		totalMoneyEarned = 0;
		totalMoneySpent = 0;
	}
	
	public List<Teacher> getTeachers(){
		return teachers;
	}
	
	public void addTeachers(Teacher teacher) {
		teachers.add(teacher);
	}
	
	/*
	 * Return the list of students in the school
	 */
	public List<Student> getStudents(){
		return students;
	}
	
	/*
	 * Add a student to the school
	 */
	public void addStudents(Student student) {
		students.add(student);
	}
	
	public int getTotalMoneyEarned() {
		return totalMoneyEarned;
	}
	
	public static void updateTotalMoneyEarned(int moneyEarned) {
		totalMoneyEarned += moneyEarned;
	}
	
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	 
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneySpent -= moneySpent;
	}
}
 