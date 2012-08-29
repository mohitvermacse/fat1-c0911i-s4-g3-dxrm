/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controllerAdmin;

import bean.UserAccess;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class logAdminForm extends org.apache.struts.action.ActionForm {

    private String userName;
    private String password;
    private String action;

    /**
     *
     */
    public logAdminForm() {
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

        UserAccess ua = new UserAccess();
        
        if (getUserName() == null || getUserName().length() < 1) {
            errors.add("use", new ActionMessage("error.userName.requireds"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("pas", new ActionMessage("error.password.requireds"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (!ua.loginAdmin(userName, password)) {
            errors.add("logUser", new ActionMessage("error.loginUser.requireds"));
            // TODO: add 'error.name.required' key to your resources
        }
        return errors;
    }

    /**
     * @return the userName
     */
    public String getUserName() {
        return userName;
    }

    /**
     * @param userName the userName to set
     */
    public void setUserName(String userName) {
        this.userName = userName;
    }

    /**
     * @return the password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password the password to set
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return the action
     */
    public String getAction() {
        return action;
    }

    /**
     * @param action the action to set
     */
    public void setAction(String action) {
        this.action = action;
    }
}
