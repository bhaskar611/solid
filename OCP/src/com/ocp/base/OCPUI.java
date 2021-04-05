package com.ocp.base;

public class OCPUI {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		employee.setName("Bhaskar");
		employee.setSalaryType("Monthly");
		
		PayRoll payroll = new PayRoll();
		payroll.calculateSalary(employee);
	
	}
	
}
