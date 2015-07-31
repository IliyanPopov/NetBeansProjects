
package gettimeclient;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the gettimeclient package. 
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

    private final static QName _GetTimeResponse_QNAME = new QName("http://logic/", "GetTimeResponse");
    private final static QName _GetTime_QNAME = new QName("http://logic/", "GetTime");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: gettimeclient
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetTimeResponse }
     * 
     */
    public GetTimeResponse createGetTimeResponse() {
        return new GetTimeResponse();
    }

    /**
     * Create an instance of {@link GetTime_Type }
     * 
     */
    public GetTime_Type createGetTime_Type() {
        return new GetTime_Type();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTimeResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "GetTimeResponse")
    public JAXBElement<GetTimeResponse> createGetTimeResponse(GetTimeResponse value) {
        return new JAXBElement<GetTimeResponse>(_GetTimeResponse_QNAME, GetTimeResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetTime_Type }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://logic/", name = "GetTime")
    public JAXBElement<GetTime_Type> createGetTime(GetTime_Type value) {
        return new JAXBElement<GetTime_Type>(_GetTime_QNAME, GetTime_Type.class, null, value);
    }

}
