/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.Validate;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class ForgotPasswordForm extends org.apache.struts.action.ActionForm {
    
    private String email;
   
    /**
     *
     */
    public ForgotPasswordForm() {
        super();
        // TODO Auto-generated constructor stub
    }

    /**
     * This is the action called from the Struts framework.
     * @param mapping The ActionMapping used to select this instance.
     * @param request The HTTP Request we are processing.
     * @return
     */
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        Validate v = new Validate();
        if (getEmail() == null || getEmail().length() < 1) {
            errors.add("email", new ActionMessage("error.email.required"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (!v.isValidEmailAddress(email)) {
            errors.add("invalidEmail", new ActionMessage("error.invalidEmail.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        
        return errors;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }
}
