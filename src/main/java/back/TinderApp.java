package back;

import back.servlets.LikePageServ;
import back.servlets.LoginServ;
import back.servlets.RegisterServ;
import back.servlets.StaticContentServlet;
import back.template.TemplateEngine;
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/*
 *
 *  http://localhost:9002/register
 *  http://localhost:9002/login
 *
 */
public class TinderApp {

    public static void main(String[] args) throws Exception {
        Server server = new Server(9002);

        TemplateEngine te = TemplateEngine.resources("/templates");

        ServletContextHandler handler = new ServletContextHandler();
        handler.addServlet((new ServletHolder(new StaticContentServlet("src/main/resources/templates"))), "/static/*");
        handler.addServlet(new ServletHolder(new RegisterServ(te)), "/register/*");
        handler.addServlet(new ServletHolder(new LoginServ(te)), "/login/*");
        handler.addServlet(new ServletHolder(new LikePageServ(te)), "/users/*");

        server.setHandler(handler);
        server.join();
        server.start();
    }
}