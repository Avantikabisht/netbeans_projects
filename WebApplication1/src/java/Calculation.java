/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author avantika
 */
public class Calculation extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            String number1 = request.getParameter("number1");
            String number2 = request.getParameter("number2");
            String operator = request.getParameter("operator");
            int a = Integer.parseInt(number1);
            int b = Integer.parseInt(number2);
            if (operator.equals("+")) {
                out.print("sum =" + (a + b));
            } else if (operator.equals("-")) {
                 if(a==0||b==0)
                   out.print("ghatana nahi hai")  ;
                 else
                out.print("difference =" + (a - b));
            } else if (operator.equals("*")) {
                out.print("product =" + (a * b));
            } else if (operator.equals("/")) {
                if (a == 0 || b == 0) {
                    out.print("math error");
                } else {
                    out.print("division =" + (a / b));
                }
            } else if (operator.equals("%")) {
                out.print("remainder =" + (a % b));
            } else if (operator.equals("^")) {
                out.print("power product =" + (a ^ b));
            } else {
                out.print("bye");
            }
        }
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
