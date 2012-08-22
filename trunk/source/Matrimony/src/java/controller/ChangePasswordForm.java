/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import bean.Validate;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class ChangePasswordForm extends org.apache.struts.action.ActionForm {

    private String oldPassword, newPassword, confirmPassword;

    /**
     *
     */
    public ChangePasswordForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();

        Validate valid = new Validate();
        UserAccess ua = new UserAccess();
        HttpSession session = request.getSession();
        String userName = "tungpt";// (String) session.getAttribute("userName");

        if (getOldPassword() == null || getOldPassword().length() < 1) {
            errors.add("oldPasswords", new ActionMessage("error.oldPasswords.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getNewPassword() == null || getNewPassword().length() < 1) {
            errors.add("newPasswords", new ActionMessage("error.newPasswords.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getConfirmPassword() == null || getConfirmPassword().length() < 1) {
            errors.add("confirmPasswords", new ActionMessage("error.confirmPasswords.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (!ua.checkOldPassword(userName, oldPassword)) {
            errors.add("validOldPasswords", new ActionMessage("error.validOldPasswords.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (!valid.checkpassword(newPassword, confirmPassword)) {
            errors.add("validOldNewPasswords", new ActionMessage("error.validOldNewPasswords.required"));
            // TODO: add 'error.name.required' key to your resources
        }
         if (!valid.checkpassword(newPassword, confirmPassword)) {
            errors.add("validOldNewPasswords1", new ActionMessage("error.validOldNewPasswords1.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the oldPassword
     */
    public String getOldPassword() {
        return oldPassword;
    }

    /**
     * @param oldPassword the oldPassword to set
     */
    public void setOldPassword(String oldPassword) {
        this.oldPassword = oldPassword;
    }

    /**
     * @return the newPassword
     */
    public String getNewPassword() {
        return newPassword;
    }

    /**
     * @param newPassword the newPassword to set
     */
    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    /**
     * @return the confirmPassword
     */
    public String getConfirmPassword() {
        return confirmPassword;
    }

    /**
     * @param confirmPassword the confirmPassword to set
     */
    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

}
