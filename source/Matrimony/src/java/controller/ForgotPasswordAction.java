/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class ForgotPasswordAction extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
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
        ForgotPasswordForm ff = (ForgotPasswordForm) form;
        UserAccess ua = new UserAccess();
        String email = ff.getEmail();
        String password = ua.getPasswordByEmail(email);
        String subject = " forgot password ";
        String content = "Your password on Matrimony.com is " + password;
        System.out.println("Password: " + password);
//        if (ua.send(email, subject, content)) {
//            System.out.println("Password 1: " + password);
//            return mapping.findForward(SUCCESS);
//        } else {
//            System.out.println("Password 2: " + password);
//            request.setAttribute("status", "Your email address not found");
        return mapping.findForward("error");
//        }
    }
}
