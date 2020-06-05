package Connection;
import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;

import Model.CustomerException;

public class OracleConnection {

	private Connection connection; 
	public OracleConnection() throws CustomerException
	{
		try 
		{
			Class.forName("oracle.jdbc.OracleDriver");
			open();
		} catch (ClassNotFoundException e)
		{
			throw new CustomerException("Can not find Driver");
		}
	}
	
	public void open() throws CustomerException
	{
		try {
			connection = DriverManager.getConnection("jdbc:oracle:thin:localhost:1521:ORCL", "DEMO", "oracle");
		} catch (SQLException e) {						
			throw new CustomerException("Can not open the Database");
		}
	}
	
	
	public void close() throws CustomerException
	{
		try {
			connection.close();
		} catch (SQLException e) {
			throw new CustomerException("Can not close the Database");
		}
	}
	public Connection getConnection()
	{
		return connection;
	}
}