/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Connect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Ha xuan truong
 */
public class Check {

    Connect.Database db = new Database();
    Connection conn = null;
    Statement stmt, stmt1, stmt2, stmt3;
    ResultSet rs, rs1, rs2, rs3;

    public boolean checkUserName(String n) {

        if (n == null || n.length() == 0) {
            JOptionPane.showMessageDialog(null, "You not insert Username... \n Please insert again!", "Username wrong", JOptionPane.OK_OPTION);
            return false;
        } else if (n.length() < 5) {
            JOptionPane.showMessageDialog(null, "Username is at least 5 character! Please insert again...", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        } else {
            String strPattern = "[^a-zA-Z0-9]";
            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(n);
            return !m.find();
        }
    }

    public boolean checkUsernameinSQL(JTextField account) {
        try {
            // TODO add your handling code here:
            boolean check = db.CheckConnect();
            String username = account.getText().trim();
            if (check) {
                conn = db.Connect();
                stmt = conn.createStatement();
                rs = stmt.executeQuery("Select User_Name from dbo.tbStudents where User_Name = '" + username + "'");
                if (rs.next()) {
                    JOptionPane.showMessageDialog(null, "Username already exists ,Please insert new Username ", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot connect to database", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
                Connect.Settingtodatabase std = new Settingtodatabase(null, true);
                std.setVisible(true);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkUsernameadmininSQL(JTextField account) {
        try {
            // TODO add your handling code here:
            boolean check = db.CheckConnect();
            String username = account.getText().trim();
            if (check) {
                conn = db.Connect();
                stmt2 = conn.createStatement();
                rs2 = stmt2.executeQuery("Select User_Name from dbo.Admin where User_Name = '" + username + "'");
                if (rs2.next()) {
                    JOptionPane.showMessageDialog(null, "Username already exists ,Please insert new Username ", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {
                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot connect to database", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
                Connect.Settingtodatabase std = new Settingtodatabase(null, true);
                std.setVisible(true);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean isValidEmailAddress(String email) {
        Pattern p = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");

        Matcher m = p.matcher(email);
        boolean matchFound = m.matches();

        if (matchFound) {
            return true;
        } else {
            JOptionPane.showMessageDialog(null, "Your email do not validation... \n Please insert again!", "Email wrong", JOptionPane.OK_OPTION);
            return false;
        }
    }

    public boolean checkEmailinSQl(JTextField email) {
        try {
            // TODO add your handling code here:
            boolean check = db.CheckConnect();
            String mail = email.getText().trim();
            if (check) {
                conn = db.Connect();
                stmt1 = conn.createStatement();
                rs1 = stmt1.executeQuery("Select Email from dbo.tbStudents where Email = '" + mail + "'");
                if (rs1.next()) {
                    JOptionPane.showMessageDialog(null, "Email already exists ,Please insert new Email ", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {

                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot connect to database", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
                Connect.Settingtodatabase std = new Settingtodatabase(null, true);
                std.setVisible(true);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkEmailadmininSQl(JTextField email) {
        try {
            // TODO add your handling code here:
            boolean check = db.CheckConnect();
            String mail = email.getText().trim();
            if (check) {
                conn = db.Connect();
                stmt3 = conn.createStatement();
                rs3 = stmt3.executeQuery("Select Email from dbo.Admin where Email = '" + mail + "'");
                if (rs3.next()) {
                    JOptionPane.showMessageDialog(null, "Email already exists ,Please insert new Email ", "Error", JOptionPane.ERROR_MESSAGE);
                    return false;
                } else {

                    return true;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Cannot connect to database", "Login Failed", JOptionPane.INFORMATION_MESSAGE);
                Connect.Settingtodatabase std = new Settingtodatabase(null, true);
                std.setVisible(true);
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean checkpassword(JPasswordField pass1, JPasswordField pass2) {
        char[] pw1 = pass1.getPassword();
        char[] pw2 = pass2.getPassword();
        String p1 = new String(pw1);
        String p2 = new String(pw2);
        if (p1 == null || p1.length() == 0) {
            JOptionPane.showMessageDialog(null, "You need insert password ", "Error", JOptionPane.ERROR_MESSAGE);
            pass1.requestFocus();
            return false;
        } else if (p1.length() < 6) {
            JOptionPane.showMessageDialog(null, "Password is at least 6 character! Please insert again...", "Error", JOptionPane.ERROR_MESSAGE);
            pass1.requestFocus();
            return false;
        } else if (p2 == null || p2.length() == 0) {
            JOptionPane.showMessageDialog(null, "You need insert re-password ", "Error", JOptionPane.ERROR_MESSAGE);
            pass2.requestFocus();
            return false;
        } else if (!p1.equalsIgnoreCase(p2)) {
            JOptionPane.showMessageDialog(null, "Password not same Re-type password", "Error", JOptionPane.ERROR_MESSAGE);
            pass2.requestFocus();
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
                JOptionPane.showMessageDialog(null, "Your password do not validation (a-z,A-Z,0-9,@#$%)", "Error", JOptionPane.ERROR_MESSAGE);
                pass1.setText("");
                pass2.setText("");
                pass1.requestFocus();
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

    public boolean checkFullName(String ln) {
        if (ln == null || ln.length() == 0) {
            return true;
        } else {
            String strPattern = "[^\\s,a-zA-Z]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(ln);
            return m.find();
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

    public boolean checkCredidCard(String Creditcard, String typecard) {
        if (Creditcard == null || Creditcard.length() == 0) {
            JOptionPane.showMessageDialog(null, "Your CreditCard empty ", "Payment", JOptionPane.ERROR_MESSAGE);
            return true;
        } else if (typecard == "Paypal") {
            if (Creditcard.length() == 16) {
                String strPattern = "[^0-9]";
                Pattern p;
                Matcher m;
                int flag = Pattern.CASE_INSENSITIVE;
                p = Pattern.compile(strPattern, flag);
                m = p.matcher(Creditcard);
                boolean check = m.find();
                if (check) {
                    JOptionPane.showMessageDialog(null, "Your CreditCard Invalid ", "Payment", JOptionPane.ERROR_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "CreditCard Paypal need 16 number", "Payment", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } else if (typecard == "Master Card") {
            if (Creditcard.length() == 16) {
                String strPattern = "[^0-9]";
                Pattern p;
                Matcher m;
                int flag = Pattern.CASE_INSENSITIVE;
                p = Pattern.compile(strPattern, flag);
                m = p.matcher(Creditcard);
                boolean check = m.find();
                if (check) {
                    JOptionPane.showMessageDialog(null, "Your CreditCard Invalid ", "Payment", JOptionPane.ERROR_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "CreditCard MasterCard need 16 number", "Payment", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } else if (typecard == "Visa") {
            if (Creditcard.length() == 16) {
                String strPattern = "[^0-9]";

                Pattern p;
                Matcher m;
                int flag = Pattern.CASE_INSENSITIVE;
                p = Pattern.compile(strPattern, flag);
                m = p.matcher(Creditcard);
                boolean check = m.find();
                if (check) {
                    JOptionPane.showMessageDialog(null, "Your CreditCard Invalid ", "Payment", JOptionPane.ERROR_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else if (Creditcard.length() == 14) {
                String strPattern = "[^0-9]";
                Pattern p;
                Matcher m;
                int flag = Pattern.CASE_INSENSITIVE;
                p = Pattern.compile(strPattern, flag);
                m = p.matcher(Creditcard);
                boolean check = m.find();
                if (check) {
                    JOptionPane.showMessageDialog(null, "Your CreditCard Invalid ", "Payment", JOptionPane.ERROR_MESSAGE);
                    return true;
                } else {
                    return false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "CreditCard Visa need 14 number or 16 number", "Payment", JOptionPane.ERROR_MESSAGE);
                return true;
            }
        } else {
            return false;
        }
    }

    public boolean checkCVV2(String CVV2) {
        if (CVV2 == null || CVV2.length() == 0 || CVV2.length() > 3) {
            return true;
        } else {
            String strPattern = "[^0-9]";

            Pattern p;
            Matcher m;
            int flag = Pattern.CASE_INSENSITIVE;
            p = Pattern.compile(strPattern, flag);
            m = p.matcher(CVV2);
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
}
