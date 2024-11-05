
package ec.edu.monster.ws;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the ec.edu.monster.ws package. 
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

    private final static QName _PulgadasACentimetrosResponse_QNAME = new QName("http://ws.monster.edu.ec/", "pulgadasACentimetrosResponse");
    private final static QName _PulgadasACentimetros_QNAME = new QName("http://ws.monster.edu.ec/", "pulgadasACentimetros");
    private final static QName _CentimetrosAPulgadas_QNAME = new QName("http://ws.monster.edu.ec/", "centimetrosAPulgadas");
    private final static QName _CentimetrosAPulgadasResponse_QNAME = new QName("http://ws.monster.edu.ec/", "centimetrosAPulgadasResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: ec.edu.monster.ws
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link PulgadasACentimetrosResponse }
     * 
     */
    public PulgadasACentimetrosResponse createPulgadasACentimetrosResponse() {
        return new PulgadasACentimetrosResponse();
    }

    /**
     * Create an instance of {@link PulgadasACentimetros }
     * 
     */
    public PulgadasACentimetros createPulgadasACentimetros() {
        return new PulgadasACentimetros();
    }

    /**
     * Create an instance of {@link CentimetrosAPulgadas }
     * 
     */
    public CentimetrosAPulgadas createCentimetrosAPulgadas() {
        return new CentimetrosAPulgadas();
    }

    /**
     * Create an instance of {@link CentimetrosAPulgadasResponse }
     * 
     */
    public CentimetrosAPulgadasResponse createCentimetrosAPulgadasResponse() {
        return new CentimetrosAPulgadasResponse();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetrosResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "pulgadasACentimetrosResponse")
    public JAXBElement<PulgadasACentimetrosResponse> createPulgadasACentimetrosResponse(PulgadasACentimetrosResponse value) {
        return new JAXBElement<PulgadasACentimetrosResponse>(_PulgadasACentimetrosResponse_QNAME, PulgadasACentimetrosResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link PulgadasACentimetros }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "pulgadasACentimetros")
    public JAXBElement<PulgadasACentimetros> createPulgadasACentimetros(PulgadasACentimetros value) {
        return new JAXBElement<PulgadasACentimetros>(_PulgadasACentimetros_QNAME, PulgadasACentimetros.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadas }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "centimetrosAPulgadas")
    public JAXBElement<CentimetrosAPulgadas> createCentimetrosAPulgadas(CentimetrosAPulgadas value) {
        return new JAXBElement<CentimetrosAPulgadas>(_CentimetrosAPulgadas_QNAME, CentimetrosAPulgadas.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CentimetrosAPulgadasResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://ws.monster.edu.ec/", name = "centimetrosAPulgadasResponse")
    public JAXBElement<CentimetrosAPulgadasResponse> createCentimetrosAPulgadasResponse(CentimetrosAPulgadasResponse value) {
        return new JAXBElement<CentimetrosAPulgadasResponse>(_CentimetrosAPulgadasResponse_QNAME, CentimetrosAPulgadasResponse.class, null, value);
    }

}
