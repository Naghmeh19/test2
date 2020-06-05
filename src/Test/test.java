package Test;
import java.sql.Connection;
import java.sql.SQLException;
import Connection.OracleConnection;
import Model.CustomerException;

public class test {
	public static void main(String[]args)	
	{
		try {
			OracleConnection oracleConnection= new OracleConnection();
			oracleConnection.open();
			Connection connection = oracleConnection.getConnection();
			System.out.println(connection.getMetaData().getDatabaseMajorVersion());
		}
		catch (CustomerException e) 
		{
			System.out.println(e.getMessage());
		} 
		catch (SQLException e)
		{
			System.out.println(e.getMessage());
		}	
	}
}
