/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wctc.calculatorlabs.controller;

import edu.wctc.calculatorlabs.model.CalculatorService;
import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Aruni
 */
@WebServlet(name = "calculatorController", urlPatterns = {"/calculatorController"})
public class calculatorController extends HttpServlet {

   private static final String LAB1_RESPONSE = "/responseLab1.jsp";
   private static final String LAB2_RESPONSE = "/lab2.jsp";
   private static final String LAB_NO = "labNo";
   private static final String LAB1 = "lab1";
   private static final String LAB2= "lab2";
   
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
        
       double area = 0;
       String errMsg = "";

        try {
            String width = request.getParameter("width");
            String height = request.getParameter("height");
            CalculatorService cs = new CalculatorService();
            area = cs.getAreaOfRectangle(width, height);
            request.setAttribute("area", area);
        } catch (Exception e) {
            errMsg = e.getMessage();
            request.setAttribute("errMsg", errMsg);
        }
        
        String destination = "";
        String labNo = request.getParameter(LAB_NO);
        
        if(labNo.equals(LAB1)){
            destination = LAB1_RESPONSE;           
        }else if(labNo.equals(LAB2)){
            destination = LAB2_RESPONSE;
        }
        
        RequestDispatcher view = request.getRequestDispatcher(destination);
        view.forward(request, response);
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
