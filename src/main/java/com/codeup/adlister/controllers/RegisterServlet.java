package com.codeup.adlister.controllers;

import com.codeup.adlister.dao.DaoFactory;
import com.codeup.adlister.models.Ad;
import com.codeup.adlister.models.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "controllers.RegisterServlet", urlPatterns = "/register")
public class RegisterServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("/WEB-INF/register.jsp")
                .forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        // TODO: ensure the submitted information is valid
        String username = request.getParameter("username");
        boolean validUsername = false;
        if(username != null && !username.equals(""))
            validUsername = true;
        String email = request.getParameter("email");
        boolean validEmail = false;
        if(email != null && email.contains("@"))
            validEmail = true;
        String password = request.getParameter("password");
        boolean validPassword = false;
        if(password != null && !password.equals(""))
            validPassword = true;

        if(validUsername && validEmail && validPassword){
            // TODO: create a new user based off of the submitted information
            User user = new User(1, username, email, password);
            Long userId = DaoFactory.getUsersDao().insert(user);

            // TODO: if a user was successfully created, send them to their profile
            if(userId != null) {
                response.sendRedirect("/login");
            }
        }
    }
}