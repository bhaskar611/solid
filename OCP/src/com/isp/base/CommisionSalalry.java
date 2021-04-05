package com.isp.base;

public class CommisionSalalry extends PayClassification {
	
	public float calculateSalary() {
		System.out.println("Calculate salalry for commision");
		return 0;
		
	}
	
	public void addTimeCardDetails() {
		throw new RuntimeException("No support");
	}
}
