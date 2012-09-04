/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import entity.Country;
import java.util.*;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author UTAN
 */
public class CountryBus {
    ResultSet rs;
    PreparedStatement ps;
    public ArrayList<Country> GetAllCountry(){
        ConnectDB da = new ConnectDB();
        ArrayList<Country> ar = new ArrayList<Country>();
        try {
            ps = da.getConnect().prepareCall("{call GetAllCountry}");       
                      
            rs = ps.executeQuery();
            while (rs.next()){
                ar.add(new Country(rs.getString(1), rs.getString(2)));
            }
            rs.close();
            ps.close();
            da.closeConnect();
        } catch (SQLException ex) {
            Logger.getLogger(CountryBus.class.getName()).log(Level.SEVERE, null, ex);
        }
        return ar;
    }
}
