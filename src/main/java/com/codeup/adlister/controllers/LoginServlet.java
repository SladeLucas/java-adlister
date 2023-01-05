package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.MySQLUsersDao;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.*;

@WebServlet(name = "controllers.LoginServlet", urlPatterns = "/login")
public class LoginServlet extends HttpServlet {

    private Connection connection;
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        if (request.getSession().getAttribute("user") != null) {
            response.sendRedirect("/profile");
            return;
        }
        request.getRequestDispatcher("/WEB-INF/login.jsp").forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String username = request.getParameter("username");
        String password = request.getParameter("password");

        // TODO: find a record in your database that matches the submitted password
        // TODO: make sure we find a user with that username
        // TODO: check the submitted password against what you have in your database
        MySQLUsersDao usersDao = new MySQLUsersDao(new Config());
        User userFromDb;
        try {
            userFromDb = usersDao.findByUsername(username);
        } catch (SQLException e) {
            throw new RuntimeException("Error: username not found in users table.",e);
        }
        boolean validAttempt = username.equals(userFromDb.getUsername()) && password.equals(userFromDb.getPassword());

        if (validAttempt) {
            // TODO: store the logged in user object in the session, instead of just the username
            request.getSession().setAttribute("user", userFromDb);
            response.sendRedirect("/profile");
        } else {
            response.sendRedirect("/login");
        }
    }
}