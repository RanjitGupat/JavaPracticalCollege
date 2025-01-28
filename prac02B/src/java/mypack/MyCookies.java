
package mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class MyCookies extends HttpServlet {

  
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String id = request.getParameter("userId");
        String col = request.getParameter("favcol");
        
        Cookie ck1 = new Cookie("UASERID",id);
        Cookie ck2 = new Cookie("FAVCOL",col);
        Cookie ck3 = new Cookie("VISIT","01");
        response.addCookie(ck1);
        response.addCookie(ck2);
        response.addCookie(ck3);
        
        out.println("<h1><a href=Page1> GO TO PAGE 1</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 2</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 3</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 4</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 5</a></h1>");
    }}

   