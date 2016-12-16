package ru.smurtazin.experiments;

// import java.sql.*;
// import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;

public class Experiments {

	// --------------------------------------------------------------------
	private static final String USERNAME = "root";
  private static final String PASSWORD = "root";
  private static final String URL = "jdbc:mysql://localhost:3306/my_jdbc";

	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		String sql_query = "INSERT INTO my_jdbc.products (product_name, product_price, shop_id) VALUES ('KKulic', 1, 1)";

		/*try {
  // conn = DriverManager.getConnection( "jdbc:mysql://localhost/test?user=minty&password=greatsqldb");
  	conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);

		   // Do something with the Connection
		   // ...
		} catch (SQLException ex) {
		  // handle any errors
		  System.out.println("SQLException: " + ex.getMessage());
		  System.out.println("SQLState: " + ex.getSQLState());
		  System.out.println("VendorError: " + ex.getErrorCode());
		}*/

		try {
			conn = DriverManager.getConnection(URL, USERNAME, PASSWORD);
		  stmt = conn.createStatement();
		  
		  // rs = stmt.executeQuery( sql_query );
		  stmt.executeUpdate( sql_query );
		  // rs = stmt.executeUpdate( sql_query );
		  // rs = stmt.execute( sql_query );

		  if (stmt.execute( sql_query )) {
		    rs = stmt.getResultSet();
		  }

		  // Do someth with the ResultSet ....
		}
		catch (SQLException ex){
		  // handle any errors
		  System.out.println("SQLException: " + ex.getMessage());
		  System.out.println("SQLState: " + ex.getSQLState());
		  System.out.println("VendorError: " + ex.getErrorCode());
		}
		finally {
		  // it is a good idea to release
		  // resources in a finally{} block
		  // in reverse-order of their creation
		  // if they are no-longer needed

		  if (rs != null) {
		    try {
		      rs.close();
		    } catch (SQLException sqlEx) { } // ignore
		    rs = null;
		  }

		  if (stmt != null) {
		    try {
		      stmt.close();
		    } catch (SQLException sqlEx) { } // ignore
		    stmt = null;
		  }
		}
		// --------------------------------------------------------------------

		

	}
}