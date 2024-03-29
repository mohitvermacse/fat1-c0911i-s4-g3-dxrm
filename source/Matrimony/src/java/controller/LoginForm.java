/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class LoginForm extends org.apache.struts.action.ActionForm {

    private String userName;
    private String password;

    /**
     *
     */
    public LoginForm() {
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
    @Override
    public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
        ActionErrors errors = new ActionErrors();
        UserAccess ua = new UserAccess();

        if (getUserName() == null || getUserName().length() < 1) {
            errors.add("use", new ActionMessage("error.userName.requireds"));
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("pas", new ActionMessage("error.password.requireds"));
        }
        if (!ua.loginUser(userName, password)) {

            errors.add("logUser", new ActionMessage("error.loginUser.requireds"));
        }
        if (ua.checkUserExpired(userName)) {
            if (ua.updateUserExpireDate(userName)) {
                errors.add("userExpireDate", new ActionMessage("error.userExpireDate.invalid"));
            }
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
     * @return the passsword
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param passsword the passsword to set
     */
    public void setPassword(String password) {
        this.password = password;
    }
}
