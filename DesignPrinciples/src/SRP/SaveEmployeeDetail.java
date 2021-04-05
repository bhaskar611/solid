package SRP;

import Design.Employee;

public class SaveEmployeeDetail {
	
	public boolean saveEmployeeDetails(SRP.Employee employee, String mode) {
		String employeeName = employee.getName();
		if(mode.equalsIgnoreCase("insert")) {
			System.out.println("insert the value in DB");
			
			return true;
			
		} else
		{
			System.out.println("insert the value in DB");
			
			return true;
		}
		
	}
	
}
