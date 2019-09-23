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
 * 1. Add new task. - doPost
 * 2. Edit some Task. - doPut
 * 3. Delete some Task. - doDelete
 * 4. Show All Tasks. - doGet
 * 5. Show Filtered List. - doGet
 */
public class UsersController extends HttpServlet {

    // TODO: Here should be interface
//     Storage storage = new DBService();
    // TODO: or
//     Storage storage = new UserStorage();
    // TODO: Stogage.getInstance().add() // and so on

    DBService dbService;

    public UsersController() {
        this.dbService = new DBService();
    }

    public static final Logger log = LoggerFactory.getLogger(UsersController.class);

    private List<String> users = new CopyOnWriteArrayList<String>();

    /**
     * Show All Tasks
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        req.setAttribute("users", UserStorage.getInstance().getUsers());
        req.setAttribute("users", DBService.getInstance().findAll()); // TODO: Is it working?
        req.getRequestDispatcher("/WEB-INF/views/UsersView.jsp").forward(req, resp);
    }

    /**
     * Add new task
     *
     * Default parametres: id, createDate
     * Setupped parameters: name, login, email;
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {
        resp.setContentType("text/html");
//        UserStorage.getInstance().add(
        DBService.getInstance().add(
            new User(
                req.getParameter("name"),
                req.getParameter("login"),
                req.getParameter("email")
            )
        );
//        this.users.add(req.getParameter("login"));
//        this.doGet(req, resp);
        resp.sendRedirect(String.format("%s/", req.getContextPath()));
    }

    /**
     * Edit some Task
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        this.users.add(req.getParameter("login"));
    }

    /**
     * Delete some Task.
     *
     * @param req
     * @param resp
     * @throws ServletException
     * @throws IOException
     */
    @Override
    protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        this.users.remove(this.users.indexOf( req.getParameter("login") ));
        this.doGet(req, resp);
    }
}
