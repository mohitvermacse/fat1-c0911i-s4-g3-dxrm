/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.*;
import entity.*;

/**
 *
 * @author nvc
 */
public class UserAccess {

    ConnectDB db = new ConnectDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs, rs1, rs2;
    /*
     * User login
     */

    public boolean loginUser(String _userName, String _password) {
        try {
            String pass = db.md5(_password);
            con = db.getConnect();
            ps = con.prepareCall("{call LoginUser(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Login fail! Please try again." + ex.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Admin login
     */

    public boolean loginAdmin(String _userName, String _password) {
        try {
            String pass = db.md5(_password);
            con = db.getConnect();
            ps = con.prepareCall("{call LoginAdmin(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Login fail! Please try again." + e.getMessage());
        }
        return false;
    }
    /*
     * Select send request by user id
     */

    public Collection getAllCity() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllCity}");
            rs = ps.executeQuery();
            while (rs.next()) {
                City c = new City();
                c.setCityId(rs.getInt(1));
                c.setCountryId(rs.getInt(2));
                c.setCityName(rs.getString(3));
                array.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Not found request!");
        }
        return array;
    }
    /*
     * Select receive request by status
     */

    public Collection getReceiveRequestByStatus(int _receiveId) {
        ArrayList array = new ArrayList();

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _receiveId);
            ps.setString(2, "Approve");
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
                ps = con.prepareCall("{call GetInforUserById(?)}");

                rr.setReceiverId(rs.getInt(1));
                rr.setUserId(rs.getInt(2));
                rr.setSendUserId(rs.getInt(3));
                rr.setAction(rs.getString(4));
                rr.setSendId(rs.getInt(5));
                rr.setContent(rs.getString(6));
                rr.setStatus(rs.getString(7));
                ps.setInt(1, rr.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    rr.setImages(rs1.getString(2));
                    rr.setFullName(rs1.getString(3));

                    array.add(rr);
                }

            }
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }
// Select all request transferring

    public Collection getAllReceveRequestTransfer() {
        ArrayList array = new ArrayList();

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestTransfer(?)}");
            ps.setString(1, "Pending");
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                ps = con.prepareCall("{call GetInforUserById(?)}");

                u.setReceiverId(rs.getInt(1));
                u.setUserId(rs.getInt(2));
                u.setSendUserId(rs.getInt(3));
                u.setAction(rs.getString(4));
                u.setSendId(rs.getInt(5));
                u.setContent(rs.getString(6));
                u.setStatus(rs.getString(7));

                ps.setInt(1, u.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    ps = con.prepareCall("{call GetInforUserById(?)}");
                    u.setImages(rs1.getString(2));
                    u.setFullName(rs1.getString(3));
                    u.setGender(rs1.getString(5));
                    u.setCityName(rs1.getString(8));
                    u.setCountryName(rs1.getString(9));
                    u.setMaritalStatus(rs1.getString(10));
                    u.setHeight(rs1.getInt(11));
                    u.setLanguages(rs1.getString(12));
                    u.setFamilyDetail(rs1.getString(13));
                    u.setQualification(rs1.getString(14));
                    u.setWorkingAt(rs1.getString(15));
                    u.setHobbies(rs1.getString(16));
                    u.setFavorite(rs1.getString(17));
                    u.setMovies(rs1.getString(18));
                    u.setCuisine(rs1.getString(19));
                    u.setBook(rs1.getString(20));

                    ps.setInt(1, u.getUserId());
                    rs2 = ps.executeQuery();
                    while (rs2.next()) {
                        u.setsImages(rs2.getString(2));
                        u.setsFullName(rs2.getString(3));
                        u.setsGender(rs2.getString(5));
                        u.setsCityName(rs2.getString(8));
                        u.setsCountryName(rs2.getString(9));
                        u.setsMaritalStatus(rs2.getString(10));
                        u.setsHeight(rs2.getInt(11));
                        u.setsLanguages(rs2.getString(12));
                        u.setsFamilyDetails(rs2.getString(13));
                        u.setsQualification(rs2.getString(14));
                        u.setsWorkingAt(rs2.getString(15));
                        u.setsHobbies(rs2.getString(16));
                        u.setsFavorite(rs2.getString(17));
                        u.setsMovies(rs2.getString(18));
                        u.setsCuisine(rs2.getString(19));
                        u.setsBook(rs2.getString(20));
                        array.add(u);
                    }
                }

            }
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }
    /*
     * update receive request by receive id
     */

    public boolean updateReceiveRequestById(int _receiveId, String _action, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateReceiveRequestById(?,?,?)}");
            ps.setInt(1, _receiveId);
            ps.setString(2, _action);
            ps.setString(3, _status);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Please try again!");
            return false;

        }
        return false;
    }
    /*
     * update send request by send id
     */

    public boolean updateSendRequestById(int _id, String _dates, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateSendRequestById(?,?,?)}");
            ps.setInt(1, _id);
            ps.setString(2, _dates);
            ps.setString(3, _status);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("Please try again!");
            return false;
        }
        return false;
    }
    /*
     * Select all friend of a user
     */

    public Collection getAllFriend(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            // String str = "SELECT u.fullName,i.images FROM users AS u inner join images AS i ON u.userID=i.userID WHERE u.userID=?";
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _userId);
            ps.setString(2, "Approved");
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
                ps = con.prepareCall("{call GetInforUserSendByUserID(?)}");
                rr.setReceiverId(rs.getInt(1));
                rr.setUserId(rs.getInt(2));
                rr.setSendUserId(rs.getInt(3));
                rr.setAction(rs.getString(4));
                rr.setSendId(rs.getInt(5));
                rr.setContent(rs.getString(6));
                rr.setStatus(rs.getString(7));
                ps.setInt(1, rr.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    rr.setFullName(rs1.getString(1));
                    rr.setImages(rs1.getString(2));
                    array.add(rr);
                }
            }
        } catch (SQLException e) {
            System.out.println("Please try again!");
        }
        return array;
    }
//        Slect All premium

    public Collection getAllPremium() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllPremium}");
            rs = ps.executeQuery();
            while (rs.next()) {
                Premium pr = new Premium();
                pr.setPreId(rs.getInt(1));
                pr.setPreType(rs.getString(2));
                pr.setAmount(rs.getInt(3));
                array.add(pr);
            }
        } catch (SQLException e) {
            System.out.println("Please try again!");
        }
        return array;
    }
//        Select information of a user by user id

    public Collection getInforUserByID(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetInforUserById(?)}");
            ps.setInt(1, _userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserId(rs.getInt(1));
                u.setImages(rs.getString(2));
                u.setFullName(rs.getString(3));
                u.setAddress(rs.getString(4));
                u.setGender(rs.getString(5));
                u.setEmail(rs.getString(6));
                u.setPhoneNumber(rs.getString(7));
                u.setCityName(rs.getString(8));
                u.setCountryName(rs.getString(8));
                u.setMaritalStatus(rs.getString(9));
                u.setHeight(rs.getInt(10));
                u.setLanguages(rs.getString(11));
                u.setCaste(rs.getString(12));
                u.setFamilyDetail(rs.getString(13));
                u.setQualification(rs.getString(14));
                u.setWorkingAt(rs.getString(15));
                u.setHobbies(rs.getString(16));
                u.setFavorite(rs.getString(17));
                u.setMovies(rs.getString(18));
                u.setCuisine(rs.getString(19));
                u.setBook(rs.getString(10));
                array.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Not found infomation of user. Please try again." + e.getMessage());
        }
        return array;
    }
//        Count all user have friend

    public String getAllUserHaveFriend() {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalUserHaveFriend}");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Not user have friend.");
        }
        return total;
    }
//        Count all user of system

    public String getTotalUser() {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalUser}");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("System have not user.");
        }
        return total;
    }
//        Count all new user of a day

    public String getTotalNewUserToday(String _date, String _date1) {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalNewUserToday(?,?)}");
            ps.setString(1, _date);
            ps.setString(2, _date1);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("System have not users of in a day.");
        }
        return total;
    }
//        Count all new user of a month

    public String getTotalNewUserMonth(int _month, int _year) {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalNewUserMonth(?,?)}");
            ps.setInt(1, _month);
            ps.setInt(2, _year);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("System have not users of in a month.");
        }
        return total;
    }
//        Check UserName and email of a user

    public boolean checkUserName(String _userName) {

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call CheckUserName(?)}");
            ps.setString(1, _userName);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("UserName wrong.");
        }
        return true;
    }

    public boolean checkEmail(String _email) {

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call CheckEmail(?)}");
            ps.setString(1, _email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;

            }
        } catch (SQLException ex) {
            System.out.println("Email wrong.");
        }
        return true;
    }
//        Insert new user

    public boolean insertUser(User u) {
        try {
            if (checkUserName(u.getUserName())) {
                if (checkEmail(u.getEmail())) {
                    con = db.getConnect();
                    ps = con.prepareCall("{call InsertUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setString(1, u.getUserName());
                    ps.setString(2, u.getPassword());
                    ps.setString(3, u.getFullName());
                    ps.setString(4, u.getAddress());
                    ps.setString(5, u.getGender());
                    ps.setString(6, u.getBirthDay());
                    ps.setString(7, u.getEmail());
                    ps.setString(8, u.getPhoneNumber());
                    ps.setString(9, u.getMaritalStatus());
                    ps.setInt(10, u.getHeight());
                    ps.setInt(11, u.getCityId());
                    ps.setString(12, u.getLanguages());
                    ps.setString(13, u.getCaste());
                    ps.setString(14, u.getFamilyDetail());
                    ps.setString(15, u.getQualification());
                    ps.setString(16, u.getWorkingAt());
                    ps.setString(17, u.getHobbies());
                    ps.setString(18, u.getFavorite());
                    ps.setString(19, u.getMovies());
                    ps.setString(20, u.getCuisine());
                    ps.setString(21, u.getBook());
                    ps.setString(22, u.getStatus());
                    int check = ps.executeUpdate();
                    if (check > 0) {
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
//        Insert new admin

    public boolean insertAdmin(String _userName, String _password) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call InsertAmin(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, _password);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
//        Check old password

    public boolean checkOldPassword(String _userName, String _oldPassword) {
        try {
            con = db.getConnect();
            String pass = db.md5(_oldPassword);
            ps = con.prepareCall("{call CheckOldPassword(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
//        Changer password of user

    public boolean changePassword(String _userName, String _oldPassword, String _newPassword) {
        try {
            if (checkOldPassword(_userName, _oldPassword)) {
                con = db.getConnect();
                String pass = db.md5(_newPassword);
                ps = con.prepareCall("{call ChangePassword(?,?)}");
                ps.setString(1, _userName);
                ps.setString(2, pass);
                int check = ps.executeUpdate();
                if (check > 0) {
                    return true;
                }
            } else {
                System.out.println("Password old  wrong.");
            }
        } catch (SQLException e) {
            System.out.println("Password old  wrong." + e.getMessage());
            return false;
        }
        return false;
    }
//        Update information of user

    public boolean updateProfile() {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateProfileOfUser()}");

        } catch (SQLException ex) {
            System.out.println("update profile of user fail.");
        }
        return false;

    }
    // Calculation age of user

    public int getAge(java.util.Date birthdate) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(Calendar.YEAR);

        calendar.setTime(birthdate);
        int birthYear = calendar.get(Calendar.YEAR);

        return currentYear - birthYear;
    }

    public Collection getAllUserExpired() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{}");


        } catch (SQLException e) {
        }
        return array;
    }
}
