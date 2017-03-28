package ru.smurtazin.start;

import com.sun.rmi.rmid.ExecPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.smurtazin.models.Item;

import java.sql.*;
import java.util.ArrayList;
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
public class SQLTracker implements Tracker {

    public static final Logger Log = LoggerFactory.getLogger(SQLTracker.class);

    String url = "jdbc:postgresql://localhost:5432/task_db";
    String username = "postgres";
    String password = "postgres";
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;
    ArrayList<ResultSet> resultSets = null;

    public static void main(String[] args) {
        SQLTracker sqlTracker = new SQLTracker();

        sqlTracker.connectExecute();
    }

    public void connectExecute() {

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
//            this.st = this.conn.createStatement();

            // from here should be function
            String query = "SELECT * FROM users;";
            this.rs = this.st.executeQuery(query);

            while (this.rs.next()) {
//                this.resultSets.add(rs);
                System.out.println(
                        String.format(
                                "%s %s",
                                this.rs.getString("name"),
                                this.rs.getInt("role_id")
                        )
                );
            }
            // TODO: How to add result set to array?
            /*for (ResultSet rs : this.resultSets) {
                System.out.println(
                    String.format(
                        "%s %s",
                        this.rs.getString("name"),
                        this.rs.getInt("role_id")
                    )
                );
            }*/
            this.rs.close();
            this.st.close();

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

    // Sql functions
    // add
    // update
    // delete
    // findAll
    // findByName
    //
    // executeUpdate for: INSERT, UPDATE, DELETE, CREATE TABLE, DROP TABLE
    // executeQuery for: SELECT

    /**
     * 	tracker.add( new Item(taskName, taskDescription, new Date()) );
     *
     * 	TODO: Enter Timestamp or not?
     */
    public Item add(Item item) {

        String task_name = item.getName();
        String task_description = item.getDescription();

        String sql_query = String.format(
                "INSERT INTO tasks " +
                        "(task_name, task_description, task_creationDate) " +
                        "VALUES (%s, %s);",
                        task_name, task_description
        );

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            this.st = this.conn.createStatement();

            this.st.executeUpdate(sql_query);

            this.st.close();

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

        return item;
    }

    /**
     * 	TODO: DONE? or Add Timestamp for time of apdating
     */
    public void update(Item item) {
        String task_id = item.getId();
        String task_name = item.getName();
        String task_description = item.getDescription();

        String sql_query = String.format(
                "UPDATE tasks " +
                        "(task_id, task_name, task_description) " +
                        "VALUES (%1$s, %2$s, %3$s);",
                        task_id, task_name, task_description
        );

        if (this.conn != null ) { // TODO: Should it (if statement) be here or not? Let eat bee (Let it be)
            try {
                this.rs = this.st.executeQuery(sql_query);
            } catch(SQLException e) {
                Log.error(e.getMessage(), e);
            }
        }
    }

    /**
     * Delete item in tasks list
     */
    public void delete(String id) {
        String sql_query = String.format(
                "DELETE FROM tasks WHERE id = %s;", id);

        if (this.conn != null ) { // TODO: Should it (if statement) be here or not? Let eat bee (Let it be)
            try {
                this.rs = this.st.executeQuery(sql_query);
            } catch(SQLException e) {
                Log.error(e.getMessage(), e);
            }
        }
    }

    /**
     * TODO: realize back of result set!!!
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<Item>();

        String sql_query = String.format("SELECT * FROM tasks");
        // TODO: sout result set

        // TODO: realize back of result set!!!
        if (this.conn != null ) { // TODO: Should it (if statement) be here or not? Let eat bee (Let it be)
            try {
                this.rs = this.st.executeQuery(sql_query);
            } catch(SQLException e) {
                Log.error(e.getMessage(), e);
            }
        }

        return result;
    }

    /**
     *  // TODO: realize back of result set!!!
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();

        String sql_query = String.format(
                "SELECT * FROM tasks WHERE title LIKE %%%s%%;", key
        );

        // TODO: realize back of result set!!!
        if (this.conn != null ) { // TODO: Should it (if statement) be here or not? Let eat bee (Let it be)
            try {
                this.rs = this.st.executeQuery(sql_query);
            } catch(SQLException e) {
                Log.error(e.getMessage(), e);
            }
        }

        return result;
    }

}
