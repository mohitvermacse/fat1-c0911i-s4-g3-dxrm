/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import java.sql.Date;

/**
 *
 * @author nvc
 */
public class User {

    private int userId;
    private int avatar;
    private Date birthDays;
    private int receiveUserId;
    private String userName;
    private String password;
    private String fullName;
    private String address;
    private String gender;
    private String email;
    private String phoneNumber;
    private String maritalStatus,avatarLink;
    private int height;
    private int cityId;
    private String languages;
    private String caste;
    private String familyDetail;
    private String qualification;
    private String workingAt;
    private String hobbies;    
    private String favorite;
    private String movies;
    private String cuisine;
    private String book;
    private Date registerDate;
    private Date expireDate;
    private String status;
    private String images, sImages;
    private String cityName;
    private String countryName;
    private String birthDay;
    private String sUserName,sAddress,sEmail,sPhoneNumber,sCaste,sFamilyDetail;
    private String sFullName;
    private String sGender;
    private String sMaritalStatus;
    private String sLanguages;
    private String sFamilyDetails;
    private String sQualification;
    private String sWorkingAt;
    private String sHobbies;
    private String sFavorite;
    private String sMovies;
    private String sCuisine;
    private String sBook;
    private String sCityName;
    private String sCountryName;
    private int sHeight;
    private int receiverId;
    private int sendId;
    private String action;
    private String content;
    private int sendUserId;

    public User() {
    }

    /**
     * @return the userId
     */
    public int getUserId() {
        return userId;
    }

    /**
     * @param userId the userId to set
     */
    public void setUserId(int userId) {
        this.userId = userId;
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
    public int getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(int height) {
        this.height = height;
    }

    /**
     * @return the cityId
     */
    public int getCityId() {
        return cityId;
    }

    /**
     * @param cityId the cityId to set
     */
    public void setCityId(int cityId) {
        this.cityId = cityId;
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
     * @return the favorite
     */
    public String getFavorite() {
        return favorite;
    }

    /**
     * @param favorite the favorite to set
     */
    public void setFavorite(String favorite) {
        this.favorite = favorite;
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
     * @return the book
     */
    public String getBook() {
        return book;
    }

    /**
     * @param book the book to set
     */
    public void setBook(String book) {
        this.book = book;
    }

    /**
     * @return the registerDate
     */
    public Date getRegisterDate() {
        return registerDate;
    }

    /**
     * @param registerDate the registerDate to set
     */
    public void setRegisterDate(Date registerDate) {
        this.registerDate = registerDate;
    }

    /**
     * @return the expireDate
     */
    public Date getExpireDate() {
        return expireDate;
    }

    /**
     * @param expireDate the expireDate to set
     */
    public void setExpireDate(Date expireDate) {
        this.expireDate = expireDate;
    }

    /**
     * @return the status
     */
    public String getStatus() {
        return status;
    }

    /**
     * @param status the status to set
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * @return the images
     */
    public String getImages() {
        return images;
    }

    /**
     * @param images the images to set
     */
    public void setImages(String images) {
        this.images = images;
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
     * @return the receiverId
     */
    public int getReceiverId() {
        return receiverId;
    }

    /**
     * @param receiverId the receiverId to set
     */
    public void setReceiverId(int receiverId) {
        this.receiverId = receiverId;
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
     * @return the content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content the content to set
     */
    public void setContent(String content) {
        this.content = content;
    }

    /**
     * @return the sendUserId
     */
    public int getSendUserId() {
        return sendUserId;
    }

    /**
     * @param sendUserId the sendUserId to set
     */
    public void setSendUserId(int sendUserId) {
        this.sendUserId = sendUserId;
    }

    /**
     * @return the sFullName
     */
    public String getsFullName() {
        return sFullName;
    }

    /**
     * @param sFullName the sFullName to set
     */
    public void setsFullName(String sFullName) {
        this.sFullName = sFullName;
    }

    /**
     * @return the sGender
     */
    public String getsGender() {
        return sGender;
    }

    /**
     * @param sGender the sGender to set
     */
    public void setsGender(String sGender) {
        this.sGender = sGender;
    }

    /**
     * @return the sMaritalStatus
     */
    public String getsMaritalStatus() {
        return sMaritalStatus;
    }

    /**
     * @param sMaritalStatus the sMaritalStatus to set
     */
    public void setsMaritalStatus(String sMaritalStatus) {
        this.sMaritalStatus = sMaritalStatus;
    }

    /**
     * @return the sLanguages
     */
    public String getsLanguages() {
        return sLanguages;
    }

    /**
     * @param sLanguages the sLanguages to set
     */
    public void setsLanguages(String sLanguages) {
        this.sLanguages = sLanguages;
    }

    /**
     * @return the sFamilyDetails
     */
    public String getsFamilyDetails() {
        return sFamilyDetails;
    }

    /**
     * @param sFamilyDetails the sFamilyDetails to set
     */
    public void setsFamilyDetails(String sFamilyDetails) {
        this.sFamilyDetails = sFamilyDetails;
    }

    /**
     * @return the sQualification
     */
    public String getsQualification() {
        return sQualification;
    }

    /**
     * @param sQualification the sQualification to set
     */
    public void setsQualification(String sQualification) {
        this.sQualification = sQualification;
    }

    /**
     * @return the sWorkingAt
     */
    public String getsWorkingAt() {
        return sWorkingAt;
    }

    /**
     * @param sWorkingAt the sWorkingAt to set
     */
    public void setsWorkingAt(String sWorkingAt) {
        this.sWorkingAt = sWorkingAt;
    }

    /**
     * @return the sHobbies
     */
    public String getsHobbies() {
        return sHobbies;
    }

    /**
     * @param sHobbies the sHobbies to set
     */
    public void setsHobbies(String sHobbies) {
        this.sHobbies = sHobbies;
    }

    /**
     * @return the sFavorite
     */
    public String getsFavorite() {
        return sFavorite;
    }

    /**
     * @param sFavorite the sFavorite to set
     */
    public void setsFavorite(String sFavorite) {
        this.sFavorite = sFavorite;
    }

    /**
     * @return the sMovies
     */
    public String getsMovies() {
        return sMovies;
    }

    /**
     * @param sMovies the sMovies to set
     */
    public void setsMovies(String sMovies) {
        this.sMovies = sMovies;
    }

    /**
     * @return the sCuisine
     */
    public String getsCuisine() {
        return sCuisine;
    }

    /**
     * @param sCuisine the sCuisine to set
     */
    public void setsCuisine(String sCuisine) {
        this.sCuisine = sCuisine;
    }

    /**
     * @return the sBook
     */
    public String getsBook() {
        return sBook;
    }

    /**
     * @param sBook the sBook to set
     */
    public void setsBook(String sBook) {
        this.sBook = sBook;
    }

    /**
     * @return the sCityName
     */
    public String getsCityName() {
        return sCityName;
    }

    /**
     * @param sCityName the sCityName to set
     */
    public void setsCityName(String sCityName) {
        this.sCityName = sCityName;
    }

    /**
     * @return the sCountryName
     */
    public String getsCountryName() {
        return sCountryName;
    }

    /**
     * @param sCountryName the sCountryName to set
     */
    public void setsCountryName(String sCountryName) {
        this.sCountryName = sCountryName;
    }

    /**
     * @return the sHeight
     */
    public int getsHeight() {
        return sHeight;
    }

    /**
     * @param sHeight the sHeight to set
     */
    public void setsHeight(int sHeight) {
        this.sHeight = sHeight;
    }

    /**
     * @return the sImages
     */
    public String getsImages() {
        return sImages;
    }

    /**
     * @param sImages the sImages to set
     */
    public void setsImages(String sImages) {
        this.sImages = sImages;
    }

    /**
     * @return the receiveUserId
     */
    public int getReceiveUserId() {
        return receiveUserId;
    }

    /**
     * @param receiveUserId the receiveUserId to set
     */
    public void setReceiveUserId(int receiveUserId) {
        this.receiveUserId = receiveUserId;
    }

    /**
     * @return the avatar
     */
    public int getAvatar() {
        return avatar;
    }

    /**
     * @param avatar the avatar to set
     */
    public void setAvatar(int avatar) {
        this.avatar = avatar;
    }

    /**
     * @return the birthDays
     */
    public Date getBirthDays() {
        return birthDays;
    }

    /**
     * @param birthDays the birthDays to set
     */
    public void setBirthDays(Date birthDays) {
        this.birthDays = birthDays;
    }

    /**
     * @return the sUserName
     */
    public String getsUserName() {
        return sUserName;
    }

    /**
     * @param sUserName the sUserName to set
     */
    public void setsUserName(String sUserName) {
        this.sUserName = sUserName;
    }

    /**
     * @return the sAddress
     */
    public String getsAddress() {
        return sAddress;
    }

    /**
     * @param sAddress the sAddress to set
     */
    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    /**
     * @return the sEmail
     */
    public String getsEmail() {
        return sEmail;
    }

    /**
     * @param sEmail the sEmail to set
     */
    public void setsEmail(String sEmail) {
        this.sEmail = sEmail;
    }

    /**
     * @return the sPhoneNumber
     */
    public String getsPhoneNumber() {
        return sPhoneNumber;
    }

    /**
     * @param sPhoneNumber the sPhoneNumber to set
     */
    public void setsPhoneNumber(String sPhoneNumber) {
        this.sPhoneNumber = sPhoneNumber;
    }

    /**
     * @return the sCaste
     */
    public String getsCaste() {
        return sCaste;
    }

    /**
     * @param sCaste the sCaste to set
     */
    public void setsCaste(String sCaste) {
        this.sCaste = sCaste;
    }

    /**
     * @return the sFamilyDetail
     */
    public String getsFamilyDetail() {
        return sFamilyDetail;
    }

    /**
     * @param sFamilyDetail the sFamilyDetail to set
     */
    public void setsFamilyDetail(String sFamilyDetail) {
        this.sFamilyDetail = sFamilyDetail;
    }

    /**
     * @return the avatarLink
     */
    public String getAvatarLink() {
        return avatarLink;
    }

    /**
     * @param avatarLink the avatarLink to set
     */
    public void setAvatarLink(String avatarLink) {
        this.avatarLink = avatarLink;
    }

}
