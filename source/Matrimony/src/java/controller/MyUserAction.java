/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class MyUserAction extends org.apache.struts.action.Action {

    /*
     * forward name="success" path=""
     */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception {
        try {
            HttpSession session = request.getSession();
            UserAccess ua = new UserAccess();
            MyUserForm uform = (MyUserForm) form;
            int yourId = Integer.parseInt(session.getAttribute("idUser").toString());
            int receiveID = uform.getReceiveId();
            int sendID = uform.getSendId();
            String userName = session.getAttribute("userName").toString();
            String btn = uform.getBtn();
            Date dateTemp = new Date();
            DateFormat fr = new SimpleDateFormat("MM/dd/yyyy hh:mm:ss");
            String date = (fr.format(dateTemp));

            String friendId = request.getParameter("friendId");

            if (friendId != null) {
                if (ua.checkTwoUserFriend(yourId, Integer.parseInt(friendId))) {
                    ArrayList arrayInfor = (ArrayList) ua.getInforUserByID(Integer.parseInt(friendId));
                    request.setAttribute("information", arrayInfor);
                    System.out.println("Friend ID: " + friendId + "\n Size Infor: " + arrayInfor.size());
                    return mapping.findForward("infor");
                } else {
                    ArrayList arrayRequest = (ArrayList) ua.getAllReceiveRequestByStatus(yourId);
                    ArrayList arrayFriend = (ArrayList) ua.getAllFriendss(yourId);
                    request.setAttribute("listFriend", arrayFriend);
                    request.setAttribute("listReceive", arrayRequest);
                    request.setAttribute("userName", userName);
                    request.setAttribute("status", " You do not have this permission");
                    System.out.println("Friend ID 1: " + friendId + " Your ID: " + yourId);
                    return mapping.findForward("user");
                }
            }
            if (btn.equalsIgnoreCase("Accept")) {
                System.out.println("Receive ID: " + receiveID);
                if (ua.updateReceiveRequestById(receiveID, "Approved", "Read")) {
                    System.out.println("Send ID: " + sendID +" Date: "+ date);
                    if (ua.updateSendRequestById(sendID, date, "Approved")) {
                        System.out.println("Send ID 1: " + sendID);
                        
                        ArrayList arrayRequest = (ArrayList) ua.getAllReceiveRequestByStatus(yourId);
                        ArrayList arrayFriend = (ArrayList) ua.getAllFriend(yourId);
                        request.setAttribute("listFriend", arrayFriend);
                        request.setAttribute("listReceive", arrayRequest);
                        request.setAttribute("userName", userName);
                        return mapping.findForward("user");
                    }
                }
            } else if (btn.equalsIgnoreCase("Deny")) {
                if (ua.updateReceiveRequestById(receiveID, "Deny", "Read")) {
                    if (ua.updateSendRequestById(sendID, date, "Deny")) {

                        ArrayList arrayRequest = (ArrayList) ua.getAllReceiveRequestByStatus(yourId);
                        ArrayList arrayFriend = (ArrayList) ua.getAllFriend(yourId);
                        request.setAttribute("listFriend", arrayFriend);
                        request.setAttribute("listReceive", arrayRequest);
                        request.setAttribute("userName", userName);
                        return mapping.findForward("user");
                    }
                }
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        }
        return mapping.findForward("error");
    }
}
