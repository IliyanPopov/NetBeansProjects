package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "HelloServlet", urlPatterns = {"/HelloServlet"})
public class HelloServlet extends HttpServlet {

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Get parametres from http request
        String name = request.getParameter("username"); // request object is supplied by the server, value is the name of the form

        // Run any buisness logic needed
        //..
        
        
        
        //prepare data for JSP
        request.setAttribute("username", name);

        //forward the request
        request.getRequestDispatcher("hello.jsp").forward(request, response);
        
        
        
        
    }
}
