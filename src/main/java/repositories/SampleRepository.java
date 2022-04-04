package repositories;

import java.sql.*;
import java.util.*;

import models.User;

/*
    Layer #3: Data Access
*/
public class SampleRepository {
    private final String JDBC_URL = "Some database specific jdbc_url";
    private final String USERNAME = "Username of the owner";
    private final String PASSWORD = "Password of the owner";

    public List<User> getUsers() {
        List<User> listOfUsers = new ArrayList<>();
        String query = "SELECT * FROM users;";
        // Connecting to a database steps:
        // 1. Get Connection using DriverManager via jdbc_url, username, and password
        // 2. Get PreparedStatement from Connection instance passing query
        // 3. Execute PreparedStatement query and get the ResultSet
        try (Connection conn = DriverManager.getConnection(JDBC_URL, USERNAME, PASSWORD);
             PreparedStatement ps = conn.prepareStatement(query)) {

            ResultSet resultSet = ps.executeQuery();
            while (resultSet.next()) {
                String userId = resultSet.getString("userId_column");
                String username = resultSet.getString("username_column");
                String password = resultSet.getString("password_column");
                User user = new User(userId, username, password);
                listOfUsers.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return listOfUsers;
    }
}
