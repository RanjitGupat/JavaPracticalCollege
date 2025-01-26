package mypack;

import java.io.*;
import javax.servlet.*;


public class LoginServlet extends GenericServlet {
    public void service (ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        String uid = req.getParameter("username");
        String psw = req.getParameter("password");

        if (uid.equals("admin") && psw.equals("1234")){
            pw.println("<h1>Welcome to TYBSC IT</h1>");
            pw.println("<h1>SPM<br>AWP<br>IOT<br>LINUX<br>ENT. JAVA</h1>");
        } 
        else{
            pw.println("<h1>ERROR..............<br>Try Again</h1>");
            pw.println("<h1><a href=index.html>CLICK HERE TO TRY AGAIN</h1>");
        }
    }
}
