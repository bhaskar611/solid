package com.interfacesp.base;

public class CreditCardPayment implements IPayment {
	
	public void savePaymentDetails() {
		System.out.println("save payment details to the database for offline procurement");
	}
	
 
	public void saveCreditcardDetals() {
	
	System.out.println("save credit card details to the database for online procurement");

	}

}
