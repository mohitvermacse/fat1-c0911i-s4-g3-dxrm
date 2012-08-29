/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;
import service.MatrimonyBankService;
import service.MatrimonyBankService_Service;

/**
 *
 * @author SENJURO
 */
public class PaymentForm extends org.apache.struts.action.ActionForm {

    
    private String money;
    private String identityNumber;
    private String password;

    /**
     * @return
     */
    
    /**
     *
     */
    public PaymentForm() {
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

        MatrimonyBankService_Service service = new MatrimonyBankService_Service();
        MatrimonyBankService p = service.getMatrimonyBankServicePort();
        
        if (getIdentityNumber() == null || getIdentityNumber().length() < 1) {
            errors.add("identityNumberError", new ActionMessage("error.identityNumber.required"));
        }
        if (getPassword() == null || getPassword().length() < 1) {
            errors.add("passwordError", new ActionMessage("error.password.required"));
        }

        if (!p.checkIdentityNumber(identityNumber, password)) {
            errors.add("cardNumberError", new ActionMessage("error.cardNumber.invalid"));
            // TODO: add 'error.name.required' key to your resources
        }
        if (!p.checkBalance(identityNumber, Float.parseFloat(money))) {
            errors.add("balanceError", new ActionMessage("error.balance"));
        }
        return errors;
    }

    

   

    /**
     * @return the identityNumber
     */
    public String getIdentityNumber() {
        return identityNumber;
    }

    /**
     * @param identityNumber the identityNumber to set
     */
    public void setIdentityNumber(String identityNumber) {
        this.identityNumber = identityNumber;
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
     * @return the money
     */
    public String getMoney() {
        return money;
    }

    /**
     * @param money the money to set
     */
    public void setMoney(String money) {
        this.money = money;
    }
}
