import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;

public class Test extends HttpServlet{
    public void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException{
        PrintWriter pw=res.getWriter();
        pw.println("<html><body>");
        pw.println("<b>Name:"+n1+"address:"+a1+"</b>");
        pw.println("</body></html>");
        pw.close();
    }
}