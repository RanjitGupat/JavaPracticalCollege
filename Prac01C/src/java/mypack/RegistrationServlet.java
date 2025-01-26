package mypack;

import java.io.*;
import javax.servlet.*;
import java.sql.*;


public class RegistrationServlet extends GenericServlet {
    public void service (ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        String uid = req.getParameter("username");
        String psw = req.getParameter("password");
        String e_id = req.getParameter("email");
        String mob_no = req.getParameter("mobile");
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            pw.println("<h1>Driver for mysql Loaded</h1>");
            Connection con = DriverManger.getConnection("jdbc:mysql://localhost:3306/user2024","root","admin");
         }
        catch Exception(e){ pw.println(e);}
    }
}
