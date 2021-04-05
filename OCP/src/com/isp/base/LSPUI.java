package com.isp.base;

public class LSPUI {

	public static void main(String[] args) {
	
		PayClassification pay = new CommisionSalalry();
		pay.addTimeCardDetails();
		pay.calculateSalary();
	
	}
}
