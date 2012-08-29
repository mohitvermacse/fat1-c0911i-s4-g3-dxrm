/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
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
        PaymentForm pf = (PaymentForm) form;
        UserManager u = new UserManager();

        MatrimonyBankService_Service service = new MatrimonyBankService_Service();
        MatrimonyBankService pb = service.getMatrimonyBankServicePort();

        System.out.print("bacsadsa"+ pf.getMoney() +pf.getIdentityNumber() + pf.getPassword());
//        if (pb.checkIdentityNumber(pf.getIdentityNumber(), pf.getPassword())) {
//            System.out.println("Identity card valid!");
//        }
//        if (pb.checkBalance(pf.getIdentityNumber(), Float.parseFloat(pf.getAmount()))){
//            System.out.println("money valid!");
//        }
        return mapping.findForward("success");
    }
}
