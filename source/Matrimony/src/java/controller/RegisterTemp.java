/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.CountryBean;
import bean.CountryBus;
import bean.UserManager;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author SENJURO
 */
public class RegisterTemp extends org.apache.struts.action.Action {

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
//        UserManager userManager = new UserManager();
//        userManager.fillCityList();
//        userManager.fillCountryList();
//        session.setAttribute("userManager", userManager);
        CountryBus cBus = new CountryBus();
        CountryBean cBean = new CountryBean();
        cBean.setAr(cBus.GetAllCountry());
        request.setAttribute("countryList", cBean);
        return mapping.findForward("register");
    }
}
