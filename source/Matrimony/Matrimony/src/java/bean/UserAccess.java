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
    ResultSet rs, rs1;

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

    public Collection getRequestByUserId(int _userId) {
        ArrayList array = new ArrayList();
//        try {
//            con = db.getConnect();
//            ps = con.prepareCall("{(?)}");
//            ps.setInt(1, _userId);
//            rs = ps.executeQuery();
//            while (rs.next()) {
//                Users u = new Users();
//            }
//        } catch (SQLException ex) {
//            System.out.println("Not found request!");
//        }
        return array;
    }

    public Collection getReceiveRequestByStatus(int _receiveId) {
        ArrayList array = new ArrayList();

        try {
            con = db.getConnect();
            // String str = "SELECT u.fullName,i.images FROM users AS u inner join images AS i ON u.userID=i.userID WHERE u.userID=?";
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _receiveId);
            ps.setString(2, "Pending");
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
                ps = con.prepareCall("{call GetInforRequestBySendUserID(?)}");

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
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }

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

    public Collection getAllFriend(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            // String str = "SELECT u.fullName,i.images FROM users AS u inner join images AS i ON u.userID=i.userID WHERE u.userID=?";
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _userId);
            ps.setString(2, "Accept");
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
                ps = con.prepareCall("{call GetInforRequestBySendUserID(?)}");

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

    public Collection getAllStatic() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call }");

        } catch (SQLException e) {
            System.out.println("Please try again!");
        }
        return array;
    }

    public Collection getInforUserByID(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetInforUserById(?)}");
            ps.setInt(1, _userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                Users u = new Users();
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

    public String getTotalNewUserToday(String _date, String _date1) {
        String total=null;
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

    public String getTotalNewUserMonth(int _month, int _year) {
        String total=null;
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
}
