/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.ejb.CreateException;
import javax.ejb.EntityBean;
import javax.ejb.EntityContext;
import javax.ejb.FinderException;

/**
 *
 * @author SENJURO
 */
public class BankBean implements EntityBean {
    
    private EntityContext context;

    // <editor-fold defaultstate="collapsed" desc="EJB infrastructure methods. Click the + sign on the left to edit the code.">
    // TODO Add code to acquire and use other enterprise resources (DataSource, JMS, enterprise beans, Web services)
    // TODO Add business methods
    // TODO Add create methods
    /**
     * @see javax.ejb.EntityBean#setEntityContext(javax.ejb.EntityContext)
     */
    public void setEntityContext(EntityContext aContext) {
        context = aContext;
    }

    /**
     * @see javax.ejb.EntityBean#ejbActivate()
     */
    public void ejbActivate() {
        
    }

    /**
     * @see javax.ejb.EntityBean#ejbPassivate()
     */
    public void ejbPassivate() {
        
    }

    /**
     * @see javax.ejb.EntityBean#ejbRemove()
     */
    public void ejbRemove() {
        
    }

    /**
     * @see javax.ejb.EntityBean#unsetEntityContext()
     */
    public void unsetEntityContext() {
        context = null;
    }

    /**
     * @see javax.ejb.EntityBean#ejbLoad()
     */
    public void ejbLoad() {
        // TODO add code to retrieve data
    }

    /**
     * @see javax.ejb.EntityBean#ejbStore()
     */
    public void ejbStore() {
        // TODO add code to persist data
    }

    // </editor-fold>
    /**
     * See EJB 2.0 and EJB 2.1 section 12.2.5
     */
    public java.lang.Long ejbFindByPrimaryKey(java.lang.Long aKey) throws FinderException {
        // TODO add code to locate aKey from persistent storage
        // throw javax.ejb.ObjectNotFoundException if aKey is not in
        // persistent storage.
        return null;
    }

    public int ejbCreate() throws CreateException {
        return 1;
    }

    public void ejbPostCreate() throws CreateException {
        
    }

    public boolean checkIdentityNumber(String identityNumber, String password) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "SELECT customerID FROM Customers WHERE identityNumber = ? AND password = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, identityNumber);
            prs.setString(2, password);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                flag = true;
            } else {
                flag = false;
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public boolean checkBalance(String identityNumber, float balance) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "SELECT balance FROM Accounts INNER JOIN Customers ON Accounts.customerID = Customers.customerID WHERE Customers.identityNumber = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, identityNumber);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                if(balance <= rs.getInt(1)) {
                    flag = true;
                } else {
                    flag = false;
                }
            }
            prs.close();
            rs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return flag;
    }

    public boolean makeTransaction(String sender, String receiver, float balance) {
        boolean flag = false;
        try {
            transferMoneyToAccount(sender, balance);
            receiveMoneyFromAccount(receiver, balance);
            insertTransactionLogToSender(sender, receiver, balance);
            insertTransactionLogToReceiver(sender, receiver, balance);
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean transferMoneyToAccount(String sender, float balance) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "UPDATE Accounts SET balance = balance - ? WHERE customerID = (SELECT customerID FROM Customers WHERE identityNumber = ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setFloat(1, balance);
            prs.setString(2, sender);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean receiveMoneyFromAccount(String receiver, float balance) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "UPDATE Accounts SET balance = balance + ? WHERE customerID = (SELECT customerID FROM Customers WHERE identityNumber = ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setFloat(1, balance);
            prs.setString(2, receiver);
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean insertTransactionLogToSender(String sender, String receiver, float balance) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "INSERT INTO Transactions(customerID, income, outgo, description) VALUES ((SELECT customerID FROM Customers WHERE identityNumber = ?), 0, ?, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, sender);
            prs.setFloat(2, balance);
            prs.setString(3, "Transfer to " + getFullName(receiver) + "'s account");
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public boolean insertTransactionLogToReceiver(String sender, String receiver, float balance) {
        ConnectDB conn = new ConnectDB();
        boolean flag = false;
        try {
            String query = "INSERT INTO Transactions(customerID, income, outgo, description) VALUES ((SELECT customerID FROM Customers WHERE identityNumber = ?), ?, 0, ?)";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, receiver);
            prs.setFloat(2, balance);
            prs.setString(3, "Receive from " + getFullName(sender) + "'s account");
            prs.executeUpdate();
            prs.close();
            conn.closeConnect();
            flag = true;
        } catch(Exception ex) {
            ex.printStackTrace();
            flag = false;
        }
        return flag;
    }

    public String getFullName(String identityNumber) {
        ConnectDB conn = new ConnectDB();
        String fullName = "";
        try {
            String query = "SELECT fullName FROM Customers WHERE identityNumber = ?";
            PreparedStatement prs = conn.getConnect().prepareStatement(query);
            prs.setString(1, identityNumber);
            ResultSet rs = prs.executeQuery();
            if(rs.next()) {
                fullName = rs.getString(1);
            }
            prs.close();
            conn.closeConnect();
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return fullName;
    }
    
}
