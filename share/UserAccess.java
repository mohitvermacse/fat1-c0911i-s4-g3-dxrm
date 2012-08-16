/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.*;
import entity.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nvc
 */
public class UserAccess {

    ConnectDB db = new ConnectDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;

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

    public Collection getReceiveRequestByStatus(int _id) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _id);
            ps.setString(2, "Unread");
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
                rr.setReceiverId(rs.getInt(1));
                rr.setUserId(rs.getInt(2));
                rr.setAction(rs.getString(3));
                rr.setSendId(rs.getInt(4));
                rr.setContent(rs.getString(5));
                rr.setStatus(rs.getString(6));
                array.add(rr);
            }
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }

    public boolean updateReceiveRequestById(int _id, String _action, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateReceiveRequestById(?,?,?)}");
            ps.setInt(1, _id);
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

    public boolean updateSendRequestById(int _id, java.sql.Date _dates, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateSendRequestById(?,?,?)}");
            ps.setInt(1, _id);
            ps.setDate(2, _dates);
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

    public Collection getAllFriend(int _userId, String _action) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("");
            ps.setInt(1, _userId);
            ps.setString(2, _action);
            rs = ps.executeQuery();
            while (rs.next()) {
                ReceiveRequest rr = new ReceiveRequest();
            }
        } catch (SQLException ex) {
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
}
