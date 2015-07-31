package web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import logic.Calculator;

@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
// Get parametres from http request
        String value1String = request.getParameter("value1"); // request object is supplied by the server, value is the name of the form
        double value1Numbr = Double.parseDouble(value1String);
        String value2String = request.getParameter("value2");
        double value2Numbr = Double.parseDouble(value2String);
        
        String sign = request.getParameter("sign");
        
        
        
        
        // Run any buisness logic needed
       
        Calculator calc = new Calculator();
        double result = calc.calculate(value1Numbr, value2Numbr, sign);
        
        //..
        
        
        
        //prepare data for JSP
        request.setAttribute("value1", value1Numbr);
        request.setAttribute("value2", value2Numbr);
        request.setAttribute("result", result);
        request.setAttribute("sign", sign);

        //forward the request
        request.getRequestDispatcher("calc.jsp").forward(request, response);
        

        //String s = request.getParameter("a");
        //int a = Integer.parseInt(s);  //converting a string to int
        

        

    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
