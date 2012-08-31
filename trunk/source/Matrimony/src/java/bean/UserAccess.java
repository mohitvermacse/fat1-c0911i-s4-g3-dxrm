/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;

import java.sql.*;
import java.util.*;
import entity.*;
import java.text.DateFormat;
import java.text.*;
import javax.mail.*;
import javax.mail.internet.*;

/**
 *
 * @author nvc
 */
public class UserAccess {

    ConnectDB db = new ConnectDB();
    Connection con;
    PreparedStatement ps;
    ResultSet rs, rs1, rs2;
    /*
     * User login
     */

    public boolean loginUser(String _userName, String _password) {
        try {
            String pass = db.md5(_password);
            con = db.getConnect();
            ps = con.prepareCall("{call LoginUser(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Login fail! Please try again." + ex.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Admin login
     */

    public boolean loginAdmin(String _userName, String _password) {
        try {
            String pass = db.md5(_password);
            con = db.getConnect();
            ps = con.prepareCall("{call LoginAdmin(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            if (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Login fail! Please try again." + e.getMessage());
        }
        return false;
    }
    /*
     * Select all city
     */

    public Collection getAllCity() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllCity}");
            rs = ps.executeQuery();
            while (rs.next()) {
                City c = new City();
                c.setCityId(rs.getInt(1));
                c.setCountryId(rs.getInt(2));
                c.setCityName(rs.getString(3));
                array.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Not found request!");
        }
        return array;
    }
    /*
     * Select all contry
     */

    public Collection getAllCountry() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllCountry}");
            rs = ps.executeQuery();
            while (rs.next()) {
                Country c = new Country();
                c.setCountryId(rs.getInt(1));
                c.setCountryName(rs.getString(2));
                array.add(c);
            }
        } catch (SQLException ex) {
            System.out.println("Not found request!");
        }
        return array;
    }
    /*
     * Select receive request by status
     */

    public Collection getAllReceiveRequestByStatus(int _receiveId) {
        ArrayList array = new ArrayList();

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _receiveId);
            ps.setString(2, "Transfer");
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                ps = con.prepareCall("{call GetInforUserById(?)}");

                u.setReceiverId(rs.getInt(1));
                u.setUserId(rs.getInt(2));
                u.setSendUserId(rs.getInt(3));
                u.setAction(rs.getString(4));
                u.setSendId(rs.getInt(5));
                u.setContent(rs.getString(6));
                u.setStatus(rs.getString(7));

                ps.setInt(1, u.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    u.setImages(rs1.getString(2));
                    u.setFullName(rs1.getString(3));
                    u.setGender(rs1.getString(5));
                    u.setCityName(rs1.getString(8));
                    u.setCountryName(rs1.getString(9));
                    u.setMaritalStatus(rs1.getString(10));
                    u.setHeight(rs1.getInt(11));
                    u.setLanguages(rs1.getString(12));
                    u.setFamilyDetail(rs1.getString(13));
                    u.setQualification(rs1.getString(14));
                    u.setWorkingAt(rs1.getString(15));
                    u.setHobbies(rs1.getString(16));
                    u.setFavorite(rs1.getString(17));
                    u.setMovies(rs1.getString(18));
                    u.setCuisine(rs1.getString(19));
                    u.setBook(rs1.getString(20));

                    array.add(u);
                }
            }
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }
    /*
     * Get all request pending
     */

    public Collection getAllReceveRequestTransfer(String _action) {
        ArrayList array = new ArrayList();

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestTransfer(?)}");
            ps.setString(1, _action);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                ps = con.prepareCall("{call GetInforUserById(?)}");

                u.setReceiverId(rs.getInt(1));
                u.setUserId(rs.getInt(2));
                u.setSendUserId(rs.getInt(3));
                u.setAction(rs.getString(4));
                u.setSendId(rs.getInt(5));
                u.setContent(rs.getString(6));
                u.setStatus(rs.getString(7));

                ps.setInt(1, u.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    ps = con.prepareCall("{call GetInforUserById(?)}");
                    u.setImages(rs1.getString(2));
                    u.setFullName(rs1.getString(3));
                    u.setGender(rs1.getString(5));
                    u.setCityName(rs1.getString(8));
                    u.setCountryName(rs1.getString(9));
                    u.setMaritalStatus(rs1.getString(10));
                    u.setHeight(rs1.getInt(11));
                    u.setLanguages(rs1.getString(12));
                    u.setFamilyDetail(rs1.getString(13));
                    u.setQualification(rs1.getString(14));
                    u.setWorkingAt(rs1.getString(15));
                    u.setHobbies(rs1.getString(16));
                    u.setFavorite(rs1.getString(17));
                    u.setMovies(rs1.getString(18));
                    u.setCuisine(rs1.getString(19));
                    u.setBook(rs1.getString(20));

                    ps.setInt(1, u.getUserId());
                    rs2 = ps.executeQuery();
                    while (rs2.next()) {
                        u.setsImages(rs2.getString(2));
                        u.setsFullName(rs2.getString(3));
                        u.setsGender(rs2.getString(5));
                        u.setsCityName(rs2.getString(8));
                        u.setsCountryName(rs2.getString(9));
                        u.setsMaritalStatus(rs2.getString(10));
                        u.setsHeight(rs2.getInt(11));
                        u.setsLanguages(rs2.getString(12));
                        u.setsFamilyDetails(rs2.getString(13));
                        u.setsQualification(rs2.getString(14));
                        u.setsWorkingAt(rs2.getString(15));
                        u.setsHobbies(rs2.getString(16));
                        u.setsFavorite(rs2.getString(17));
                        u.setsMovies(rs2.getString(18));
                        u.setsCuisine(rs2.getString(19));
                        u.setsBook(rs2.getString(20));
                        array.add(u);
                    }
                }

            }
        } catch (SQLException ex) {
            System.out.println("Not found Receiver request!");
        }
        return array;
    }
    /*
     * update receive request by receive id
     */

    public boolean updateReceiveRequestById(int _receiveId, String _action, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateReceiveRequestById(?,?,?)}");
            ps.setInt(1, _receiveId);
            ps.setString(2, _action);
            ps.setString(3, _status);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("Please try again!");
            return false;

        }
        return false;
    }
    /*
     * update send request by send id
     */

    public boolean updateSendRequestById(int _id, String _dates, String _status) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateSendRequestById(?,?,?)}");
            ps.setInt(1, _id);
            ps.setString(2, _dates);
            ps.setString(3, _status);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("Please try again!");
            return false;
        }
        return false;
    }
    /*
     * Select all friend of a user
     */

    public Collection getAllFriend(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllReceveRequestByStatus(?,?)}");
            ps.setInt(1, _userId);
            ps.setString(2, "Approved");
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                ps = con.prepareCall("{call GetInforUserById(?)}");

                u.setReceiverId(rs.getInt(1));
                u.setSendUserId(rs.getInt(3));
                u.setUserId(rs.getInt(2));
                u.setSendId(rs.getInt(5));
                u.setContent(rs.getString(6));

                ps.setInt(1, u.getSendUserId());
                rs1 = ps.executeQuery();
                while (rs1.next()) {
                    u.setImages(rs1.getString(2));
                    u.setFullName(rs1.getString(3));
                    u.setGender(rs1.getString(5));
                    u.setCityName(rs1.getString(8));
                    u.setCountryName(rs1.getString(9));
                    u.setMaritalStatus(rs1.getString(10));
                    u.setHeight(rs1.getInt(11));
                    u.setLanguages(rs1.getString(12));
                    u.setFamilyDetail(rs1.getString(13));
                    u.setQualification(rs1.getString(14));
                    u.setWorkingAt(rs1.getString(15));
                    u.setHobbies(rs1.getString(16));
                    u.setFavorite(rs1.getString(17));
                    u.setMovies(rs1.getString(18));
                    u.setCuisine(rs1.getString(19));
                    u.setBook(rs1.getString(20));
                    array.add(u);
                }
            }
        } catch (SQLException e) {
            System.out.println("Please try again!");
        }
        return array;
    }
    /*
     * Slect All premium
     */

    public Collection getAllPremium() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllPremium}");
            rs = ps.executeQuery();
            while (rs.next()) {
                Premium pr = new Premium();
                pr.setPreId(rs.getInt(1));
                pr.setPreType(rs.getString(2));
                pr.setAmount(rs.getInt(3));
                array.add(pr);
            }
        } catch (SQLException e) {
            System.out.println("Please try again!");
        }
        return array;
    }
    /*
     * Select information of a user by user id
     */

    public Collection getInforUserByID(int _userId) {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetInforUserById(?)}");
            ps.setInt(1, _userId);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserId(rs.getInt(1));
                u.setImages(rs.getString(2));
                u.setFullName(rs.getString(3));
                u.setAddress(rs.getString(4));
                u.setGender(rs.getString(5));
                u.setEmail(rs.getString(6));
                u.setPhoneNumber(rs.getString(7));
                u.setCityName(rs.getString(8));
                u.setCountryName(rs.getString(8));
                u.setMaritalStatus(rs.getString(9));
                u.setHeight(rs.getInt(10));
                u.setLanguages(rs.getString(11));
                u.setCaste(rs.getString(12));
                u.setFamilyDetail(rs.getString(13));
                u.setQualification(rs.getString(14));
                u.setWorkingAt(rs.getString(15));
                u.setHobbies(rs.getString(16));
                u.setFavorite(rs.getString(17));
                u.setMovies(rs.getString(18));
                u.setCuisine(rs.getString(19));
                u.setBook(rs.getString(10));
                array.add(u);
            }
        } catch (SQLException e) {
            System.out.println("Not found infomation of user. Please try again." + e.getMessage());
        }
        return array;
    }
    /*
     * Count all user have friend
     */

    public String getAllUserHaveFriend() {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalUserHaveFriend}");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("Not user have friend.");
        }
        return total;
    }
    /*
     * Count all user of system
     */

    public String getTotalUser() {
        String total = null;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalUser}");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
        } catch (SQLException e) {
            System.out.println("System have not user.");
        }
        return total;
    }

    /*
     * Check UserName and email of a user
     */
    public boolean checkUserName(String _userName) {

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call CheckUserName(?)}");
            ps.setString(1, _userName);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;
            }
        } catch (SQLException ex) {
            System.out.println("UserName wrong.");
        }
        return true;
    }
    /*
     * check email
     *
     */

    public boolean checkEmail(String _email) {

        try {
            con = db.getConnect();
            ps = con.prepareCall("{call CheckEmail(?)}");
            ps.setString(1, _email);
            rs = ps.executeQuery();
            if (rs.next()) {
                return false;
            } else {
                return true;

            }
        } catch (SQLException ex) {
            System.out.println("Email wrong.");
        }
        return true;
    }
    /*
     * Insert new user
     */

    public boolean insertUser(User u) {
        try {
            if (checkUserName(u.getUserName())) {
                if (checkEmail(u.getEmail())) {
                    con = db.getConnect();
                    ps = con.prepareCall("{call InsertUser(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)}");
                    ps.setString(1, u.getUserName());
                    ps.setString(2, u.getPassword());
                    ps.setString(3, u.getFullName());
                    ps.setString(4, u.getAddress());
                    ps.setString(5, u.getGender());
                    ps.setString(6, u.getBirthDay());
                    ps.setString(7, u.getEmail());
                    ps.setString(8, u.getPhoneNumber());
                    ps.setString(9, u.getMaritalStatus());
                    ps.setInt(10, u.getHeight());
                    ps.setInt(11, u.getCityId());
                    ps.setString(12, u.getLanguages());
                    ps.setString(13, u.getCaste());
                    ps.setString(14, u.getFamilyDetail());
                    ps.setString(15, u.getQualification());
                    ps.setString(16, u.getWorkingAt());
                    ps.setString(17, u.getHobbies());
                    ps.setString(18, u.getFavorite());
                    ps.setString(19, u.getMovies());
                    ps.setString(20, u.getCuisine());
                    ps.setString(21, u.getBook());
                    ps.setString(22, u.getStatus());
                    int check = ps.executeUpdate();
                    if (check > 0) {
                        return true;
                    }
                }
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Insert new admin
     */

    public boolean insertAdmin(String _userName, String _password) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call InsertAmin(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, _password);
            int check = ps.executeUpdate();
            if (check > 0) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Check old password
     */

    public boolean checkOldPassword(String _userName, String _oldPassword) {
        try {
            con = db.getConnect();
            String pass = db.md5(_oldPassword);
            ps = con.prepareCall("{call CheckOldPassword(?,?)}");
            ps.setString(1, _userName);
            ps.setString(2, pass);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("Please try again." + e.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Changer password of user
     */

    public boolean changePassword(String _userName, String _oldPassword, String _newPassword) {
        try {
            if (checkOldPassword(_userName, _oldPassword)) {
                con = db.getConnect();
                String pass = db.md5(_newPassword);
                ps = con.prepareCall("{call ChangePassword(?,?)}");
                ps.setString(1, _userName);
                ps.setString(2, pass);
                int check = ps.executeUpdate();
                if (check > 0) {
                    return true;
                }
            } else {
                System.out.println("Password old  wrong.");
            }
        } catch (SQLException e) {
            System.out.println("Password old  wrong." + e.getMessage());
            return false;
        }
        return false;
    }
    /*
     * Update information of user
     */

    public boolean updateProfile() {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call UpdateProfileOfUser()}");

        } catch (SQLException ex) {
            System.out.println("update profile of user fail.");
        }
        return false;

    }
    // Calculation age of user

    public int getAge(java.util.Date birthdate) {
        Calendar calendar = GregorianCalendar.getInstance();
        calendar.setTime(new java.util.Date());
        int currentYear = calendar.get(Calendar.YEAR);

        calendar.setTime(birthdate);
        int birthYear = calendar.get(Calendar.YEAR);

        return currentYear - birthYear;
    }

    /*
     * Count all new user of a day
     */
    public String getTotalNewUserToday(String _date) {
        String total = null;

        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
        System.out.print("date 1: " + _date);
        String strDate = dateFormat.format(java.util.Date.parse(_date));
        System.out.print("date 2: " + strDate);
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalNewUserToday(?,?)}");
            ps.setString(1, strDate + " 0:00:00");
            ps.setString(2, strDate + " 23:59:59");
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getString(1);
            }
            rs.close();
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("System have not users of in a day.");
        }
        return total;
    }
    /*
     * Get infor new users of today
     *
     */

    public Collection getInforNewUserToday(String _date) {
        ArrayList array = new ArrayList();

        try {
            DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy");
            String strDate = dateFormat.format(java.util.Date.parse(_date));

            con = db.getConnect();
            ps = con.prepareCall("{call InforNewUserToday(?,?)}");
            ps.setString(1, strDate + " 0:00:00");
            ps.setString(2, strDate + " 23:59:59");
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserId(rs.getInt(1));
                u.setImages(rs.getString(2));
                u.setFullName(rs.getString(3));
                u.setEmail(rs.getString(4));
                array.add(u);
            }
            rs.close();
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("System have not users of in a day.");
        }
        return array;
    }

    /*
     * Count all new user of a month
     */
    public String getTotalNewUserAMonth(String _date) {
        String total = null;

        DateFormat dateFormat = new SimpleDateFormat("MM");
        DateFormat yearformat = new SimpleDateFormat("yyyy");

        String strMonth = dateFormat.format(java.util.Date.parse(_date));
        String strYear = yearformat.format(java.util.Date.parse(_date));
        int month = Integer.parseInt(strMonth);
        int year = Integer.parseInt(strYear);
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call TotalNewUserMonth(?,?)}");
            ps.setInt(1, month);
            ps.setInt(2, year);
            rs = ps.executeQuery();
            if (rs.next()) {
                total = rs.getString(1);
            }
            rs.close();
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("System have not users of in a day.");
        }
        return total;
    }
    /*
     * Get information of new user in a month
     *
     */

    public Collection getInforNewUserAMonth(String _date) {
        ArrayList array = new ArrayList();
        DateFormat dateFormat = new SimpleDateFormat("MM");
        DateFormat yearformat = new SimpleDateFormat("yyyy");

        String strMonth = dateFormat.format(java.util.Date.parse(_date));
        String strYear = yearformat.format(java.util.Date.parse(_date));
        int month = Integer.parseInt(strMonth);
        int year = Integer.parseInt(strYear);
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call InforNewUserAMonth(?,?)}");
            ps.setInt(1, month);
            ps.setInt(2, year);
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setUserId(rs.getInt(1));
                u.setImages(rs.getString(2));
                u.setFullName(rs.getString(3));
                u.setEmail(rs.getString(4));
                array.add(u);
            }
            rs.close();
            ps.close();
            db.closeConnect();
        } catch (SQLException ex) {
            System.out.println("System have not users of in a day.");
        }
        return array;
    }
    /*
     * Get all user expired
     *
     */

    public Collection getAllUserExpired() {
        ArrayList array = new ArrayList();
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetAllUserExpired}");
            rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();

                u.setUserId(rs.getInt(1));
                u.setImages(rs.getString(2));
                u.setFullName(rs.getString(3));
                u.setAddress(rs.getString(4));
                u.setEmail(rs.getString(5));
                u.setPhoneNumber(rs.getString(6));
                u.setRegisterDate(rs.getDate(7));
                u.setExpireDate(rs.getDate(8));
                u.setUserName(rs.getString(9));

                array.add(u);
            }
        } catch (SQLException e) {
            System.out.println("System have not users expired.");
        }
        return array;
    }
    /*
     * Check user expired
     *
     */

    public boolean checkUserExpired(String _userName) {
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call CheckUserExpired(?) }");
            ps.setString(1, _userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                return true;
            }
        } catch (SQLException e) {
            System.out.println("This user is expired.");
        }
        return false;
    }
    /*
     * Send messages fo user infor expired
     *
     */

    public boolean send(String mailTo, String subject, String messageText) {
        try {
            final String username = "vchienbn@gmail.com";
            final String password = "chienhoa2010";

            Properties props = new Properties();
            props.put("mail.smtp.auth", "true");
            props.put("mail.smtp.starttls.enable", "true");
            props.put("mail.smtp.host", "smtp.gmail.com");
            props.put("mail.smtp.port", "587");

            Session session = Session.getInstance(props,
                    new javax.mail.Authenticator() {

                        protected PasswordAuthentication getPasswordAuthentication() {
                            return new PasswordAuthentication(username, password);
                        }
                    });
            Message message = new MimeMessage(session);
            message.setFrom(new InternetAddress("phuongchienl@gmail.com"));
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(mailTo));
            message.setSubject(subject);
            message.setText(messageText);

            Transport.send(message);
            System.out.println("Done");
            return true;
        } catch (MessagingException e) {
            e.printStackTrace();
        }
        return false;
    }

    public boolean sendMailFogetPassword(String to, String subject, String conten) {
        try {
            String hot = "192.168.10.205";
            String from = "vchienbn@gmail.com";
            Properties pro = System.getProperties();
            pro.setProperty("mail.smtp.host", hot);
            Session session = Session.getDefaultInstance(pro);
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            msg.addRecipient(Message.RecipientType.TO, new InternetAddress(to));
            msg.setSubject(subject);

            msg.setText(conten);
            Transport.send(msg);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    /* Get Id of user 
     * 
     */

    public int getIdUserByUserName(String _userName) {
        int id = 0;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call GetUserIdByUserName(?)}");
            ps.setString(1, _userName);
            rs = ps.executeQuery();
            while (rs.next()) {
                id = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Not found user");
        }
        return id;
    }
    /*
     * Sum all request receive
     */

    public int sumRequestReceive(String _action) {
        int total = 0;
        try {
            con = db.getConnect();
            ps = con.prepareCall("{call SumRequestReceive(?)}");
            ps.setString(1, _action);
            rs = ps.executeQuery();
            while (rs.next()) {
                total = rs.getInt(1);
            }
        } catch (SQLException e) {
            System.out.println("Not request receive.");
        }
        return total;
    }
}
