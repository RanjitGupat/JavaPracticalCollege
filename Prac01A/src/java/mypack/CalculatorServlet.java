package mypack;

import java.io.*;
import javax.servlet.*;


public class CalculatorServlet extends GenericServlet {
    public void service (ServletRequest req, ServletResponse res)
            throws ServletException, IOException {
        res.setContentType("text/html");
        PrintWriter pw = res.getWriter();
        
        String inp1 = req.getParameter("n1");
        String inp2 = req.getParameter("n2");
        String inp3 = req.getParameter("opr");
        
        int num1 = Integer.parseInt(inp1); 
        int num2 = Integer.parseInt(inp2);
        pw.println("<h1> Result </h1>");
        
        if (inp3.equals("+")){
            pw.println("<h1> Addition: " + (num1 + num2) + "</h1>");
        }
        else if (inp3.equals("-")){
            pw.println("<h1> Subtraction: " + (num1 - num2) + "</h1>");
        }
        else if (inp3.equals("-")){
            pw.println("<h1> Multiplication: " + (num1 * num2) + "</h1>");
        }
        else {
            pw.println("<h1> Division: " + (num1 / num2) + "</h1>");
        }
    }
}
