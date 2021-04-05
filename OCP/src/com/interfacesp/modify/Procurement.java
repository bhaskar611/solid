package com.interfacesp.modify;

public class Procurement {

	public void savePayment(IPayment payment)
	{
		payment.savePaymentDetails();
	}
	
	public void savecardDetails(IOnlinePayment onlinepayment)
	{
		onlinepayment.saveCreditcardDetails();
	}
}
