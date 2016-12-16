package jdbc;

import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;

/**
 * Created by a1 on 12.12.16.
 */
public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/my_jdbc";

    public static void main(String[] args) throws SQLException {
        try {
            Driver driver = new FabricMySQLDriver();
            DriverManager.registerDriver(driver);
        } catch (SQLException ex){
            System.out.println("Error registring driver!");
            return;
        }

        try (Connection connection =
                 DriverManager.getConnection( URL, USERNAME, PASSWORD);
             Statement statement = connection.createStatement()) {

            statement.execute("insert into my_jdbc.products (product_name, product_price, shop_id) values ('Moroshka', 58, 3)");


        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        /*Connection connection = null;
        Driver driver;

        try {
            driver = new FabricMySQLDriver();
        }
        catch (SQLException ex) {
            System.out.println("Error loading driver.");
            return;
        }

        try {
            DriverManager.registerDriver(driver);
        }
        catch (SQLException ex) {
            System.out.println("Error loading driver.");
            return;
        }


        try {
            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            System.out.println("... CODE ...");
        }
        catch (SQLException ex) {
            System.out.println("Error making connection.");
            return;
        }
        finally {
            if(connection != null) {
                connection.close();
            }
        }*/
    }
}
