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
import java.util.List;

public class LoginServ extends HttpServlet {

    private final TemplateEngine engine;

    public LoginServ(TemplateEngine engine) {
        this.engine = engine;
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        engine.render("login.ftl", resp);

    }
}