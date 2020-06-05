package Model;


import java.util.ArrayList; 
import java.util.Collections;
import java.util.List;


public class Customers {

	ArrayList<Customer> customers;
	
	public Customers() {
	customers = new ArrayList<>();
	}
	public ArrayList<Customer> getCustomers() {
		return customers;
	}
	public void setCustomers(ArrayList<Customer> customers) {
		this.customers = customers;
	}
	public void clear() {
		customers.clear();
	}

	public void remove(Customer a) {
		customers.remove(a);
	}

	public void remove(Customer... cut) {
		for (Customer a: cut) {
			remove(a);
		}
	}

	
	public void addAll( List<Customer> customerList ) {
		customers.addAll( customerList );
	}
	
	public List<Customer> getAccounts(){
		return Collections.unmodifiableList( customers );
	}
	
	@Override
	public String toString() {
		return "Customer [customer=" + customers + "]";
	}

	
}
