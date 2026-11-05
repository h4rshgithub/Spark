import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class LifeCycle extends GenericServlet {
    @Override
    public void init() throws ServletException {
        System.out.println("Init called - Service intialized ");
    }
    @Override
    public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
        System.out.println("Service method called - Handling request");
        res.setContentType("text/html");
        PrintWriter out = res.getWriter();
        out.print("<h2> HEllo from Lifecycle </h2>");

    }

    @Override
    public void destroy() {
        System.out.println(" destroy() called : Servlet is destroyed ");

    }
}
