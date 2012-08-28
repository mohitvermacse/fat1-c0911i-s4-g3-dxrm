/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bankService;

import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

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
}
