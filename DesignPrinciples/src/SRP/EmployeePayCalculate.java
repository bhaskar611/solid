package SRP;

public class EmployeePayCalculate {
	
	public double calculateSalary(Employee employee) {
		String grade= employee.getGrade();
		
		double salary=0.0;
		
		if(grade=="Band8")
		{
			salary = 30*500;
		}
		else if(grade=="Band7") 
		{
			salary = 30*400;
		}
		else if(grade=="Band6") 
		{
			salary = 30*300;
		}
		System.out.println("salary for this grade>>>" + salary);
		return salary;
		
		
	}
}
