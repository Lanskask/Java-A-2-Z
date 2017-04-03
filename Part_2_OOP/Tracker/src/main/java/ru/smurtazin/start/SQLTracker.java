package ru.smurtazin.start;

import com.sun.rmi.rmid.ExecPermission;
import org.jetbrains.annotations.Contract;
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

    String url = "jdbc:postgresql://localhost:5432/java_a_2_z";
    String username = "postgres";
    String password = "postgres";
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    Statement st = null;
    ResultSet rs = null;
    ArrayList<ResultSet> resultSets = null;

    public static void main(String[] args) {
        Tracker tracker = new SQLTracker();

//        for (Item it : tracker.findAll()) {
        for (Item it : tracker.findByName("TV")) {
            System.out.println(it.toString());
        }
    }

    @Contract(" -> !null") // TODO: What is this?
    private static java.sql.Timestamp getCurrentTimeStamp() {
        java.util.Date today = new java.util.Date();
        return new java.sql.Timestamp(today.getTime());
    }

    void ifConnAndPrStementOpenClose() {
        if (this.conn != null ) {
            try {
                this.conn.close();
                this.preparedStatement.close(); // TODO: Is it needed to add?
            } catch(SQLException e) {
                Log.error("SQLException: " + e.getMessage(), e);
            }
        }
    }

    // TODO: What is this?
    public void connectExecute() {
        ArrayList<Item> result = new ArrayList<>();

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);

            String sql_query = "SELECT * FROM tasks;";

            this.preparedStatement = this.conn.prepareStatement(sql_query); //
            this.rs = this.preparedStatement.executeQuery();

            while (this.rs.next()) {
                System.out.println(
                        String.format(
                                "%s %s",
                                this.rs.getInt("id"),
                                this.rs.getString("title")
                        )
                );

                result.add(new Item(this.rs.getString("id"), this.rs.getString("title")));
            }
            this.rs.close();
            this.st.close();

        } catch(Exception e) {
            Log.error("Log 3: " + e.getMessage(), e);
        } finally {
            if (this.conn != null ) {
                try {
                    this.conn.close();
                    System.out.println("Log 1");
                } catch(SQLException e) {
                    Log.error(e.getMessage(), e);
                    System.out.println("Log 2");
                }
            }
        }

        for (Item it : result) {
            System.out.println(it.toString());
        }
    }



    /**
     * 	TODO: Enter Timestamp or not?
     */
    public Item add(Item item) {
        String sql_query =
                "INSERT INTO tasks " +
                        "(title, description, creationDate) " +
                        "VALUES (?, ?, ?)";
        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);

            this.preparedStatement = this.conn.prepareStatement(sql_query);
            this.preparedStatement.setString(1, item.getName());
            this.preparedStatement.setString(2, item.getDescription());
            this.preparedStatement.setTimestamp(3, getCurrentTimeStamp());

            this.preparedStatement.executeUpdate();
            this.preparedStatement.close();
        } catch(Exception e) {
            Log.error(e.getMessage(), e);
        } finally {
            this.ifConnAndPrStementOpenClose();
        }

        return item;
    }

    /**
     * 	TODO: DONE? or Add Timestamp for time of apdating
     */
    public void update(Item item) {

        String sql_query = "UPDATE tasks " +
                "SET title = ?, description = ? " +
                "WHERE id = ?);";

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);

            this.preparedStatement = this.conn.prepareStatement(sql_query);
            this.preparedStatement.setString(1, item.getName());
            this.preparedStatement.setString(2, item.getDescription());
            this.preparedStatement.setString(3, item.getId());

            this.preparedStatement.executeUpdate();
        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        } finally {
            this.ifConnAndPrStementOpenClose();
        }
    }

    /**
     * Delete item in tasks list
     */
    public void delete(String id) {
        String sql_query = "DELETE FROM tasks WHERE id = ?;";

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);

            this.preparedStatement = this.conn.prepareStatement(sql_query);
            this.preparedStatement.setString(1, id);

            this.preparedStatement.executeUpdate();
        } catch(SQLException e) {
            Log.error("SQLException" + e.getMessage(), e);
        } finally {
            this.ifConnAndPrStementOpenClose();
        }
    }

    /**
     * TODO: realize back of result set!!!
     */
    public ArrayList<Item> findAll() {
        ArrayList<Item> result = new ArrayList<Item>();
        String sql_query = "SELECT * FROM tasks";

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            this.preparedStatement = this.conn.prepareStatement(sql_query);
            this.rs = this.preparedStatement.executeQuery();

            while (this.rs.next()) {
                result.add(new Item(
                    this.rs.getString("id"),
                    this.rs.getString("title"),
                    this.rs.getString("description"),
                    this.rs.getTimestamp("creationDate")
                ));
            }

            this.preparedStatement.close();
        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        } finally {
            this.ifConnAndPrStementOpenClose();
        }

        return result;
    }

    /**
     * Get some pattern in name need to found, back ArrayList of matched Items
     * @param key
     * @return ArrayList<Item> result
     */
    public ArrayList<Item> findByName(String key) {
        ArrayList<Item> result = new ArrayList<Item>();
        String sql_query = "SELECT * FROM tasks WHERE title LIKE ?;";

        try {
            this.conn = DriverManager.getConnection(this.url, this.username, this.password);
            this.preparedStatement = this.conn.prepareStatement(sql_query);
            this.preparedStatement.setString(1, "%" + key + "%");
            this.rs = this.preparedStatement.executeQuery();

            while (this.rs.next()) {
                result.add(new Item(
                        this.rs.getString("id"),
                        this.rs.getString("title"),
                        this.rs.getString("description"),
                        this.rs.getTimestamp("creationDate")
                ));
            }

            this.preparedStatement.close();
        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        } finally {
            this.ifConnAndPrStementOpenClose();
        }

        return result;
    }

}
