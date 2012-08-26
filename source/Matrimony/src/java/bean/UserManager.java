/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Users;
import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.sql.Date;

/**
 *
 * @author SENJURO
 */
public class UserManager {
    ConnectDB conn;
    private ArrayList userList = new ArrayList();
    ArrayList cityList = new ArrayList();
    ArrayList countryList = new ArrayList();
    
    public boolean addNewUser(String userName, String password, String fullName, String address, String gender, String birthDay, String email, String phoneNumber, String maritalStatus, int height, String countryName, String cityName, String languages, String caste, String familyDetails, String qualification, String workingAt, String hobbies, String favoriteMusic, String movies, String cuisine, String books, String expireDate, String status) {
        boolean flag = false;
        conn = new ConnectDB();
        int cityID = getCityID(cityName);
        int countryID = getCountryID(countryName);
        boolean checkUserName = checkUserName(userName);
        try {
            String query = "INSERT INTO users(userName, password, fullName, address, gender, birthDay, email, phoneNumber, maritalStatus, height, countryID, cityID, languages, caste, familyDetails, qualification, workingAt, hobbies, favoriteMusic, movies, cuisine, books, expireDate, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, userName);
            prs.setString(2, password);
            prs.setString(3, fullName);
            prs.setString(4, address);
            prs.setString(5, gender);
            prs.setString(6, birthDay);
            prs.setString(7, email);
            prs.setString(8, phoneNumber);
            prs.setString(9, maritalStatus);
            prs.setInt(10, height);
            prs.setInt(11, countryID);
            prs.setInt(12, cityID);
            prs.setString(13, languages);
            prs.setString(14, caste);
            prs.setString(15, familyDetails);
            prs.setString(16, qualification);
            prs.setString(17, workingAt);
            prs.setString(18, hobbies);
            prs.setString(19, favoriteMusic);
            prs.setString(20, movies);
            prs.setString(21, cuisine);
            prs.setString(22, books);
            prs.setString(23, expireDate);
            prs.setString(24, status);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        } 
        return flag;
    }
    
    public boolean fillUserProfile(int userID) {
        conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "SELECT * FROM users WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                Users user = new Users();
                user.setUserId(rs.getInt(1));
                user.setUserName(rs.getString(2));
                user.setPassword(rs.getString(3));
                user.setFullName(rs.getString(4));
                user.setAddress(rs.getString(5));
                user.setGender(rs.getString(6));
                user.setBirthDay(rs.getDate(7).toString());
                user.setEmail(rs.getString(8));
                user.setPhoneNumber(rs.getString(9));
                user.setMaritalStatus(rs.getString(10));
                user.setHeight(rs.getInt(11));
                user.setCountryName(getCountryName(rs.getInt(12)));
                user.setCityName(getCityName(rs.getInt(13)));
                user.setLanguages(rs.getString(14));
                user.setCaste(rs.getString(15));
                user.setFamilyDetail(rs.getString(16));
                user.setQualification(rs.getString(17));
                user.setWorkingAt(rs.getString(18));
                user.setHobbies(rs.getString(19));
                user.setFavorite(rs.getString(20));
                user.setMovies(rs.getString(21));
                user.setCuisine(rs.getString(22));
                user.setBook(rs.getString(23));
                user.setRegisterDate(rs.getDate(24));
                user.setExpireDate(rs.getDate(25));
                user.setStatus(rs.getString(26));
                getUserList().add(user);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        } 
        return flag;
    }
    
    public boolean updateProfile(int userID, String password, String fullName, String address, String gender, String birthDay, String email, String phoneNumber, String maritalStatus, int height, String countryName, String cityName, String languages, String caste, String familyDetails, String qualification, String workingAt, String hobbies, String favoriteMusic, String movies, String cuisine, String books) {
        boolean flag = false;
        conn = new ConnectDB();
        int cityID = getCityID(cityName);
        int countryID = getCountryID(countryName);
        try {
            String query = "UPDATE users SET password = ?, fullName = ?, address = ?, gender = ?, email = ?, phoneNumber = ?, maritalStatus = ?, height = ?, countryID = ?, cityID = ?, languages = ?, caste = ?, familyDetails = ?, qualification = ?, workingAt = ?, hobbies = ?, favoriteMusic = ?, movies = ?, cuisine = ?, books = ? WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, password);
            prs.setString(2, fullName);
            prs.setString(3, address);
            prs.setString(4, gender);
            //prs.setString(5, birthDay);
            prs.setString(5, email);
            prs.setString(6, phoneNumber);
            prs.setString(7, maritalStatus);
            prs.setInt(8, height);
            prs.setInt(9, countryID);
            prs.setInt(10, cityID);
            prs.setString(11, languages);
            prs.setString(12, caste);
            prs.setString(13, familyDetails);
            prs.setString(14, qualification);
            prs.setString(15, workingAt);
            prs.setString(16, hobbies);
            prs.setString(17, favoriteMusic);
            prs.setString(18, movies);
            prs.setString(19, cuisine);
            prs.setString(20, books);
            prs.setInt(21, userID);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        } 
        return flag;
    }
    
    public int getCityID(String cityName) {
        conn = new ConnectDB();
        int cityID = 0;
        try {
            String query = "SELECT cityID FROM city WHERE cityName = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, cityName);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                cityID = rs.getInt(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        return cityID;
    }
    
    public String getCityName(int cityID) {
        conn = new ConnectDB();
        String cityName = "";
        try {
            String query = "SELECT cityName FROM city WHERE cityID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, cityID);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                cityName = rs.getString(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        return cityName;
    }
    
    public void fillCityList() {
        conn = new ConnectDB();
        try {
            String query = "SELECT cityName FROM city";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            ResultSet rs = prs.executeQuery();
            while(rs.next()) {
                cityList.add(rs.getString(1));
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    public int getCountryID(String countryName) {
        conn = new ConnectDB();
        int countryID = 0;
        try {
            String query = "SELECT countryID FROM country WHERE countryName = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, countryName);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                countryID = rs.getInt(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        return countryID;
    }
    
    public String getCountryName(int countryID) {
        conn = new ConnectDB();
        String countryName = "";
        try {
            String query = "SELECT countryName FROM country WHERE countryID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, countryID);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                countryName = rs.getString(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        return countryName;
    }
    
    public void fillCountryList() {
        conn = new ConnectDB();
        try {
            String query = "SELECT countryName FROM country";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            ResultSet rs = prs.executeQuery();
            while(rs.next()) {
                countryList.add(rs.getString(1));
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
    }
    
    public boolean checkUserName(String userName) {
        conn = new ConnectDB();
        try {
            String query = "SELECT userID FROM users WHERE userName = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, userName);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                return false;
            }
            prs.close();
            conn.closeConnect();
            
        } catch(Exception ex) {
            ex.printStackTrace();
        } 
        return true;
    }
    
    public ArrayList getUserList() {
        return userList;
    }
    
    public ArrayList getCityList() {
        return this.cityList;
    }
    
    public ArrayList getCountryList() {
        return this.countryList;
    }

}
