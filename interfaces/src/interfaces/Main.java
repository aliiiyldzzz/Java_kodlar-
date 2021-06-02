package interfaces;

public class Main {

	public static void main(String[] args) {
	
		Logger[] loggers = {new SmsLogger(), new FileLogger(), new EmailLogger()};
		CustomerManager customerManager = new CustomerManager(loggers);
		
		Customer engin = new Customer(1,"engin","demiröð");
		
		customerManager.add(engin);
	}

}
 