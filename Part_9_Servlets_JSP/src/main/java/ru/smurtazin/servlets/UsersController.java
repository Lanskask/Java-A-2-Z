package ru.smurtazin.servlets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Created by a1 on 08.04.17.
 */
public class UsersController extends HttpServlet {
    public static final Logger log = LoggerFactory.getLogger(UsersController.class);

    private List<String> users = new CopyOnWriteArrayList<String>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = new PrintWriter(resp.getOutputStream());

        String login = req.getParameter("login");

        StringBuilder sb = new StringBuilder("<table>");
        for (String logn : this.users ){
            sb.append("<tr><td>" + logn + "</td></tr>\n");
        }
        sb.append("</table>");

        String form = String.format(
                "\t<form action=\"%s/echo\" method=\"post\">\n" +
                "\t\tName: <input type=\"text\" name=\"login\">\n" +
                "\t\t<input type=\"submit\">\n" +
                "\t</form>",
                req.getContextPath()
        );
        writer.append(String.format("<!DOCTYPE html>\n" +
                "<html lang=\"en\">\n" +
                "<head>\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <title>Servlet 1</title>\n" +
                "</head>\n" +
                "<body>\n" +
                "   %s\n" +
                "   %s\n" +
                "   %s\n" +
                "   %s\n" +
                "</body>\n" +
                "</html>\n",
                form,
                String.format("<p>Login: %s</p>", login),
                String.format("<p>Users: %s</p>", this.users),
                sb.toString()
                )
        );

//        writer.append(String.format("<p>Login: %s</p>", login));
//        writer.append("<p>Users: " + this.users + "</p>");
        writer.flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        UserStorage.getInstance().add(new User(req.getParameter("login"), req.getParameter("email")));
//        this.users.add(req.getParameter("login"));
//        this.doGet(req, resp);
        resp.sendRedirect(String.format("%s/UsersView.jsp", req.getContextPath()));
    }

    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        this.users.add(req.getParameter("login"));
    }

    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        this.users.remove(this.users.indexOf( req.getParameter("login") ));
        this.doGet(req, resp);
    }
}
