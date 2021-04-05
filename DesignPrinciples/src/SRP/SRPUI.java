package SRP;


public class SRPUI {

	public static void main(String[] args) {
	
		Employee employee = new Employee("Bhaskar",10,"Band8");
		EmployeePayCalculate paycalculate = new EmployeePayCalculate();
		paycalculate.calculateSalary(employee);
		
		EmployeeReport report = new EmployeeReport();
		report.printEmployeeReport("salaryreport", employee);
		
		SaveEmployeeDetail saveemployee = new SaveEmployeeDetail();
		saveemployee.saveEmployeeDetails(employee, "insert");
		
		
	}
}
