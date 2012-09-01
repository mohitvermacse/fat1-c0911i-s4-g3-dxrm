/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author nvc
 */
public class HomeServlet extends HttpServlet {

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
            /* TODO output your page here*/
            HttpSession session = request.getSession();
            UserAccess ua = new UserAccess();

            ArrayList allUser = (ArrayList) ua.displayAllUser();
            session.setAttribute("allUser", allUser);
            request.setAttribute("allUser", allUser);

            RequestDispatcher dis = request.getRequestDispatcher("homepage.jsp");
            dis.forward(request, response);
            int id = Integer.parseInt(request.getParameter("id"));
            int user = Integer.parseInt(session.getAttribute("userName").toString());
            int idUser = Integer.parseInt(session.getAttribute("idUser").toString());

            if (ua.checkTwoUserFriend(id, idUser)) {
                ArrayList infor = (ArrayList) ua.getInforUserByID(id);
                request.setAttribute("information", infor);
                RequestDispatcher di = request.getRequestDispatcher("infor.jsp");
                di.forward(request, response);
            } else {
//                ArrayList allUser = (ArrayList) ua.displayAllUser();
                session.setAttribute("allUser", allUser);
                request.setAttribute("allUser", allUser);
                request.setAttribute("status", " You do not have this permission");
                RequestDispatcher di = request.getRequestDispatcher("homepage.jsp");
                di.forward(request, response);
            }

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
        processRequest(request, response);
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
