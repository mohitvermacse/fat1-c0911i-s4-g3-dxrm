/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nvc
 */
public class Admin {

    private int adId;
    private String userName;
    private String password;

    public Admin() {
    }

    /**
     * @return the adId
     */
    public int getAdId() {
        return adId;
    }

    /**
     * @param adId the adId to set
     */
    public void setAdId(int adId) {
        this.adId = adId;
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
}
