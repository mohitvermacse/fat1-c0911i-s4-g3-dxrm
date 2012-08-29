/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 *
 * @author SENJURO
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        java.util.Date date = new java.util.Date();
        
        
        String d = dateFormat.format(date).toString();
        int i = 1;
        int month = Integer.parseInt(d.substring(0, 2));
        int day = Integer.parseInt(d.substring(3, 5));
        int year = Integer.parseInt(d.substring(6, 10));
        System.out.println("result: " + day);
    }
}
