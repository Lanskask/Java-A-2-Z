package ru.smurtazin.Sql.horstman;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;

/**
 * Created by a1 on 28.03.17.
 */
public class TestDB {

    public static void main(String[] args) {
        TestDB main = new TestDB();
        main.run();
    }

    void run() {
        try {
            runTest();
        } catch (SQLException ex) {
            for (Throwable t : ex) {
                t.printStackTrace();
            }
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    public void runTest() throws SQLException, IOException {
        Connection conn = getConnection();

        try {
            Statement stat = conn.createStatement();

            String createTableQuery = "CREATE TABLE Greeting (Message CHAR(20));";
            stat.executeUpdate(createTableQuery);
            String insertQuery = "INSERT INTO Greeting VALUES ('Hellow, World!');";
            stat.executeUpdate(insertQuery);

            String selectQuery = "SELECT * FROM Greeting;";
            ResultSet result = stat.executeQuery(selectQuery);

            if (result.next()) {
                System.out.println(result.getString(1));
            }
            result.close();

            String dropTableQuery = "DROP TABLE Greeting";
            stat.executeUpdate(dropTableQuery);
        } finally {
            conn.close();
        }
    }

    /**
     * Read property file and back connection with setted properties
     * @return Connection
     * @throws SQLException
     * @throws IOException
     */
    public Connection getConnection() throws SQLException, IOException {
        Properties props = new Properties();

        ClassLoader classLoader = getClass().getClassLoader();
        File file = new File(classLoader.getResource("database.properties").getFile());
        FileInputStream in = new FileInputStream(file);
        props.load(in);
        in.close();

        String drivers = props.getProperty("jdbc.drivers");

        if (drivers != null ) System.setProperty("jdbc.drivers", drivers);

        String url = props.getProperty("jdbc.url");
        String username = props.getProperty("jdbc.username");
        String password = props.getProperty("jdbc.password");

        return DriverManager.getConnection(url, username, password);
    }

}
