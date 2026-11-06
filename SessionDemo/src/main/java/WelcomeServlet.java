import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;

@WebServlet("/welcome")
public class WelcomeServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession(false); // do not create if there alraedy
        String name = (session != null) ? (String) session.getAttribute("userName") : "Guest";
        String email = (session != null) ? (String) session.getAttribute("userEmail") : "Not Available ";

        Cookie[] cookies = req.getCookies();
        String user = "Guest";
        if( cookies != null){
            for(Cookie c : cookies){
                if(c.getName().equalsIgnoreCase("user")){
                    URLDecoder.decode(c.getValue() , StandardCharsets.UTF_8.toString());
                }
            }
        }
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();
        out.print("<h2> Welcome buddy : " + name + "</h2>");
        out.print("<h2> Your Email is  : " + email + "</h2>");
    }
}
