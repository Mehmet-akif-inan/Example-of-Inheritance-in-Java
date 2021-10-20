package inheritance;

public class Main {

	public static void main(String[] args) {
		IndividualCustomer akif = new IndividualCustomer();
		akif.customerNumber= "123";
		
		CorporateCustomer hepsiBurada = new CorporateCustomer();
		hepsiBurada.customerNumber= "789";
		
		VakýfCustomer xVakýf = new VakýfCustomer();
		xVakýf.customerNumber="456";
		
		
		CustomerManager customerManager = new CustomerManager();
		
		Customer[] customers = {akif, xVakýf, hepsiBurada};
		customerManager.addMultiple(customers);

	}

}
