package com.ocp.modify;

public class OCPUI {

	public static void main(String[] args) {
	
		Employee employee = new Employee();
		employee.setName("bhaskar");
		Hourly commision = new Hourly();
		employee.setSalaryType(commision);
		PayRoll payroll = new PayRoll();
		payroll.calculateSalary(employee);

	}
}
