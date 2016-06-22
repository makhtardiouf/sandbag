/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package com.makhtar.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.*;

import com.makhtar.model.TechLister;
import java.util.*;

/**
 *
 * @author makhtar
 */
public class TechSelect extends HttpServlet {
   
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TechSelect</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TechSelect at " + request.getContextPath () + "</h1>");
            out.println("</body>");
            out.println("</html>");
            
        } finally { 
            out.close();
        }
    } 

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
       // processRequest(request, response);
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("Technology selection advise");
        
        String proglang = request.getParameter("proglang");
        out.println("<br>You selected: " + proglang);
        out.println("<br>The trends corresponding to your selection: <br>");

        TechLister techs = new TechLister();
        List trends = techs.getTrends(proglang);
        Iterator item = trends.iterator();
        while(item.hasNext())
         out.print("<br>" + item.next());
    }

    /** 
     * Returns a short description of the servlet.
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
