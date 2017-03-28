package ru.smurtazin.start;

import com.sun.rmi.rmid.ExecPermission;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import ru.smurtazin.models.Item;

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
public class SQLTracker {

    public static final Logger Log = LoggerFactory.getLogger(SQLTracker.class);

    String url = "jdbc:postgresql://localhost:5432/task_db";
    String username = "postgres";
    String password = "postgres";
    Connection conn = null;
    Statement st = null;
    ResultSet rs = null;

    public void connectExecute() {

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            this.st = this.conn.createStatement();

            String query = "SELECT * FROM users;";
            this.rs = this.st.executeQuery(query);

            while (this.rs.next()) {
                System.out.println(
                        String.format(
                                "%s %s",
                                this.rs.getString("name"),
                                this.rs.getInt("role_id")
                        )
                );
            }

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

    public static void main(String[] args) {
        SQLTracker sqlTracker = new SQLTracker();

        sqlTracker.connectExecute();
    }

    // Sql functions
    // add
    // update
    // delete
    // findAll
    // findByName
    /**
     * 	tracker.add( new Item(taskName, taskDescription, new Date()) );
     */
    void add(Item item) {
//        String name = "Add new task.";
//        System.out.println("Make new task:");

        String task_name = item.getName(); //System.console().readLine("Print task's name:");
        String task_description = item.getDescription(); // System.console().readLine("Print task's description:");

        String sql_query = String.format(
                "INSERT INTO tasks " +
                        "(task_name, task_description, task_creationDate) " +
                        "VALUES (%s, %s);",
                        task_name, task_description
        );
    }

    /**
     * 	tracker.update(item);
     */
    void update() {
        String name = "Edit a task.";
        String task_id = System.console().readLine("Choose task's id:");
        String task_name = System.console().readLine("Print task's name:");
        String task_description = System.console().readLine("Print task's description:");

        String sql_query = String.format(
                "UPDATE tasks " +
                        "(task_id, task_name, task_description) " +
                        "VALUES (%1$s, %2$s, %3$s);",
                        task_id, task_name, task_description
        );
    }

    /**
     * 	tracker.delete(item);
     */
    void delete() {
        String name = "Delete task.";

        String task_id = System.console().readLine("Choose task's id:");
        String task_name = System.console().readLine("Print task's name:");
        String task_description = System.console().readLine("Print task's description:");

        String sql_query = String.format("UPDATE tasks (task_id, task_name, task_description) VALUES (%1$s, %2$s, %3$s);", task_id, task_name, task_description);
    }

    /**
     * 	tracker.findAll()
     */
    void findAll() {
        String name = "Show all tasks.";
        String sql_query = String.format("SELECT * FROM Tasks");
    }

    /**
     * EXAMPLE: "where task_id > 3 and task_name CONTAINS 'abr' "
     * task_id, task_name, task_description - ?,
     * task_creationDate, task_commentsList
     * comment_id, comment_text - ?
     *
     * 	tracker.findByName(key);
     */
    void findByName() {
        String name = "Show tasks by filter.";
        String filter = System.console().readLine("Print filter: ");
        System.out.println("Filter parameters:\n... \n");

        //   transtaleFilterToSQLQuery(filter);
        String sql_query = String.format("SELECT * FROM Tasks WHERE %s ;", filter); // parse from database to console
    }

}
