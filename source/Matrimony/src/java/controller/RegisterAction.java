/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

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
        
        HttpSession session = request.getSession(false);
        UserManager userManager = new UserManager();
        RegisterForm registerForm = (RegisterForm) form;
        
        String userName = registerForm.getUserName();
        String password = registerForm.getPassword();
        String fullName = registerForm.getFullName();
        String address = registerForm.getAddress();
        String gender = registerForm.getGender();
        String birthDay = registerForm.getBirthDay();
        String email = registerForm.getEmail();
        String phoneNumber = registerForm.getPhoneNumber();
        String maritalStatus = registerForm.getMaritalStatus();
        int height = Integer.parseInt(registerForm.getHeight());
        String countryName = registerForm.getCountryName();
        String cityName = registerForm.getCityName();
        String languages = registerForm.getLanguages();
        String caste = registerForm.getCaste();
        String familyDetails = registerForm.getFamilyDetails();
        String qualification = registerForm.getQualification();
        String workingAt = registerForm.getWorkingAt();
        String hobbies = registerForm.getHobbies();
        String favoriteMusic = registerForm.getFavoriteMusic();
        String movies = registerForm.getMovies();
        String cuisine = registerForm.getCuisine();
        String books = registerForm.getBooks();
        String expireDate = "08/10/2012";
        
        boolean flag = userManager.addNewUser(userName, password, fullName, address, gender, birthDay, email, phoneNumber, maritalStatus, height, countryName, cityName, languages, caste, familyDetails, qualification, workingAt, hobbies, favoriteMusic, movies, cuisine, books, expireDate, "Free");
        if(flag) {
            return mapping.findForward("success");
        } else {
            return mapping.findForward("error");
        }
    }
}
