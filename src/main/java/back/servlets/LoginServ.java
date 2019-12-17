package back.servlets;

import back.database.DbOperations;
import back.entity.User;
import back.service.LoginService;
import back.template.TemplateEngine;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
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

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String nickname = req.getParameter("nickname");
        String password = req.getParameter("psw");
        LoginService service = new LoginService();

        try {
            if (service.check(nickname, password)) {
                engine.render("like-page.ftl", resp);
            } else {
                engine.render("login.ftl", resp);
            }
        } catch (SQLException e) {
            System.out.println("Login problem from" + e);
        }

    }
}