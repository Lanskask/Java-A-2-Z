package ru.smurtazin.experiments;

//import com.mysql.fabric.jdbc.FabricMySQLDriver;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by a1 on 12.12.16.
 */
public class Main {
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";
    private static final String URL = "jdbc:mysql://localhost:3306/my_jdbc";

//    public static void main(String[] args) throws SQLException {
//        try {
//            Driver driver = new FabricMySQLDriver();
//            DriverManager.registerDriver(driver);
//        } catch (SQLException ex){
//            System.out.println("Error registring driver!");
//            return;
//        }
//
//        try (Connection connection =
//                 DriverManager.getConnection( URL, USERNAME, PASSWORD);
//             Statement statement = connection.createStatement()) {
//
//            statement.execute("insert into my_jdbc.products (product_name, product_price, shop_id) values ('Moroshka', 58, 3)");
//
//
//        } catch (SQLException ex) {
//            ex.printStackTrace();
//        }
//        /*Connection connection = null;
//        Driver driver;
//
//        try {
//            driver = new FabricMySQLDriver();
//        }
//        catch (SQLException ex) {
//            System.out.println("Error loading driver.");
//            return;
//        }
//
//        try {
//            DriverManager.registerDriver(driver);
//        }
//        catch (SQLException ex) {
//            System.out.println("Error loading driver.");
//            return;
//        }
//
//
//        try {
//            connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
//
//            System.out.println("... CODE ...");
//        }
//        catch (SQLException ex) {
//            System.out.println("Error making connection.");
//            return;
//        }
//        finally {
//            if(connection != null) {
//                connection.close();
//            }
//        }*/
//    }

    public static void main(String[] args) {
        /*ArrayList arList = new ArrayList();
        arList.add(1);
        arList.add(2);
        arList.add(3);
        for (Object arPart : arList) {
            System.out.println(arPart);
        }*/

        int[] array = {1, 2, 3};
        System.out.println(array.length);
        String str1 = "ASdasf asdasd222";
        System.out.println( str1.contains("222") );

    }
}
