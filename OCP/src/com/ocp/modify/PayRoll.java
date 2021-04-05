package com.ocp.modify;

public class PayRoll {

	public void calculateSalary(Employee employee)
	{
		employee.getSalaryType().calculateSalary();
	}
}
