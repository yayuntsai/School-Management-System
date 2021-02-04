package school.management.system;

/**
 * This class is responsible for keep the
 * track of students fees, name, grade & fees paid
 * 
 */
public class Student {

		private int id; 
		private String name;
		private int grade;
		private int feesPaid;
		private int feesTotal;
		
		/**
		 * To create a new student by initializing.
		 * @param id
		 * @param name
		 * @param grade
		 * @param feesPaid
		 * @param feesTotal
		 */
		
		public Student(int id, String name, int grade) {
			this.feesPaid = 0;
			this.feesTotal = 30000;
			this.id = id;
			this.name = name;
			this.grade = grade;
			 
		}
		
		
		/**
		 * Use to upgrade stuent's grade
		 * @param grade
		 */
		public void setGrade(int grade) {
			this.grade = grade;
		}
		
		
		/**
		 * feespaid = 10000 + 5000 + 150000
		 * Add the fees to the fees paid.
		 * The school is going to receive the funds.
		 * @param fees
		 */
		public void payFees(int fees) {
			feesPaid += fees;
			School.updateTotalMoneyEarned(feesPaid);
		}
		
		public String getName() {
			return name;
		}
		
		public int getId() {
			return id;
		}
		
		public int getGrade() {
			return grade;
		}
		
		public int getFeesPaid() {
			return feesPaid;
		}
		
		
		public int getFeesTotal() {
			return feesTotal;
		}
		
		public int getRemainingFees() {
			return feesTotal-feesPaid;
		}
}






