package inheritance;

public class Main {

	public static void main(String[] args) {
		
		IndividualCustomer engin = new IndividualCustomer();
		
		engin.customerNumber= "1234";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		
		hepsiBurada.customerNumber = "7896";
		
		Sendika sendikalar = new Sendika();
		
		sendikalar.customerNumber ="9999";
		
		
		CustomerManager customerManager = new CustomerManager();
		
	    Customer[] customers = {engin, hepsiBurada, sendikalar};
	    
	    customerManager.addMultiple(customers);		
		customerManager.add(hepsiBurada);
		customerManager.add(engin);
		customerManager.add(sendikalar);
		
		
	}
		 
 }


