import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class SumServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get numbers from request
        int num1 = Integer.parseInt(request.getParameter("num1"));
        int num2 = Integer.parseInt(request.getParameter("num2"));
        int num3 = Integer.parseInt(request.getParameter("num3"));
        
        // Calculate the sum
        int sum = num1 + num2 + num3;

        // Set response content type
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>The sum of " + num1 + ", " + num2 + ", and " + num3 + " is: " + sum + "</h2>");
        out.println("</body></html>");
    }
}
