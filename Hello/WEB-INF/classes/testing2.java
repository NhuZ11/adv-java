import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class testing2 extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter pw=res.getWriter();
        pw.println("<html><body>");
        pw.println("<p><b>Hello from servlet test 2</b></p>");
        pw.println("</body></html>");
        pw.close();
    }
}