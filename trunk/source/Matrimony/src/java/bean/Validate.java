/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.util.Calendar;
import java.util.GregorianCalendar;
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
        if (fn == null || fn.length() < 1) {
            return false;
        } else {
            String strPattern = "[^a-zA-Z]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(fn);
            if (!m.find() == false) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean checkLastName(String ln) {
        if (ln == null || ln.length() == 0) {
            return false;
        } else {
            String strPattern = "[^a-zA-Z]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(ln);

            if (!m.find() == false) {
                return false;
            } else {
                return true;
            }
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
        if (phone == null || phone.length() == 0 || phone.length() <= 9 || phone.length() > 12) {
            return false;
        } else {
            String strPattern = "[^0-9]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(phone);
            if (!m.find() == false) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean checkHeight(String height) {
        if (height == null || height.length() == 0 || height.length() < 2) {
            return false;
        } else {
            String strPattern = "[^0-9]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(height);
            if (!m.find() == false) {
                return false;
            } else {
                return true;
            }
        }
    }

    public boolean isValidEmailAddress(String email) {
        if (email == null || email.length() < 5) {
            return false;
        } else {
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

    // Calculation age of user
    public boolean checkBirthDay(java.util.Date birthdate) {

        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(Calendar.YEAR);

        calendar.setTime(birthdate);
        int birthYear = calendar.get(Calendar.YEAR);
        if ((currentYear - birthYear) < 18) {
            return false;
        }
        return true;

    }
}
