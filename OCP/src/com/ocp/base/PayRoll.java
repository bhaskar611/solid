package com.ocp.base;

public class PayRoll {

	public void calculateSalary(Employee employee)
	{
		if(employee.getSalaryType().equals("commision"))
		{
			System.out.println("Caliculated pay for commision based salary ");
			
		} 
		else if (employee.getSalaryType().equals("Monthly"))
		{
			System.out.println("caliculated pay for monthly salary");
		}
	}
}
