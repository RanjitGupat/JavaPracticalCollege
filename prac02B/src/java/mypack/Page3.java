
package mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;



public class Page3 extends HttpServlet {

   
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        Cookie[] c = request.getCookies();
        for(int i=0; i<c.length;i++)
        {
            if(c[i].getName().equals("VISIT")){
                out.println("<h1>welcome Back on page 1</h1>");
                int count = Integer.parseInt(c[i].getValue());
                count++;
                out.println("<h1>this is ypur visit no."+count+"</h1>");
                c[i].setValue(""+count);
                response.addCookie(c[i]);
                
            }
            else if(c[i].getName().equals("FAVCOL"))
             out.println("<body bgcolor="+c[i].getValue()+">"); 
            else out.println("<h1>Name:"+c[i].getName()+"Stores"+c[i].getValue()+"</h1>");
        }
        out.println("<h1><a href=Page1> GO TO PAGE 1</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 2</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 3</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 4</a></h1>");
        out.println("<h1><a href=Page1> GO TO PAGE 5</a></h1>");  
    }
}