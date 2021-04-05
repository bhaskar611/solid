package com.interfacesp.modify;

public class CreditCardPayment implements IOnlinePayment {

	@Override
	public void savePaymentDetails() {
		// TODO Auto-generated method stub
		System.out.println("save payment details to the database for online procurement");
	}

	@Override
	public void saveCreditcardDetails() {
		// TODO Auto-generated method stub
		System.out.println("save credit card details to the database for online procurement");
	}
	
	

}
