
package service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _CheckBalance_QNAME = new QName("http://bankService/", "checkBalance");
    private final static QName _CheckBalanceResponse_QNAME = new QName("http://bankService/", "checkBalanceResponse");
    private final static QName _HelloResponse_QNAME = new QName("http://bankService/", "helloResponse");
    private final static QName _MakeTransaction_QNAME = new QName("http://bankService/", "makeTransaction");
    private final static QName _CheckIdentityNumberResponse_QNAME = new QName("http://bankService/", "checkIdentityNumberResponse");
    private final static QName _MakeTransactionResponse_QNAME = new QName("http://bankService/", "makeTransactionResponse");
    private final static QName _Hello_QNAME = new QName("http://bankService/", "hello");
    private final static QName _CheckIdentityNumber_QNAME = new QName("http://bankService/", "checkIdentityNumber");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Hello }
     * 
     */
    public Hello createHello() {
        return new Hello();
    }

    /**
     * Create an instance of {@link CheckIdentityNumber }
     * 
     */
    public CheckIdentityNumber createCheckIdentityNumber() {
        return new CheckIdentityNumber();
    }

    /**
     * Create an instance of {@link HelloResponse }
     * 
     */
    public HelloResponse createHelloResponse() {
        return new HelloResponse();
    }

    /**
     * Create an instance of {@link MakeTransaction }
     * 
     */
    public MakeTransaction createMakeTransaction() {
        return new MakeTransaction();
    }

    /**
     * Create an instance of {@link MakeTransactionResponse }
     * 
     */
    public MakeTransactionResponse createMakeTransactionResponse() {
        return new MakeTransactionResponse();
    }

    /**
     * Create an instance of {@link CheckIdentityNumberResponse }
     * 
     */
    public CheckIdentityNumberResponse createCheckIdentityNumberResponse() {
        return new CheckIdentityNumberResponse();
    }

    /**
     * Create an instance of {@link CheckBalance }
     * 
     */
    public CheckBalance createCheckBalance() {
        return new CheckBalance();
    }

    /**
     * Create an instance of {@link CheckBalanceResponse }
     * 
     */
    public CheckBalanceResponse createCheckBalanceResponse() {
        return new CheckBalanceResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalance }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "checkBalance")
    public JAXBElement<CheckBalance> createCheckBalance(CheckBalance value) {
        return new JAXBElement<CheckBalance>(_CheckBalance_QNAME, CheckBalance.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckBalanceResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "checkBalanceResponse")
    public JAXBElement<CheckBalanceResponse> createCheckBalanceResponse(CheckBalanceResponse value) {
        return new JAXBElement<CheckBalanceResponse>(_CheckBalanceResponse_QNAME, CheckBalanceResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link HelloResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "helloResponse")
    public JAXBElement<HelloResponse> createHelloResponse(HelloResponse value) {
        return new JAXBElement<HelloResponse>(_HelloResponse_QNAME, HelloResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTransaction }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "makeTransaction")
    public JAXBElement<MakeTransaction> createMakeTransaction(MakeTransaction value) {
        return new JAXBElement<MakeTransaction>(_MakeTransaction_QNAME, MakeTransaction.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIdentityNumberResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "checkIdentityNumberResponse")
    public JAXBElement<CheckIdentityNumberResponse> createCheckIdentityNumberResponse(CheckIdentityNumberResponse value) {
        return new JAXBElement<CheckIdentityNumberResponse>(_CheckIdentityNumberResponse_QNAME, CheckIdentityNumberResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link MakeTransactionResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "makeTransactionResponse")
    public JAXBElement<MakeTransactionResponse> createMakeTransactionResponse(MakeTransactionResponse value) {
        return new JAXBElement<MakeTransactionResponse>(_MakeTransactionResponse_QNAME, MakeTransactionResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Hello }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "hello")
    public JAXBElement<Hello> createHello(Hello value) {
        return new JAXBElement<Hello>(_Hello_QNAME, Hello.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CheckIdentityNumber }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://bankService/", name = "checkIdentityNumber")
    public JAXBElement<CheckIdentityNumber> createCheckIdentityNumber(CheckIdentityNumber value) {
        return new JAXBElement<CheckIdentityNumber>(_CheckIdentityNumber_QNAME, CheckIdentityNumber.class, null, value);
    }

}
