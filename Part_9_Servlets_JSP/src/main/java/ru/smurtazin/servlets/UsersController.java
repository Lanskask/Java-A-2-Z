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

    public UsersController() {
//        DBService dbService = new DBService();
    }

    public static final Logger log = LoggerFactory.getLogger(UsersController.class);

    private List<String> users = new CopyOnWriteArrayList<String>();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.getRequestDispatcher("/WEB-INF/views/UsersView.jsp").forward(req, resp);
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
