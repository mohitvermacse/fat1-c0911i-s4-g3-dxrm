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
public class TransferRequest extends HttpServlet {

    /**
     * Processes requests for both HTTP
     * <code>GET</code> and
     * <code>POST</code> methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        /*
         * TODO output your page here. You may use following sample code.
         */
        try {
            UserAccess ua = new UserAccess();
            String action;
            action = request.getParameter("action");
////         
            if (action != null) {

                if (action.equalsIgnoreCase("Transfer")) {
                    String[] arrayId = request.getParameterValues("list");
                    String statust = "Not request pending";

                    ArrayList listRequestPending = (ArrayList) ua.getAllReceveRequestTransfer("Pending");
                    if (listRequestPending.size() <= 0) {
                        request.setAttribute("listTransfer", listRequestPending);
//                            request.setAttribute("totalApproved", totalPending);
//                            request.setAttribute("totalApproved", totalTransfer);
//                            request.setAttribute("totalApproved", totalApproved);
                        System.out.println("Not request pending 12 ");
                        request.setAttribute("status", statust);

                        RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                        di.forward(request, response);
                        System.out.println("4: " + action);
                    } else {
                        request.setAttribute("listTransfer", listRequestPending);
//                            request.setAttribute("totalApproved", totalPending);
//                            request.setAttribute("totalApproved", totalTransfer);
//                            request.setAttribute("totalApproved", totalApproved);
                        RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                        di.forward(request, response);
                    }
                    for (String s : arrayId) {
                        int id = Integer.parseInt(s);
                        ua.updateReceiveRequestById(id, "Transfer", "Unread");
//                        int totalPending = ua.sumRequestReceive("Pending");
//                        int totalTransfer = ua.sumRequestReceive("Transfer");
//                        int totalApproved = ua.sumRequestReceive("Approved");

                        if (listRequestPending.size() <= 0) {
                            request.setAttribute("listTransfer", listRequestPending);
//                            request.setAttribute("totalApproved", totalPending);
//                            request.setAttribute("totalApproved", totalTransfer);
//                            request.setAttribute("totalApproved", totalApproved);
                            System.out.println("Not request pending ");
                            request.setAttribute("status", statust);

                            RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                            di.forward(request, response);
                            System.out.println("dgwragwar: " + action);
                        } else {
                            request.setAttribute("listTransfer", listRequestPending);
//                            request.setAttribute("totalApproved", totalPending);
//                            request.setAttribute("totalApproved", totalTransfer);
//                            request.setAttribute("totalApproved", totalApproved);
                            RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                            di.forward(request, response);
                        }

                    }

                } else if (action.equalsIgnoreCase("Request Transfer")) {

                    ArrayList listRequestPending = (ArrayList) ua.getAllReceveRequestTransfer("Pending");
                    ArrayList listRequestTransfer = (ArrayList) ua.getAllReceveRequestTransfer("Transfer");
                    request.setAttribute("listTransfer", listRequestPending);
                    request.setAttribute("listRequestTransfer", listRequestTransfer);

                    RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                    di.forward(request, response);

                } else if (action.equalsIgnoreCase("Request Approved")) {

                    ArrayList listRequestPending = (ArrayList) ua.getAllReceveRequestTransfer("Pending");
                    ArrayList listRequestApproved = (ArrayList) ua.getAllReceveRequestTransfer("Approved");
                    request.setAttribute("listTransfer", listRequestPending);
                    request.setAttribute("listRequestApproved", listRequestApproved);

                    RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                    di.forward(request, response);

                }
            } else {
                ArrayList arrayTransfer = (ArrayList) ua.getAllReceveRequestTransfer("Pending");
                if (arrayTransfer.isEmpty()) {
                    request.setAttribute("listTransfer", arrayTransfer);
                    request.setAttribute("status", "Not request pending");

                    RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                    di.forward(request, response);
                } else {
                    request.setAttribute("listTransfer", arrayTransfer);
                    RequestDispatcher di = request.getRequestDispatcher("transferRequest.jsp");
                    di.forward(request, response);
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            out.close();
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP
     * <code>GET</code> method.
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
     * Handles the HTTP
     * <code>POST</code> method.
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
