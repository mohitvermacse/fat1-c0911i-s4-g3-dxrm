/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.*;
import java.sql.*;
import java.text.*;
import java.util.ArrayList;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author SENJURO
 */
public class UserManager {

    ConnectDB conn;
    private ArrayList userList = new ArrayList();
    ArrayList cityList = new ArrayList();
    ArrayList countryList = new ArrayList();
    ArrayList premiumPlans = new ArrayList();
    ConnectDB db = new ConnectDB();

    public boolean addNewUser(String userName, String password, int avatar, String fullName, String address, String gender, String birthDay, String email, String phoneNumber, String maritalStatus, int height, String countryName, String cityName, String languages, String caste, String familyDetails, String qualification, String workingAt, String hobbies, String favoriteMusic, String movies, String cuisine, String books, String expireDate, String status) {
        boolean flag = false;
        conn = new ConnectDB();
        int cityID = Integer.parseInt(cityName);
        //int countryID = getCountryID(countryName);
        boolean checkUserName = checkUserName(userName);
        String pass = db.md5(password);
        try {
            String query = "INSERT INTO users(userName, password, avatar, fullName, address, gender, birthDay, email, phoneNumber, maritalStatus, height, countryID, cityID, languages, caste, familyDetails, qualification, workingAt, hobbies, favoriteMusic, movies, cuisine, books, expireDate, status) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ? ,? ,?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, userName);
            prs.setString(2, pass);
            prs.setInt(3, avatar);
            prs.setString(4, fullName);
            prs.setString(5, address);
            prs.setString(6, gender);
            prs.setString(7, birthDay);
            prs.setString(8, email);
            prs.setString(9, phoneNumber);
            prs.setString(10, maritalStatus);
            prs.setInt(11, height);
            prs.setString(12, countryName);
            prs.setInt(13, cityID);
            prs.setString(14, languages);
            prs.setString(15, caste);
            prs.setString(16, familyDetails);
            prs.setString(17, qualification);
            prs.setString(18, workingAt);
            prs.setString(19, hobbies);
            prs.setString(20, favoriteMusic);
            prs.setString(21, movies);
            prs.setString(22, cuisine);
            prs.setString(23, books);
            prs.setString(24, expireDate);
            prs.setString(25, status);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch (Exception ex) {
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
            if (rs.next()) {
                User user = new User();
                user.setUserId(rs.getInt(1));
                user.setUserName(rs.getString(2));
                user.setPassword(db.md5(rs.getString(3)));
                user.setFullName(rs.getString(5));
                user.setAddress(rs.getString(6));
                user.setGender(rs.getString(7));
                user.setBirthDay(rs.getDate(8).toString());
                user.setEmail(rs.getString(9));
                user.setPhoneNumber(rs.getString(10));
                user.setMaritalStatus(rs.getString(11));
                user.setHeight(rs.getInt(12));
                user.setCountryName(getCountryName(rs.getInt(13)));
                user.setCityName(getCityName(rs.getInt(14)));
                user.setLanguages(rs.getString(15));
                user.setCaste(rs.getString(16));
                user.setFamilyDetail(rs.getString(17));
                user.setQualification(rs.getString(18));
                user.setWorkingAt(rs.getString(19));
                user.setHobbies(rs.getString(20));
                user.setFavorite(rs.getString(21));
                user.setMovies(rs.getString(22));
                user.setCuisine(rs.getString(23));
                user.setBook(rs.getString(24));
                user.setRegisterDate(rs.getDate(25));
                user.setExpireDate(rs.getDate(26));
                user.setStatus(rs.getString(27));
                getUserList().add(user);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
            flag = true;
        } catch (Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean updateProfile(int userID, String fullName, String address, String gender, String birthDay, String email, String phoneNumber, String maritalStatus, int height, String countryName, String cityName, String languages, String caste, String familyDetails, String qualification, String workingAt, String hobbies, String favoriteMusic, String movies, String cuisine, String books) {
        boolean flag = false;
        conn = new ConnectDB();
        int cityID = getCityID(cityName);
        int countryID = getCountryID(countryName);
        try {
            String query = "UPDATE users SET fullName = ?, address = ?, gender = ?, birthDay = ?, email = ?, phoneNumber = ?, maritalStatus = ?, height = ?, countryID = ?, cityID = ?, languages = ?, caste = ?, familyDetails = ?, qualification = ?, workingAt = ?, hobbies = ?, favoriteMusic = ?, movies = ?, cuisine = ?, books = ? WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, fullName);
            prs.setString(2, address);
            prs.setString(3, gender);
            prs.setString(4, birthDay);
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
        } catch (Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean upgradeAccount(int userID, int premiumID) {
        boolean flag = false;
        conn = new ConnectDB();
        String premiumType = getPremiumType(premiumID);

        if (checkUserStatus(userID)) {
            String d = getUserExpireDate(userID);
            int month = Integer.parseInt(d.substring(5, 7));
            int day = Integer.parseInt(d.substring(8, 10));
            int year = Integer.parseInt(d.substring(0, 4));
            if (premiumType.equalsIgnoreCase("One Month")) {
                if (month == 12) {
                    month = 1;
                    year = year + 1;
                } else {
                    month = month + 1;
                }
            }
            if (premiumType.equalsIgnoreCase("One Year")) {
                year = year + 1;
            }
            String expireDate = month + "/" + day + "/" + year;
            try {
                String query = "UPDATE users SET expireDate = ? WHERE userID = ?";
                PreparedStatement prs = conn.getConnect().prepareStatement(query);
                prs.setString(1, expireDate);
                prs.setInt(2, userID);
                prs.executeUpdate();
                prs.close();
                conn.closeConnect();
                flag = true;
                insertTransaction(userID, premiumID);
            } catch (Exception ex) {
                ex.printStackTrace();
                flag = false;
            }

        } else {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            java.util.Date now = new java.util.Date();
            String d = dateFormat.format(now).toString();
            int value = 1;
            int month = Integer.parseInt(d.substring(0, 2));
            int day = Integer.parseInt(d.substring(3, 5));
            int year = Integer.parseInt(d.substring(6, 10));
            if (premiumType.equalsIgnoreCase("One Month")) {
                if (month == 12) {
                    month = 1;
                    year = year + 1;
                } else {
                    month = month + 1;
                }
            }
            if (premiumType.equalsIgnoreCase("One Year")) {
                year = year + 1;
            }
            String expireDate = month + "/" + day + "/" + year;
            try {
                String query = "UPDATE users SET expireDate = ?, status = ? WHERE userID = ?";
                PreparedStatement prs = conn.getConnect().prepareStatement(query);
                prs.setString(1, expireDate);
                prs.setString(2, "Paid");
                prs.setInt(3, userID);
                prs.executeUpdate();
                prs.close();
                conn.closeConnect();
                flag = true;
                insertTransaction(userID, premiumID);
            } catch (Exception ex) {
                ex.printStackTrace();
                flag = false;
            }
        }

        return flag;
    }

    public boolean checkUserStatus(int userID) {
        boolean flag = false;
        conn = new ConnectDB();
        try {
            String query = "SELECT status FROM users WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                if (rs.getString(1).equalsIgnoreCase("Paid")) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public void insertTransaction(int userID, int premiumID) {
        conn = new ConnectDB();
        try {
            String query = "INSERT INTO transactions (userID, premiumID) VALUES (?, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            prs.setInt(2, premiumID);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public String getPremiumType(int premiumID) {
        conn = new ConnectDB();
        String premiumType = "";
        try {
            String query = "SELECT premiumType FROM premium WHERE premiumID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, premiumID);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                premiumType = rs.getString(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return premiumType;
    }

    public String getUserExpireDate(int userID) {
        conn = new ConnectDB();
        String expireDate = "";
        try {
            String query = "SELECT expireDate FROM users WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                expireDate = rs.getDate(1).toString();
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return expireDate;
    }

    public int getCityID(String cityName) {
        conn = new ConnectDB();
        int cityID = 0;
        try {
            String query = "SELECT cityID FROM city WHERE cityName = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, cityName);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                cityID = rs.getInt(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            if (rs.next()) {
                cityName = rs.getString(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            while (rs.next()) {
                cityList.add(rs.getString(1));
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public void fillPremiumPlan() {
        conn = new ConnectDB();
        try {
            String query = "SELECT * FROM premium";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            ResultSet rs = prs.executeQuery();
            while (rs.next()) {
                Premium premium = new Premium();
                premium.setPreId(rs.getInt(1));
                premium.setPreType(rs.getString(2));
                premium.setAmount(rs.getInt(3));
                premiumPlans.add(premium);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            if (rs.next()) {
                countryID = rs.getInt(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            if (rs.next()) {
                countryName = rs.getString(1);
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            while (rs.next()) {
                countryList.add(rs.getString(1));
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch (Exception ex) {
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
            if (rs.next()) {
                return false;
            }
            prs.close();
            conn.closeConnect();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }
    
    public String getEmail(String userName) {
        conn = new ConnectDB();
        String email = "";
        try {
            String procedure = "{call GetEmail(?)}";
            PreparedStatement prs = conn.getConnect().prepareCall(procedure);
            prs.setString(1, userName);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                email = rs.getString(1);
            }
            prs.close();
            conn.closeConnect();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return email;
    }
    
    public boolean checkEmail(String email) {
        conn = new ConnectDB();
        try {
            String procedure = "{call CheckExistEmail(?)}";
            PreparedStatement prs = conn.getConnect().prepareCall(procedure);
            prs.setString(1, email);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                return false;
            }
            prs.close();
            conn.closeConnect();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return true;
    }

    public Premium getPremiumDetails(int premiumID) {
        conn = new ConnectDB();
        Premium premium = new Premium();
        try {
            String query = "SELECT * FROM premium WHERE premiumID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, premiumID);
            ResultSet rs = prs.executeQuery();
            if (rs.next()) {
                premium.setPreId(rs.getInt(1));
                premium.setPreType(rs.getString(2));
                premium.setAmount(rs.getInt(3));
            }
            prs.close();
            conn.closeConnect();

        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return premium;
    }

    public ArrayList getUserList() {
        return userList;
    }

    public ArrayList getCityList() {
        return this.cityList;
    }

    public ArrayList getPremiumPlans() {
        return this.premiumPlans;
    }

    public ArrayList getCountryList() {
        return this.countryList;
    }
}
