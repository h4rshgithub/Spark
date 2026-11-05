import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;


@WebServlet("/login")
public class FormServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h2> Welcome to CFS  </h2>");
        out.print("<p> you can contact us at 9383484898</p>");

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
        String name = req.getParameter("name");
        String course = req.getParameter("course");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h2>Student Details :  </h2>");
        out.print("<p> Student Name : " + name + " </p>");
        out.print("<p> Student Course : " + course + " </p>");
    }
}
