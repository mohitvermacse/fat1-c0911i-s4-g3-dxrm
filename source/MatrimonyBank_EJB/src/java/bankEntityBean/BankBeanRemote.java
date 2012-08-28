/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;

import java.rmi.RemoteException;
import javax.ejb.EJBObject;

/**
 *
 * @author SENJURO
 */
public interface BankBeanRemote extends EJBObject {

    boolean checkIdentityNumber(String identityNumber, String password) throws RemoteException;

    boolean checkBalance(String identityNumber, float balance) throws RemoteException;

    boolean makeTransaction(String sender, String receiver, float balance) throws RemoteException;

    boolean transferMoneyToAccount(String sender, float balance) throws RemoteException;

    boolean receiveMoneyFromAccount(String receiver, float balance) throws RemoteException;

    boolean insertTransactionLogToSender(String sender, String receiver, float balance) throws RemoteException;

    boolean insertTransactionLogToReceiver(String sender, String receiver, float balance) throws RemoteException;

    String getFullName(String identityNumber) throws RemoteException;
    
}
