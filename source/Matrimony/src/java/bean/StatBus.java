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
import entity.CustomStats;
import java.util.*;

/**
 *
 * @author UTAN
 */
public class StatBus {
    ResultSet rs;
    PreparedStatement ps;
    public int getTodayTotal() {
        ConnectDB da = new ConnectDB();
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date date = new java.util.Date();
        String strDate = dateFormat.format(date);
        System.out.print("date" +strDate);
        int amount = 0;
        try {
            ps = da.getConnect().prepareCall("{call GetSum(?,?)}");          
            ps.setString(1, strDate + " 0:00:00");
            ps.setString(2, strDate + " 23:59:59");
            rs = ps.executeQuery();
            if (rs.next())
            amount = rs.getInt(1);
            rs.close();
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
            System.out.println("Not found customer today. "+ ex.getMessage());
        }
        return amount;
    }
    public int getMonthTotal() {
        ConnectDB da = new ConnectDB();
        DateFormat dateFormat = new SimpleDateFormat("MM");
        java.util.Date date = new java.util.Date();
        int month = Integer.parseInt(dateFormat.format(date));
        System.out.print(month);
        int amount = 0;
        try {
            ps = da.getConnect().prepareCall("{call GetSumMonth(?)}");
            ps.setInt(1, month);            
            rs = ps.executeQuery();
            if (rs.next())
            amount = rs.getInt(1); 
            rs.close();
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
           System.out.println("Not found customer month. "+ ex.getMessage());
        }
        return amount;
    }
    public ArrayList<CustomStats> getCustomStats(String startDate, String endDate){
        ArrayList<CustomStats> arrCS = new ArrayList<CustomStats>();
        ConnectDB da = new ConnectDB();
        try {
            ps = da.getConnect().prepareCall("{call GetCustomPayment(?,?)}");
            ps.setString(1, startDate + " 0:00:00"); 
            ps.setString(2, endDate + " 23:59:59");  
            rs = ps.executeQuery();
            while (rs.next()){
                arrCS.add(new CustomStats(rs.getString(2), rs.getInt(1)));
            }            
            rs.close();
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
           System.out.println("Not found customer customdate. "+ ex.getMessage());
        }
        return arrCS;
    }
}
