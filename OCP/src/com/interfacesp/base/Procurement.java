package com.interfacesp.base;

public class Procurement {

	private IPayment _paymentHandler;
	
	public Procurement(IPayment paymentHandler)
	{
		_paymentHandler=paymentHandler;
	}
	public void calculatepayment()
	{
		_paymentHandler.savePaymentDetails();
		_paymentHandler.saveCreditcardDetals();
	}
}
