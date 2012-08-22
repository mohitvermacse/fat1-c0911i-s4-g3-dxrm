/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author nvc
 */
public class Validate {

    public boolean checkUserName(String n) {

        if (n == null || n.length() == 0) {
            System.out.println("You not insert Username... \n Please insert again!");
            return false;
        } else if (n.length() < 6) {
            System.out.println("Username is at least 5 character! Please insert again...");
            return false;
        } else {
            String strPattern = "[^a-zA-Z0-9@#$%]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            if (!m.find() == false) {
                return false;
            } else {
                return true;
            }

        }
    }

    public boolean checkpassword(String p1, String p2) {
        if (p1 == null || p1.length() == 0) {
            System.out.println("You need insert password ");
            return false;
        } else if (p1.length() < 6) {
            System.out.println("Password is at least 6 character! Please insert again...");
            return false;
        } else if (p2 == null || p2.length() == 0) {
            System.out.println("You need insert re-password ");
            return false;
        } else if (!p1.equalsIgnoreCase(p2)) {
            System.out.println("Password not same Re-type password");
            return false;
        } else {
            String strPattern = "[^a-zA-Z0-9@#$%]";
            Pattern p;
            Matcher m1, m2;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m1 = p.matcher(p1);
            m2 = p.matcher(p2);
            if (!m1.find() == false && !m2.find() == false) {
                System.out.println("Your password do not validation (a-z,A-Z,0-9,@#$%)");
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean checkPassword(String pass) {
        if (pass == null || pass.length() == 0) {
            System.out.println("You need insert new password. ");
            return false;
        } else if (pass.length() < 6) {
            System.out.println("New password is at least 6 character! Please insert again...");
            return false;
        } else {
            String strPattern = "[^a-zA-Z0-9@#$%]";
            Pattern p;
            Matcher m1;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m1 = p.matcher(pass);

            if (!m1.find() == false) {
                System.out.println("Your password do not validation (a-z,A-Z,0-9,@#$%)");
                return false;
            } else {
                return true;
            }
        }

    }

    public boolean checkFirstName(String fn) {
        if (fn == null || fn.length() == 0) {
            return true;
        } else {
            String strPattern = "[^a-zA-Z]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(fn);
            return m.find();
        }
    }

    public boolean checkLastName(String ln) {
        if (ln == null || ln.length() == 0) {
            return true;
        } else {
            String strPattern = "[^a-zA-Z]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(ln);
            return m.find();
        }
    }

    public boolean checkAddress(String address) {
        if (address == null || address.length() == 0) {
            return false;
        } else {
            return true;
        }
    }

    public boolean checkPhone(String phone) {
        if (phone == null || phone.length() == 0 || phone.length() > 11 || phone.length() < 10) {
            return true;
        } else {
            String strPattern = "[^0-9]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(phone);
            return m.find();
        }
    }

    public boolean isValidEmailAddress(String email) {
        Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");

        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if (matchFound) {
            return true;
        } else {
            System.out.println("Your email do not validation... \n Please insert again!");
            return false;
        }
    }
}
