/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankService;

import bankEntityBean.BankBeanRemote;
import bankEntityBean.BankBeanRemoteHome;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.rmi.PortableRemoteObject;

/**
 *
 * @author SENJURO
 */
@WebService(serviceName = "MatrimonyBankService")
public class MatrimonyBankService {

    /**
     * This is a sample web service operation
     */
    @WebMethod(operationName = "hello")
    public String hello(@WebParam(name = "name") String txt) {
        return "Hello " + txt + " !";
    }
    
    @WebMethod(operationName = "checkBalance")
    public boolean checkBalance(String identityNumber, float balance) {
        try {
            Context c = new InitialContext();
            Object remote = c.lookup("ejb/BankBean");
            BankBeanRemoteHome home = (BankBeanRemoteHome) PortableRemoteObject.narrow(remote, BankBeanRemoteHome.class);
            BankBeanRemote bbRemote = home.create();
            boolean check = bbRemote.checkBalance(identityNumber, balance);
            if(check) {
                return check;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    @WebMethod(operationName = "checkIdentityNumber")
    public boolean checkIdentityNumber(String identityNumber, String password) {
        try {
            Context c = new InitialContext();
            Object remote = c.lookup("ejb/BankBean");
            BankBeanRemoteHome home = (BankBeanRemoteHome) PortableRemoteObject.narrow(remote, BankBeanRemoteHome.class);
            BankBeanRemote bbRemote = home.create();
            boolean check = bbRemote.checkIdentityNumber(identityNumber, password);
            if(check) {
                return check;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
    
    @WebMethod(operationName = "makeTransaction")
    public boolean makeTransaction(String sender, String receiver, float balance) {
        try {
            Context c = new InitialContext();
            Object remote = c.lookup("ejb/BankBean");
            BankBeanRemoteHome home = (BankBeanRemoteHome) PortableRemoteObject.narrow(remote, BankBeanRemoteHome.class);
            BankBeanRemote bbRemote = home.create();
            boolean check = bbRemote.makeTransaction(sender, receiver, balance);
            if(check) {
                return check;
            }
        } catch(Exception ex) {
            ex.printStackTrace();
        }
        return false;
    }
}
