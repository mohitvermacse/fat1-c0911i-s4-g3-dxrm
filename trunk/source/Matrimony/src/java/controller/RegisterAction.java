/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import entity.Users;
import java.util.ArrayList;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author nvc
 */
public class RegisterAction extends org.apache.struts.action.Action {

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
        Users u = new Users();
        RegisterForm register = (RegisterForm) form;
        UserAccess ua = new UserAccess();
        String map = register.getMap(), action;
        action = register.getAction();

        String fullName = register.getFirstName() + " " + register.getLastName();
        u.setUserName(register.getUserName());
        u.setPassword(register.getPassword());
        u.setFullName(fullName);
        u.setAddress(register.getAddress());
        u.setGender(register.getGender());
        u.setBirthDay(register.getBirthDay());
        u.setEmail(register.getEmail());
        u.setPhoneNumber(register.getPhoneNumber());
        u.setMaritalStatus(register.getMaritalStatus());
        u.setHeight(Integer.parseInt(register.getHeight()));
        u.setCityId(Integer.parseInt(register.getCity()));
        u.setLanguages(register.getLanguages());
        u.setCaste(register.getCaste());
        u.setFamilyDetail(register.getFamilyDetail());
        u.setQualification(register.getQualification());
        u.setWorkingAt(register.getWorkingAt());
        u.setHobbies(register.getHobbies());
        u.setFavorite(register.getFavoriteMusic());
        u.setMovies(register.getMovies());
        u.setCuisine(register.getCuisine());
        u.setBook(register.getBooks());
        u.setStatus("Pending");
        if (action.equalsIgnoreCase("Register")) {
            if (ua.insertUser(u)) {
                map = "pay";
                ArrayList arrayPrmium = (ArrayList) ua.getAllPremium();
                request.setAttribute("listPremium", arrayPrmium);
                System.out.println("   MAP 1 ::::::: " + map + " " + register.getUserName() + " " + register.getEmail());
            }

        }
        if (action.equalsIgnoreCase("Pay ment")) {
            System.out.println("PayMent Success.." + register.getUserName() + " Amount: " + register.getAmount() +" PreID: "+ register.getPremium());
        }
       
        return mapping.findForward(map);
    }
}
