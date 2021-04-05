package SRP;

public class EmployeeReport {
	public void printEmployeeReport(String reportType , Employee employee)
	{
		String employeeName = employee.getName();
		if(reportType.equalsIgnoreCase("salaryreport"))
		{
			System.out.println("print salary report" +employeeName);
		
		}
		else if (reportType.equalsIgnoreCase("performancereport"+employeeName)) {
			System.out.println("print performance report"+employeeName);
		}
	}
}
