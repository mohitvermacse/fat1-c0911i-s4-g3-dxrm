/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import bean.UserManager;
import bean.Validate;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author SENJURO
 */
public class RegisterForm extends org.apache.struts.action.ActionForm {
    
    private String name;
    private int number;
    private String submit;
    private String userName;
    private String password;
    private String rePassword;
    private String fullName;
    private String address;
    private String gender;
    private String birthDay;
    private String email;
    private String phoneNumber;
    private String maritalStatus;
    private String height;
    private String countryName;
    private String cityName;
    private String languages;
    private String caste;
    private String familyDetails;
    private String qualification;
    private String workingAt;
    private String hobbies;
    private String favoriteMusic;
    private String movies;
    private String cuisine;
    private String books;

    /**
     * @return
     */
    public String getName() {
        return name;
    }

    /**
     * @param string
     */
    public void setName(String string) {
        name = string;
    }

    /**
     * @return
     */
    public int getNumber() {
        return number;
    }

    /**
     * @param i
     */
    public void setNumber(int i) {
        number = i;
    }

    /**
     * @return the submit
     */
    public String getSubmit() {
        return submit;
    }

    /**
     * @param submit the submit to set
     */
    public void setSubmit(String submit) {
        this.submit = submit;
    }

    /**
     *
     */
    public RegisterForm() {
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
        UserManager userManager = new UserManager();
        UserAccess ua = new UserAccess();
        Validate v = new Validate();
        
        DateFormat formatter = new SimpleDateFormat("mm/dd/yyyy");
        java.util.Date birth = null;
        
        if (getSubmit() == null || getSubmit().length() < 1) {
            errors.add("name", new ActionMessage("error.name.required"));
            // TODO: add 'error.name.required' key to your resources
        }

//        if (getUserName() == null || getUserName().length() < 6) {
//            errors.add("userNameError", new ActionMessage("errors.userName.error"));
//            return errors;
//        }
        if (!userManager.checkUserName(userName)) {
            errors.add("existed", new ActionMessage("errors.userName.existed"));
            return errors;
        }
        
        if (!v.checkUserName(userName)) {
            errors.add("userNameError", new ActionMessage("errors.userName.error"));
            return errors;
        }
        
        if (!v.checkPassword(password)) {
            errors.add("passwordError", new ActionMessage("error.password.required"));
            return errors;
        }
        if (!v.checkpassword(password, rePassword)) {
            errors.add("passwordNotMatch", new ActionMessage("error.password.reType"));
            return errors;
        }
        if (!v.checkFirstName(fullName)) {
            errors.add("fullNameError", new ActionMessage("error.fullNameError.required"));
            return errors;
        }
        if (getAddress() == null || getAddress().length() < 5) {
            errors.add("addressError", new ActionMessage("error.Address.required"));
            return errors;
        }
        if (getGender() == null || getGender().length() < 1) {
            errors.add("genderError", new ActionMessage("error.genderError.required"));
            return errors;
        }
        try {
            if (getBirthDay() == null || getBirthDay().length() < 1) {
                errors.add("birthdayError", new ActionMessage("error.birthdayError.required"));
                
            } else {
                birth = (Date) formatter.parse(birthDay);
                if (!v.checkBirthDay(birth)) {
                    errors.add("birthdayInvalid", new ActionMessage("error.birthdayError.invalid"));
                }                
            }
        } catch (ParseException ex) {
            Logger.getLogger(RegisterForm.class.getName()).log(Level.SEVERE, null, ex);
        }
        /*if (!userManager.checkEmail(email)) {
            errors.add("emailExisted", new ActionMessage("errors.emailExisted.existed"));
            return errors;
        }      */  
        if (!v.isValidEmailAddress(email)) {
            errors.add("invalidEmail", new ActionMessage("error.invalidEmail.invalid"));
        }
        if (!v.checkPhone(phoneNumber)) {
            System.out.println(phoneNumber);
            errors.add("phoneInvalid", new ActionMessage("error.phoneinvalid.invalid"));
            return errors;
        }
        if (!v.checkHeight(height)) {
            errors.add("heightInvalid", new ActionMessage("error.heightInvalid.invalid"));
            return errors;
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
     * @return the fullName
     */
    public String getFullName() {
        return fullName;
    }

    /**
     * @param fullName the fullName to set
     */
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    /**
     * @return the address
     */
    public String getAddress() {
        return address;
    }

    /**
     * @param address the address to set
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * @return the gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender the gender to set
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return the birthDay
     */
    public String getBirthDay() {
        return birthDay;
    }

    /**
     * @param birthDay the birthDay to set
     */
    public void setBirthDay(String birthDay) {
        this.birthDay = birthDay;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return the phoneNumber
     */
    public String getPhoneNumber() {
        return phoneNumber;
    }

    /**
     * @param phoneNumber the phoneNumber to set
     */
    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    /**
     * @return the maritalStatus
     */
    public String getMaritalStatus() {
        return maritalStatus;
    }

    /**
     * @param maritalStatus the maritalStatus to set
     */
    public void setMaritalStatus(String maritalStatus) {
        this.maritalStatus = maritalStatus;
    }

    /**
     * @return the height
     */
    public String getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(String height) {
        this.height = height;
    }

    /**
     * @return the cityName
     */
    public String getCityName() {
        return cityName;
    }

    /**
     * @param cityName the cityName to set
     */
    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    /**
     * @return the languages
     */
    public String getLanguages() {
        return languages;
    }

    /**
     * @param languages the languages to set
     */
    public void setLanguages(String languages) {
        this.languages = languages;
    }

    /**
     * @return the caste
     */
    public String getCaste() {
        return caste;
    }

    /**
     * @param caste the caste to set
     */
    public void setCaste(String caste) {
        this.caste = caste;
    }

    /**
     * @return the familyDetails
     */
    public String getFamilyDetails() {
        return familyDetails;
    }

    /**
     * @param familyDetails the familyDetails to set
     */
    public void setFamilyDetails(String familyDetails) {
        this.familyDetails = familyDetails;
    }

    /**
     * @return the qualification
     */
    public String getQualification() {
        return qualification;
    }

    /**
     * @param qualification the qualification to set
     */
    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    /**
     * @return the workingAt
     */
    public String getWorkingAt() {
        return workingAt;
    }

    /**
     * @param workingAt the workingAt to set
     */
    public void setWorkingAt(String workingAt) {
        this.workingAt = workingAt;
    }

    /**
     * @return the hobbies
     */
    public String getHobbies() {
        return hobbies;
    }

    /**
     * @param hobbies the hobbies to set
     */
    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    /**
     * @return the favoriteMusic
     */
    public String getFavoriteMusic() {
        return favoriteMusic;
    }

    /**
     * @param favoriteMusic the favoriteMusic to set
     */
    public void setFavoriteMusic(String favoriteMusic) {
        this.favoriteMusic = favoriteMusic;
    }

    /**
     * @return the movies
     */
    public String getMovies() {
        return movies;
    }

    /**
     * @param movies the movies to set
     */
    public void setMovies(String movies) {
        this.movies = movies;
    }

    /**
     * @return the cuisine
     */
    public String getCuisine() {
        return cuisine;
    }

    /**
     * @param cuisine the cuisine to set
     */
    public void setCuisine(String cuisine) {
        this.cuisine = cuisine;
    }

    /**
     * @return the books
     */
    public String getBooks() {
        return books;
    }

    /**
     * @param books the books to set
     */
    public void setBooks(String books) {
        this.books = books;
    }

    /**
     * @return the countryName
     */
    public String getCountryName() {
        return countryName;
    }

    /**
     * @param countryName the countryName to set
     */
    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    /**
     * @return the rePassword
     */
    public String getRePassword() {
        return rePassword;
    }

    /**
     * @param rePassword the rePassword to set
     */
    public void setRePassword(String rePassword) {
        this.rePassword = rePassword;
    }
}
