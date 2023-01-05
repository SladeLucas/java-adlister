package com.codeup.adlister.dao;

import com.codeup.adlister.controllers.Config;
import com.codeup.adlister.models.User;
import com.mysql.cj.jdbc.Driver;

import java.sql.*;

public class MySQLUsersDao implements Users{

    private Connection connection = null;
    private String url = "";
    private String user = "";
    private String password = "";

    public MySQLUsersDao(Config config){
        // connect to database

        url = config.getUrl();
        user = config.getUser();
        password = config.getPassword();
        try {
            DriverManager.registerDriver(new Driver());
            connection = DriverManager.getConnection( url, user, password );
        } catch (SQLException e) {
            throw new RuntimeException("Error connecting to the database!", e);
        }
    }
    @Override
    public User findByUsername(String username) throws SQLException {
        String sql = "SELECT * FROM users WHERE username = ?";
        ResultSet usernameAndPasswordRs;
        User user = new User();
        try {
            PreparedStatement stmt = connection.prepareStatement(sql);
            stmt.setString(1, username);
            usernameAndPasswordRs = stmt.executeQuery();
        }catch(SQLException e){
            throw new RuntimeException("Error querying db for username and password from LoginServlet.java",e);
        }

        while(usernameAndPasswordRs.next()){
            user = new User(
                    usernameAndPasswordRs.getLong("id"),
                    usernameAndPasswordRs.getString("username"),
                    usernameAndPasswordRs.getString("email"),
                    usernameAndPasswordRs.getString("password")
            );
        }
        return user;
    }

    @Override
    public Long insert(User user) {
        try {
            // prepare insert stmt
            String sql = "INSERT INTO users(username, email, password ) VALUES (?, ?, ?)";
            PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            // sanitize and set inputs to insert stmt
            stmt.setString(1, user.getUsername());
            stmt.setString(2, user.getEmail());
            stmt.setString(3, user.getPassword());

            // execute  insert
            stmt.execute();

            // return rows changed
            ResultSet rs = stmt.getGeneratedKeys();
            rs.next();
            return rs.getLong(1);
        } catch (SQLException e) {
            throw new RuntimeException("Error creating a new ad.", e);
        }
    }


}