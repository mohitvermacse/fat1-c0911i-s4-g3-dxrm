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
        MyUserForm uform = (MyUserForm) form;
        UserAccess ua = new UserAccess();
        String action = uform.getAction();
        int receiveID = uform.getReceiveId();
        int sendID = uform.getSendId();

        String btn = uform.getBtn();
        Date dateTemp = new Date();
        DateFormat fr = new SimpleDateFormat("MM/dd/yyy hh:mm:ss");

        String date = (fr.format(dateTemp));
        String friendId = request.getParameter("friendId");
        System.out.println("FriendID: " + friendId);
        System.out.println("Button Value: : " + btn);
        if (btn == null) {
            System.out.println("Button Value: OK");
            action = "infor";
            System.out.println("Button Value: OK 1");
            ArrayList arrayInfor = (ArrayList) ua.getInforUserByID(Integer.parseInt(friendId));
            request.setAttribute("information", arrayInfor);
            System.out.println("Button Value: OK 2: " + action);
        } else if (btn.equalsIgnoreCase("Accept")) {
            System.out.println("Button Value: OK 3");
            if (ua.updateReceiveRequestById(receiveID, "Accept", "Read")) {
                if (ua.updateSendRequestById(sendID, date, "Accept")) {
                    action = "user";
                    ArrayList arrayRequest = (ArrayList) ua.getReceiveRequestByStatus(2);
                    ArrayList arrayFriend = (ArrayList) ua.getAllFriend(2);
                    request.setAttribute("listFriend", arrayFriend);
                    request.setAttribute("listReceive", arrayRequest);
                }
            }
        } else if (btn.equalsIgnoreCase("Deny")) {
            if (ua.updateReceiveRequestById(receiveID, "Deny", "Read")) {
                if (ua.updateSendRequestById(sendID, date, "Deny")) {
                    action = "user";
                    ArrayList arrayRequest = (ArrayList) ua.getReceiveRequestByStatus(2);
                    ArrayList arrayFriend = (ArrayList) ua.getAllFriend(2);
                    request.setAttribute("listFriend", arrayFriend);
                    request.setAttribute("listReceive", arrayRequest);
                }
            }
        } else {
            action = "infor";
            System.out.println("Button Value: OK 1");
            ArrayList arrayInfor = (ArrayList) ua.getInforUserByID(Integer.parseInt(friendId));
            request.setAttribute("information", arrayInfor);
        }
        System.out.println("Button Value: OK 4: " + action);
        return mapping.findForward(action);
    }
}
