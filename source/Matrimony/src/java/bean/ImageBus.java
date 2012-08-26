/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.*;
import entity.Image;
/**
 *
 * @author UTAN
 */
public class ImageBus {
    ResultSet rs;
    PreparedStatement ps;
    public void insertImage(int id, String filepath){
        ConnectDB da = new ConnectDB();
        try {
            ps = da.getConnect().prepareCall("{call InsertImage(?,?)}");        
            ps.setInt(1, id);
            ps.setString(2, filepath);
            ps.executeUpdate();            
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(StatBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public ArrayList<Image> getImage (int id){
        ConnectDB da = new ConnectDB();
        ArrayList<Image> ar = new ArrayList<Image>();
        try {
            ps = da.getConnect().prepareCall("{call DisplayImage(?)}");        
            ps.setInt(1, id);            
            rs = ps.executeQuery();
            while (rs.next()){
                ar.add(new Image(rs.getInt(1), rs.getString(2)));
            }
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(StatBean.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
}
