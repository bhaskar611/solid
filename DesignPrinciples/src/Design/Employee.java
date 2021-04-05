package Design;

public class Employee {
	String name;
	int age;
	String grade;
	
	public Employee(String name, int age, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.grade = grade;
	}
	
	public double calculateSalaray(String grade) {
		
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
	
	public boolean saveEmployeeDetails(Employee employee, String mode) {
		
		if(mode.equalsIgnoreCase("insert")) {
			System.out.println("insert the value in DB");
			
			return true;
			
		} else
		{
			System.out.println("insert the value in DB");
			
			return true;
		}
		
	}
	
	public void printEmployeeReport(String reportType)
	{
		if(reportType.equalsIgnoreCase("salaryreport"))
		{
			System.out.println("print salary report");
		
		}
		else if (reportType.equalsIgnoreCase("performancereport")) {
			System.out.println("print performance report");
		}
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

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
}
