package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer akif = new IndividualCustomer();
		akif.customerNumber= "123";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber= "789";
		
		Vak�fCustomer xVak�f = new Vak�fCustomer();
		xVak�f.customerNumber="456";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {akif, xVak�f, hepsiBurada};
		customerManager.addMultiple(customers);

	}

}
