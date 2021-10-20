package inheritance;

public class CustomerManager {
	public void add(Customer customer) {
		System.out.println(customer.customerNumber + " Kaydedildi");
	}
	
	//bulk olay� = �oklu i�lem;
	
	public void addMultiple(Customer[] customers) {
		for (Customer customer: customers) {
			add(customer);
		}
	}
}
