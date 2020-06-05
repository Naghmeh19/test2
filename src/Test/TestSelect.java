package Test;
import Connection.OracleConnection;
import Model.CustomerException;
import Model.Customers;
import Service.CustomerService;



public class TestSelect {


	public static void main(String[] args) {
		
			try {
				// create domain
				Customers customer = new Customers();
				
				// create oracle connection
				OracleConnection oracon = new OracleConnection();
				
				// create service layer
				CustomerService customerService = new CustomerService( oracon.getConnection() );
				
				// call service methods ...
				customerService.getCustomers(customer);
				
				// verify
				System.out.println( customer );
				
				oracon.close();
			} catch ( CustomerException e ) {
				System.out.println( e.getMessage() );
			}
		}

}