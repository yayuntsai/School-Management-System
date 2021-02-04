package school.management.system;

public class Teacher {
	
	private int id; 
	private String name;
	private int salary;
	private int salaryEarned = 0;
	
	
	public Teacher(int id, String name, int salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}
	
	/**
	 * Return the parameters
	 * @return
	 */
	
	public String getName() {
		return this.name;
	}
	
	public int getId() {
		return this.id;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public void setSalary(int salary) {
		this.salary = salary;
	}
	
	public void receiveSalary(int salary) {
		setSalaryEarned(getSalaryEarned() + salary);
		School.updateTotalMoneyEarned(salary);
	}

	public int getSalaryEarned() {
		return salaryEarned;
	}

	public void setSalaryEarned(int salaryEarned) {
		this.salaryEarned = salaryEarned;
	}
}
