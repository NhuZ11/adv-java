import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SessionServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Create a session or get the existing one
        HttpSession session = request.getSession();
        
        // Set session attribute
        session.setAttribute("username", "JohnDoe");

        // Redirect to the JSP page to display session information
        response.sendRedirect("index.jsp");
    }
}
