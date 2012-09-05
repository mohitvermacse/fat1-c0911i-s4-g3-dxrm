/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.sound.midi.SysexMessage;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import service.MatrimonyBankService;
import service.MatrimonyBankService_Service;

/**
 *
 * @author SENJURO
 */
public class PaymentAction extends org.apache.struts.action.Action {

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
        HttpSession session = request.getSession(false);
        int userID = Integer.parseInt(session.getAttribute("idUser").toString());
        PaymentForm paymentForm = (PaymentForm) form;
        String adminBankAccount = "08282012001";
        float amount = Float.parseFloat(paymentForm.getMoney());
        MatrimonyBankService_Service service = new MatrimonyBankService_Service();
        MatrimonyBankService matrimonyBankService = service.getMatrimonyBankServicePort();
        boolean flag = matrimonyBankService.makeTransaction(paymentForm.getIdentityNumber(), adminBankAccount, amount);
        if(flag) {
            int premiumID = Integer.parseInt(session.getAttribute("premiumID").toString());
            UserManager userManager = new UserManager();
            flag = userManager.upgradeAccount(userID, premiumID);
            if(flag) {
                return mapping.findForward("success");
            } else {
                return mapping.findForward("error");
            }
        } else {
            return mapping.findForward("error");
        }
        
    }
}
