package ru.smurtazin.ejbs;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by a1 on 22.04.17.
 */
//@WebServlet(urlPatterns={"/AddServlet"})
//@WebServlet("/AddServlet")
public class AddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        PrintWriter out = resp.getWriter();

        int i = Integer.parseInt(req.getParameter("t1"));
        int j = Integer.parseInt(req.getParameter("t2"));

        int k = i + j;

        resp.setContentType("text/html"); // Содержание ответа сервера - text/html
        PrintWriter writer = new PrintWriter(resp.getOutputStream()); // Асоциировать printWriter_IO с выходным потоком ответа сервера
                    // засунуть поток вывода ответа сервера в IO поток printWriter
        writer.append("hell world!"); // добавить в в поток вывода текст - "hell w"
        writer.append("k: " + k);

        writer.flush(); // вписать всё в поток

        // writer.println("k: " + k);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        this.doGet(req, resp);
    }
}
