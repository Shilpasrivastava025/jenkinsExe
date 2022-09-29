package GenericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

/**
 * This class consist of generic methods related to database
 * @author Shilpa
 *
 */

public class DatabaseLibrary {
	 Driver driverRef;
	 Connection conn;
	 
	 /**
	  * This method will establish the connection with database
	  * @throws SQLException
	  */
	 public void connectToDatabase() throws SQLException
	 {
		 driverRef = new Driver();
		 DriverManager.registerDriver(driverRef);
		 conn = DriverManager.getConnection(IConstantsLibrary.dbURL, IConstantsLibrary.dbUsername , IConstantsLibrary.dbPassword);
	 }

	 /**
	  * This method will close the connection
	  * @throws SQLException
	  */
	 public void closeDb() throws SQLException
	 {
		 conn.close();
	 }
	 
	 /**
	  * This methods will execute a query, Fetch the data and Verify the data 
	    in database with expected from the caller.
	  
	  * @param query
	  * @param columnIndex
	  * @param ExpData
	  * @return
	  * @throws SQLException
	  */
	 public String executeQueryandReturnData(String query, int columnIndex, String ExpData) throws SQLException
	 {
		 ResultSet result = conn.createStatement().executeQuery(query);
		 boolean flag = false;
		 while (result.next())
	  {
		 String actData = result.getString(columnIndex);
		 if(ExpData.equalsIgnoreCase(actData))
		 {
			 flag= true;
			 break;
		 }
	  }
	
		 if(flag)
	 {
		 System.out.println("Data is Verified");
		 return ExpData;
	 }
	
		 else
	   {
		 System.out.println("The data is not verified");
		 return " ";
	   }
	 
	 }
}
