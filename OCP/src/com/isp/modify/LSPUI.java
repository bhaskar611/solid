package com.isp.modify;

public class LSPUI {

	public static void main(String[] args) {
	
		ITimeCard timecardPay = new HourlySalalry();
		timecardPay.addTimeCardDetails();
		timecardPay.calculateSalary();
		
		IPayClassification pay = new CommisionSalalry();
		pay.calculateSalary();
	}
}
