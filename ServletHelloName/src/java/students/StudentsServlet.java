package students;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "StudentsServlet", urlPatterns = {"/StudentsServlet"})
public class StudentsServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        String[] days = {"Monday", "Thuesday", "Wednesday"};
        Student s0 = new Student("Mnogo Grozen", 5);
        Student s1 = new Student("Sredno Hubav", 2);
        Student s2 = new Student("Mlako Trivialen", 7);
        
        Student[] students = {s0,s1,s2};
        
        request.setAttribute("days", days);
        request.setAttribute("students", students);
        
        
        
        
        
        
        
        request.getRequestDispatcher("students.jsp").forward(request, response);
    }

   
     
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
