package Service;

import java.sql.Connection; 
import Model.CustomerException;
import Model.Customers;
import persistence.CustomerRepository;

public class CustomerService {
	private Connection con;
	private CustomerRepository customerRepository;
	
	public CustomerService(Connection con)
	{
		this.con=con;
		this.customerRepository = new CustomerRepository();
	}	
	public void getCustomers(Customers customer) throws CustomerException
	{
		customer.clear();
		customer.addAll(customerRepository.selectAll(con));
	}	
}
