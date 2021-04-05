package com.interfacesp.base;

public class Payment implements IPayment {

	public void savePaymentDetails() {
		System.out.println("save payment details to the database for online procurement");
	}
	
	public void saveCreditcardDetals() {
		// TODO Auto-generated method stub
		System.out.println("No action for this functionality needed for offline payment");

	}
}
