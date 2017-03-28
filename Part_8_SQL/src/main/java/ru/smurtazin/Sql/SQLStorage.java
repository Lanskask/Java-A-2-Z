package ru.smurtazin.Sql;

import com.sun.rmi.rmid.ExecPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.Properties;

/**
 * Created by a1 on 24.03.17.
 *
 * 1. Add new task.
 * 2. Edit some Task.
 * 3. Delete some Task.
 * 4. Show All Tasks.
 * 5. Show Filtered List.
 * 6. Delete some Task.
 */
public class SQLStorage {

    public static final Logger Log = LoggerFactory.getLogger(SQLStorage.class);

    String url = "jdbc:postgresql://localhost:5432/task_db";
    String username = "postgres";
    String password = "postgres";
    Connection conn = null;

    void execute() {

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);

            Statement st = this.conn.createStatement();

            // from here should be function
            ResultSet rs = st.executeQuery("SELECT * FROM users;");

            while (rs.next()) {
                System.out.println(
                        String.format(
                                "%s %s", rs.getString("name"), rs.getInt("role_id")
                        )
                );
            }
            // till here should be function

            rs.close();
            st.close();

        } catch(Exception e) {
            Log.error(e.getMessage(), e);
        } finally {
            if (this.conn != null ) {
                try {
                    this.conn.close();
                } catch(SQLException e) {
                    Log.error(e.getMessage(), e);
                }
            }
        }
    }

    public static void main(String[] args) {
        SQLStorage main = new SQLStorage();

        main.execute();
    }


}
