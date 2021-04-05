package com.interfacesp.base;

public class ISPUI {

	public static void main(String args[]) {
		
		IPayment pay = new Payment();
		Procurement procurement = new Procurement(pay);
		procurement.calculatepayment();
		
		System.out.println("<<<<<<<<<>>>>>>>>>>>>");
		
		IPayment onlinepay = new CreditCardPayment();
		Procurement onlineprocurement = new Procurement(onlinepay);
		onlineprocurement.calculatepayment();
	}
}
