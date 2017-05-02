package ru.smurtazin.simple_servlets;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by a1 on 28.04.17.
 */
@WebServlet(urlPatterns = "/openServlet2",
    initParams = {
        @WebInitParam(
            name ="type",
            value = "value of the type",
            description = "description of the type init value"
        )
    })
public class Servlet2 extends HttpServlet {
    String htmlText =
            "<!DOCTYPE html>\n" +
            "<html>\n" +
            "<head>\n" +
            "\t<title>servlet2 Title</title>\n" +
            "</head>\n" +
            "<body>\n" +
            "%1$s\n<br>" +
            "\tLorem ipsum dolor sit amet, consectetur " +
                    "adipisicing elit. Praesentium quas " +
                    "assumenda asperiores, voluptatum " +
                    "libero dolores ipsum debitis eveniet " +
                    "iusto fugit officiis earum deserunt " +
                    "deleniti harum, dignissimos consequatur " +
                    "alias reiciendis unde.\n" +
                    "<br>\n" +
                    "InitParam: %2$s\n" +
            "</body>\n" +
            "</html>";

    String par1;
    String type;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try(PrintWriter out = resp.getWriter() ) {
            this.par1 = req.getParameter("par1");

            out.println(
                String.format(this.htmlText, this.par1, this.type)
            );
        }
    }

    @Override
    public void init(ServletConfig config) throws ServletException {
        this.type = config.getInitParameter("type");
    }
}
