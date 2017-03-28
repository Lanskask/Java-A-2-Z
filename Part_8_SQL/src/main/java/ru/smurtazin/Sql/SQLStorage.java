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

    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/task_db";
        String username = "postgres";
        String password = "postgres";
        Connection conn = null;

        try {
            conn = DriverManager.getConnection(url, username, password);

            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM users;");

            while (rs.next()) {
                System.out.println(
                    String.format(
                        "%s %s", rs.getString("name"), rs.getInt("role_id")
                    )
                );
            }
            rs.close();
            st.close();

        } catch(Exception e) {
            Log.error(e.getMessage(), e);
        } finally {
            if (conn != null ) {
                try {
                    conn.close();
                } catch(SQLException e) {
                    Log.error(e.getMessage(), e);
                }
            }
        }

    }


}
