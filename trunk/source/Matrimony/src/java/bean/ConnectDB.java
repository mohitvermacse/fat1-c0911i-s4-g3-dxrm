/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author nvc
 */
public class ConnectDB {

    Connection con;

    public Connection getConnect() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            con = DriverManager.getConnection("jdbc:sqlserver://localhost:1433;databaseName=Matrimony", "sa", "123456");
        } catch (ClassNotFoundException ex) {
            System.out.println("Unsuccess connect to driver!");
        } catch (SQLException ex) {
            System.out.println("Unsuccess connect to driver!");
        }
        return con;
    }

    public void closeConnect() {
        try {
            con.close();
        } catch (SQLException ex) {
            System.out.println("Unsuccess closed connect to driver!");
        }
    }

    public String md5(String str) {
        String result = null;
        try {
            MessageDigest md5 = MessageDigest.getInstance("MD5");
            md5.update(str.getBytes());
            BigInteger dis = new BigInteger(1, md5.digest());
            result = dis.toString(16);
        } catch (NoSuchAlgorithmException ex) {
            Logger.getLogger(ConnectDB.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }
}
