
package hi;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;
;

/**
 *
 * @author LLC
 */
public class logincheck extends HttpServlet {

 
    public void doGet(HttpServletRequest Request, HttpServletResponse res)
            throws ServletException, IOException {
       res.setContentType("text/html");
       PrintWriter pw = res.getWriter();
       String id = Request.getParameter("UID");
       String passW = Request.getParameter("PW");
       if(id.equals("tyit") && passW.equals("admin123")){
           RequestDispatcher rd = Request.getRequestDispatcher("Welcome.html");
           rd.forward(Request,res);
                   
       }
       else{
           pw.println("<body bgcolor=blue>");
           pw.println("Error");
           pw.print("<h1>Try again </h1>");
           RequestDispatcher rd = Request.getRequestDispatcher("index.html");
           rd.forward(Request,res);
       }
       
    }

   
}