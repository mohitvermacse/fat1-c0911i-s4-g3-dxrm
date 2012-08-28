/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankEntityBean;

import java.rmi.RemoteException;
import javax.ejb.CreateException;
import javax.ejb.EJBHome;
import javax.ejb.FinderException;

/**
 *
 * @author SENJURO
 */
public interface BankBeanRemoteHome extends EJBHome {
    
    bankEntityBean.BankBeanRemote findByPrimaryKey(java.lang.Long key) throws FinderException, RemoteException;

    BankBeanRemote create() throws CreateException, RemoteException;
}
