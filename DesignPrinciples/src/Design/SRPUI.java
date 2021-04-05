package Design;

public class SRPUI {
	public static void main(String[] args) {
		Employee employee = new Employee("Bhaskar",10,"Band8");
		employee.calculateSalaray(employee.getGrade());
		employee.printEmployeeReport("salaryreport");
		employee.saveEmployeeDetails(employee, "insert");
		
	}
}
