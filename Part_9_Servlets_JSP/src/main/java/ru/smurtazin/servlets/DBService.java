package ru.smurtazin.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.util.ArrayList;

/**
 * Created by a1 on 21.04.17.
 *
 * CRUD - Create, Read, Update, Delete
 * 1. Add new task. - doPost - CREATE
 * 2. Edit some Task. - doPut - UPDATE
 * 3. Delete some Task. - doDelete - DELETE
 * 4. Show All Tasks. - doGet - READ
 * 5. Show Filtered List. - doGet - READ
 *
 * add
 * update
 * delete
 * findAll
 * findByName
 */
public class DBService {
    public static final Logger Log = LoggerFactory.getLogger(DBService.class);

    public static final DBService instance = new DBService();

    public static DBService getInstance() {
        return instance;
    }

    String url = "jdbc:postgresql://localhost:5432/users_db";
    String username = "postgres";
    String password = "postgres";
    Connection conn = null;
    PreparedStatement preparedStatement = null;
    Statement st = null;
    ResultSet rs = null;
    ArrayList<ResultSet> resultSets = null;

    boolean isConnection() {
        boolean isConnection = false;
        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password)) {
            isConnection = true;
        } catch(Exception e) {
            Log.error(e.getMessage(), e);
        }
        return isConnection;
    }

    public User add(User user) {
        String sql_query =
                "INSERT INTO users(user_name, user_login, email, createDate) " +
                        "VALUES (?, ?, ?, ?)";

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement preparedStatement = conn.prepareStatement(sql_query)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setTimestamp(4, user.getCreateDate());

            preparedStatement.executeUpdate();
        } catch(Exception e) {
            Log.error(e.getMessage(), e);
        }

        return user;
    }

    public void update(User user) {

        String sql_query = "UPDATE users " +
                "SET user_name = ?, user_login = ?, email = ? " +
                "WHERE id = ?;";

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
             PreparedStatement preparedStatement = conn.prepareStatement(sql_query)) {

            preparedStatement.setString(1, user.getName());
            preparedStatement.setString(2, user.getLogin());
            preparedStatement.setString(3, user.getEmail());
            preparedStatement.setInt(4, user.getId());

            preparedStatement.executeUpdate();
        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        }
    }

    /**
     * Delete item in tasks list
     */
    public void delete(User user) {
        String sql_query = "DELETE FROM users WHERE id = ?;";

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
             PreparedStatement preparedStatement = conn.prepareStatement(sql_query)) {
            preparedStatement.setInt(1, user.getId());

            preparedStatement.executeUpdate();
        } catch(SQLException e) {
            Log.error("SQLException" + e.getMessage(), e);
        }
    }

    /**
     * TODO: realize back of result set!!!
     */
    public ArrayList<User> findAll() {
        ArrayList<User> result = new ArrayList<User>();
        String sql_query = "SELECT * FROM users";

        try (Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
             PreparedStatement preparedStatement = conn.prepareStatement(sql_query)) {
            this.rs = preparedStatement.executeQuery();

            while (this.rs.next()) {
                result.add(new User(
                        this.rs.getInt("id"),
                        this.rs.getString("user_name"),
                        this.rs.getString("user_login"),
                        this.rs.getString("email"),
                        this.rs.getTimestamp("createDate")
                ));
            }

        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        }

        return result;
    }

    /**
     * Get some pattern in name need to found, back ArrayList of matched Items
     * @param name
     * @return ArrayList<Item> result
     */
    public ArrayList<User> findByName(String name) {
        ArrayList<User> result = new ArrayList<User>();
        String sql_query = "SELECT * FROM users WHERE user_name LIKE ?;";

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement preparedStatement = this.conn.prepareStatement(sql_query)) {
            this.preparedStatement.setString(1, "%" + name + "%");
            this.rs = this.preparedStatement.executeQuery();

            while (this.rs.next()) {
                result.add(new User(
                        this.rs.getInt("id"),
                        this.rs.getString("user_name"),
                        this.rs.getString("user_login"),
                        this.rs.getString("email"),
                        this.rs.getTimestamp("createDate")
                ));
            }

        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        }

        return result;
    }

    /**
     * Get some pattern in name need to found, back ArrayList of matched Items
     * @param user
     * @return ArrayList<Item> result
     */
    public ArrayList<User> findByAllUser(User user) {
        ArrayList<User> result = new ArrayList<User>();
        String sql_query = "SELECT * FROM users WHERE id = ?;";

        try(Connection conn = DriverManager.getConnection(this.url, this.username, this.password);
            PreparedStatement preparedStatement = this.conn.prepareStatement(sql_query)) {
            this.preparedStatement.setInt(1, user.getId());
            this.rs = this.preparedStatement.executeQuery();

            while (this.rs.next()) {
                result.add(new User(
                        this.rs.getInt("id"),
                        this.rs.getString("user_name"),
                        this.rs.getString("user_login"),
                        this.rs.getString("email"),
                        this.rs.getTimestamp("createDate")
                ));
            }

        } catch(SQLException e) {
            Log.error("SQLException: " + e.getMessage(), e);
        }

        return result;
    }


}
