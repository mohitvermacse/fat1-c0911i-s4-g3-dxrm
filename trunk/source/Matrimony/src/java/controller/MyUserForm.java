/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class MyUserForm extends org.apache.struts.action.ActionForm {

    private int receiveId;
    private int sendId;
    private String btn;
    private String action;
    private int friendId;

    /**
     *
     */
    public MyUserForm() {
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
//        if (getName() == null || getName().length() < 1) {
//            errors.add("name", new ActionMessage("error.name.required"));
//            // TODO: add 'error.name.required' key to your resources
//        }
        return errors;
    }

    /**
     * @return the receiveId
     */
    public int getReceiveId() {
        return receiveId;
    }

    /**
     * @param receiveId the receiveId to set
     */
    public void setReceiveId(int receiveId) {
        this.receiveId = receiveId;
    }

    /**
     * @return the sendId
     */
    public int getSendId() {
        return sendId;
    }

    /**
     * @param sendId the sendId to set
     */
    public void setSendId(int sendId) {
        this.sendId = sendId;
    }

    /**
     * @return the btn
     */
    public String getBtn() {
        return btn;
    }

    /**
     * @param btn the btn to set
     */
    public void setBtn(String btn) {
        this.btn = btn;
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

    /**
     * @return the friendId
     */
    public int getFriendId() {
        return friendId;
    }

    /**
     * @param friendId the friendId to set
     */
    public void setFriendId(int friendId) {
        this.friendId = friendId;
    }

}
