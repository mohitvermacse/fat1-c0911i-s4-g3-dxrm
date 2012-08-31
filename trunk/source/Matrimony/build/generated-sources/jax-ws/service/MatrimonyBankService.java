
package service;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.5-b02 
 * Generated source version: 2.1
 * 
 */
@WebService(name = "MatrimonyBankService", targetNamespace = "http://bankService/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface MatrimonyBankService {


    /**
     * 
     * @param name
     * @return
     *     returns java.lang.String
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "hello", targetNamespace = "http://bankService/", className = "service.Hello")
    @ResponseWrapper(localName = "helloResponse", targetNamespace = "http://bankService/", className = "service.HelloResponse")
    public String hello(
        @WebParam(name = "name", targetNamespace = "")
        String name);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkBalance", targetNamespace = "http://bankService/", className = "service.CheckBalance")
    @ResponseWrapper(localName = "checkBalanceResponse", targetNamespace = "http://bankService/", className = "service.CheckBalanceResponse")
    public boolean checkBalance(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        float arg1);

    /**
     * 
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "checkIdentityNumber", targetNamespace = "http://bankService/", className = "service.CheckIdentityNumber")
    @ResponseWrapper(localName = "checkIdentityNumberResponse", targetNamespace = "http://bankService/", className = "service.CheckIdentityNumberResponse")
    public boolean checkIdentityNumber(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1);

    /**
     * 
     * @param arg2
     * @param arg1
     * @param arg0
     * @return
     *     returns boolean
     */
    @WebMethod
    @WebResult(targetNamespace = "")
    @RequestWrapper(localName = "makeTransaction", targetNamespace = "http://bankService/", className = "service.MakeTransaction")
    @ResponseWrapper(localName = "makeTransactionResponse", targetNamespace = "http://bankService/", className = "service.MakeTransactionResponse")
    public boolean makeTransaction(
        @WebParam(name = "arg0", targetNamespace = "")
        String arg0,
        @WebParam(name = "arg1", targetNamespace = "")
        String arg1,
        @WebParam(name = "arg2", targetNamespace = "")
        float arg2);

}
