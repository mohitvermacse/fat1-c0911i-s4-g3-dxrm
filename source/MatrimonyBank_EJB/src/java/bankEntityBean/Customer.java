/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;

import java.sql.Date;

/**
 *
 * @author SENJURO
 */
public class Customer {
    private int customerID;
    private int identityNumber;
    private String password;
    private String fullName;
    private String address;
    private String email;
    private String phoneNumber;
    private Date registedDate;

    /**
     * @return the customerID
     */
    public int getCustomerID() {
        return customerID;
    }

    /**
     * @param customerID the customerID to set
     */
    public void setCustomerID(int customerID) {
        this.customerID = customerID;
    }

    /**
     * @return the identityNumber
     */
    public int getIdentityNumber() {
        return identityNumber;
    }

    /**
     * @param identityNumber the identityNumber to set
     */
    public void setIdentityNumber(int identityNumber) {
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
     * @return the registedDate
     */
    public Date getRegistedDate() {
        return registedDate;
    }

    /**
     * @param registedDate the registedDate to set
     */
    public void setRegistedDate(Date registedDate) {
        this.registedDate = registedDate;
    }
}
