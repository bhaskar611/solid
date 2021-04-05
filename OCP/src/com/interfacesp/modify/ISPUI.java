package com.interfacesp.modify;

public class ISPUI {

	public static void main(String[] args) {
	
		IPayment pay = new Payment();
		Procurement offlineprocurement = new Procurement();
		offlineprocurement.savePayment(pay);

		System.out.println("<<<<<<<<>>>>>>>");
		
		IOnlinePayment onlinepay = new CreditCardPayment();
		Procurement onlineprocurement = new Procurement();
		onlineprocurement.savePayment(onlinepay);
		onlineprocurement.savecardDetails(onlinepay);
	}
}
