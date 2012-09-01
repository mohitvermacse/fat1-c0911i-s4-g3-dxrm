/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.logging.*;

/**
 *
 * @author Senjuro
 */
public class MatrimonyManager {
    boolean flag;
    
    public boolean sendRequest(int senderID, int receiveID) {
        String userName = getUserName(senderID);
        String content =" want to make friends with you ";
        String status = "Pending";
        try {
            ConnectDB conn = new ConnectDB();
            String query = "INSERT INTO sendRequest(userID, contents, status) VALUES (?, ?, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, senderID);
            prs.setString(2, content);
            prs.setString(3, status);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            
            flag = true;
        } catch (SQLException ex) {
            ex.printStackTrace();
            flag = false;
        }
        int sendID = getSendID(senderID);
        receiveRequest(receiveID, sendID);
        return flag;
    }
    
    public void receiveRequest(int receiverID, int sendID) {       
        try {
            ConnectDB conn = new ConnectDB();
            String query = "INSERT INTO receiveRequest(userID, sendID, status,actions) VALUES (?, ?, ?,?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, receiverID);
            prs.setInt(2, sendID);
            prs.setString(3, "Unread");
            prs.setString(4, "Pending");
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(MatrimonyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public String getUserName(int userID) {
        String userName = "";
        try {
            ConnectDB conn = new ConnectDB();
            String query = "SELECT userName FROM users WHERE userID = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            prs.executeQuery();
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                userName = rs.getString(1);
            }
            prs.close();
            conn.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(MatrimonyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return userName;
    }
    
    public int getSendID(int userID) {
        int sendID = 0;
        try {
            ConnectDB conn = new ConnectDB();
            String query = "SELECT TOP 1 * FROM sendRequest WHERE userID = ? ORDER BY sendID DESC";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setInt(1, userID);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                sendID = rs.getInt(1);
            }
            prs.close();
            conn.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(MatrimonyManager.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sendID;
    }
}
