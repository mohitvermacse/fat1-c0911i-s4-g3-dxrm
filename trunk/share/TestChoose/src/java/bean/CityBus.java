/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.City;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author UTAN
 */
public class CityBus {
    ResultSet rs;
    PreparedStatement ps;
    public ArrayList<City> GetCities(String cid){
        ConnectDB da = new ConnectDB();
        ArrayList<City> ar = new ArrayList<City>();
        try {
            ps = da.getConnect().prepareCall("{call GetCitiesByCountry(?)}");       
            ps.setString(1, cid);          
            rs = ps.executeQuery();
            while (rs.next()){
                ar.add(new City(rs.getInt(1), rs.getString(2), rs.getString(3)));
            }
            rs.close();
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(CityBus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
}
