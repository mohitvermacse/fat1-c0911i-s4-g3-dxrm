/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

/**
 *
 * @author nvc
 */
public class Country {
    private String countryId;
    private String countryName;
    public Country(){}

    public Country(String countryId, String countryName) {
        this.countryId = countryId;
        this.countryName = countryName;
    }

    /**
     * @return the countryId
     */
    public String getCountryId() {
        return countryId;
    }

    /**
     * @param countryId the countryId to set
     */
    public void setCountryId(String countryId) {
        this.countryId = countryId;
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
    
}
