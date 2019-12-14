package back.servlets;

import back.controller.User;
import back.database.DbOperations;
import back.template.TemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;

public class RegisterServ extends HttpServlet {
    private final TemplateEngine engine;

    public RegisterServ(TemplateEngine engine) {
        this.engine = engine;
    }


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        engine.render("signup.ftl", resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String surname = req.getParameter("surname");
        String age = req.getParameter("age");
        String email = req.getParameter("email");
        String nickname = req.getParameter("nickname");
        String pass = req.getParameter("pass");
        User user = new User(name, surname, Integer.parseInt(age), nickname, pass, email);
        try {
            DbOperations.insertMethod(user);
        } catch (SQLException e) {
            System.out.println("insert problem: " + e);
        }
    }
}