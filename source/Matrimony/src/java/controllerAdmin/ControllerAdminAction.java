/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.UserAccess;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class ControllerAdminAction extends org.apache.struts.action.Action {

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
            UserAccess ua = new UserAccess();

            ControllerAdminForm ad = (ControllerAdminForm) form;
            String action = ad.getAction();
            System.out.println("ACtion: " + action);
            if (action.equalsIgnoreCase("Manager user Expired")) {
                System.out.println("ACtion: " + action);
                ArrayList arrayUserExpired = (ArrayList) ua.getAllUserExpired();
                String status = "Not user expired";
                if (arrayUserExpired.isEmpty()) {
                    request.setAttribute("status", status);
                    return mapping.findForward("expired");
                } else {
                    request.setAttribute("listUserExpired", arrayUserExpired);

                    return mapping.findForward("expired");
                }

            } else if (action.equalsIgnoreCase("Manager Statistic")) {

                return mapping.findForward("statistic");

            } else if (action.equalsIgnoreCase("Manager Request")) {

                ArrayList listRequestPending = (ArrayList) ua.getAllReceveRequestTransfer("Pending");
//                ArrayList listRequestTransfer = (ArrayList) ua.getAllReceveRequestTransfer("Transfer");
//                ArrayList listRequestApproved = (ArrayList) ua.getAllReceveRequestTransfer("Approved");

                int totalPending = ua.sumRequestReceive("Pending");
                int totalTransfer = ua.sumRequestReceive("Transfer");
                int totalApproved = ua.sumRequestReceive("Approved");

                request.setAttribute("listTransfer", listRequestPending);
//                request.setAttribute("listRequestTransfer", listRequestTransfer);
//                request.setAttribute("listRequestApproved", listRequestApproved);                

                request.setAttribute("totalApproved", totalPending);
                request.setAttribute("totalApproved", totalTransfer);
                request.setAttribute("totalApproved", totalApproved);

                return mapping.findForward("transfer");
            }

        } catch (Exception e) {
        }
        return mapping.findForward(SUCCESS);
    }
}
