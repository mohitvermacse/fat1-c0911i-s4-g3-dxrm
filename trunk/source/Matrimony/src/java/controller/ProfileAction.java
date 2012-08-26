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
public class ProfileAction extends org.apache.struts.action.Action {

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
        ProfileForm profileForm = (ProfileForm) form;
        
        String password = profileForm.getPassword();
        String fullName = profileForm.getFullName();
        String address = profileForm.getAddress();
        String gender = profileForm.getGender();
        String birthDay = profileForm.getBirthDay();
        String email = profileForm.getEmail();
        String phoneNumber = profileForm.getPhoneNumber();
        String maritalStatus = profileForm.getMaritalStatus();
        int height = Integer.parseInt(profileForm.getHeight());
        String countryName = profileForm.getCountryName();
        String cityName = profileForm.getCityName();
        String languages = profileForm.getLanguages();
        String caste = profileForm.getCaste();
        String familyDetails = profileForm.getFamilyDetails();
        String qualification = profileForm.getQualification();
        String workingAt = profileForm.getWorkingAt();
        String hobbies = profileForm.getHobbies();
        String favoriteMusic = profileForm.getFavoriteMusic();
        String movies = profileForm.getMovies();
        String cuisine = profileForm.getCuisine();
        String books = profileForm.getBooks();
        boolean flag = userManager.updateProfile(1, password, fullName, address, gender, birthDay, email, phoneNumber, maritalStatus, height, countryName, cityName, languages, caste, familyDetails, qualification, workingAt, hobbies, favoriteMusic, movies, cuisine, books);
        if(flag) {
            return mapping.findForward("success");
        } else {
            return mapping.findForward("error");
        }
    }
}
