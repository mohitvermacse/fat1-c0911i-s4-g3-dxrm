/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import bean.UserAccess;
import bean.Validate;
import javax.servlet.http.HttpServletRequest;

import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author nvc
 */
public class RegisterForm extends org.apache.struts.action.ActionForm {

    private String userName, password, firstName, lastName, address, gender, birthDay, email, phoneNumber, maritalStatus;
    private String city,movies;
    private String languages;
    private String caste;
    private String familyDetail;
    private String qualification;
    private String workingAt;
    private String hobbies;
    private String favoriteMusic;
    private String cuisine;
    private String books;
    private String height;
    private String action;
    private String amount;
    private String premium,map;
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

        Validate valid = new Validate();
        UserAccess ua = new UserAccess();

        if (!valid.checkUserName(getUserName())) {
            errors.add("userNameEr", new ActionMessage("error.userNameEr.required"));
        }
        if (!valid.checkPassword(getPassword())) {
            errors.add("passwordEr", new ActionMessage("error.passwordEr.required"));
        }
        if (!valid.checkFirstName(getFirstName())) {
            errors.add("firstNameEr", new ActionMessage("error.firstNameEr.required"));
        }
        if (!valid.checkLastName(getLastName())) {
            errors.add("lastNameEr", new ActionMessage("error.lastNameEr.required"));
        }
        if (gender.equalsIgnoreCase("Select")) {
            errors.add("genderEr", new ActionMessage("error.genderEr.required"));
        }
        if (!valid.isValidEmailAddress(getEmail())) {
            errors.add("emailEr", new ActionMessage("error.emailEr.required"));
        }
        if (valid.checkPhone(getPhoneNumber())) {
            errors.add("phoneEr", new ActionMessage("error.phoneEr.required"));
        }
        if (!ua.checkUserName(userName)) {
            errors.add("userEmailEr", new ActionMessage("error.userEmailEr.required"));
        }
        if (!ua.checkEmail(email)) {
            errors.add("EmailEr", new ActionMessage("error.EmailEr.required"));
        }if(getCity().equalsIgnoreCase("Seleect")){
            errors.add("cityEr", new ActionMessage("error.cityEr.required"));
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
     * @return the firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName the firstName to set
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return the lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName the lastName to set
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
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
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
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
     * @return the familyDetail
     */
    public String getFamilyDetail() {
        return familyDetail;
    }

    /**
     * @param familyDetail the familyDetail to set
     */
    public void setFamilyDetail(String familyDetail) {
        this.familyDetail = familyDetail;
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
     * @return the amount
     */
    public String getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }

    /**
     * @return the premium
     */
    public String getPremium() {
        return premium;
    }

    /**
     * @param premium the premium to set
     */
    public void setPremium(String premium) {
        this.premium = premium;
    }

    /**
     * @return the map
     */
    public String getMap() {
        return map;
    }

    /**
     * @param map the map to set
     */
    public void setMap(String map) {
        this.map = map;
    }
}
