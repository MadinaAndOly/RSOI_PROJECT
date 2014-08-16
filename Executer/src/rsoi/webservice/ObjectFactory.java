
package rsoi.webservice;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rsoi.webservice package. 
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

    private final static QName _CreateDocResponse_QNAME = new QName("http://WebService.rsoi/", "createDocResponse");
    private final static QName _UpdateDoc_QNAME = new QName("http://WebService.rsoi/", "updateDoc");
    private final static QName _UpdateDocResponse_QNAME = new QName("http://WebService.rsoi/", "updateDocResponse");
    private final static QName _CreateDoc_QNAME = new QName("http://WebService.rsoi/", "createDoc");
    private final static QName _ScaleDateEnd_QNAME = new QName("http://WebService.rsoi/", "scaleDateEnd");
    private final static QName _ScaleDateEndResponse_QNAME = new QName("http://WebService.rsoi/", "scaleDateEndResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rsoi.webservice
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link ScaleDateEndResponse }
     * 
     */
    public ScaleDateEndResponse createScaleDateEndResponse() {
        return new ScaleDateEndResponse();
    }

    /**
     * Create an instance of {@link ScaleDateEnd }
     * 
     */
    public ScaleDateEnd createScaleDateEnd() {
        return new ScaleDateEnd();
    }

    /**
     * Create an instance of {@link UpdateDocResponse }
     * 
     */
    public UpdateDocResponse createUpdateDocResponse() {
        return new UpdateDocResponse();
    }

    /**
     * Create an instance of {@link UpdateDoc }
     * 
     */
    public UpdateDoc createUpdateDoc() {
        return new UpdateDoc();
    }

    /**
     * Create an instance of {@link CreateDocResponse }
     * 
     */
    public CreateDocResponse createCreateDocResponse() {
        return new CreateDocResponse();
    }

    /**
     * Create an instance of {@link CreateDoc }
     * 
     */
    public CreateDoc createCreateDoc() {
        return new CreateDoc();
    }

    /**
     * Create an instance of {@link Org }
     * 
     */
    public Org createOrg() {
        return new Org();
    }

    /**
     * Create an instance of {@link DocumentClass }
     * 
     */
    public DocumentClass createDocumentClass() {
        return new DocumentClass();
    }

    /**
     * Create an instance of {@link StateProgDoc }
     * 
     */
    public StateProgDoc createStateProgDoc() {
        return new StateProgDoc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "createDocResponse")
    public JAXBElement<CreateDocResponse> createCreateDocResponse(CreateDocResponse value) {
        return new JAXBElement<CreateDocResponse>(_CreateDocResponse_QNAME, CreateDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "updateDoc")
    public JAXBElement<UpdateDoc> createUpdateDoc(UpdateDoc value) {
        return new JAXBElement<UpdateDoc>(_UpdateDoc_QNAME, UpdateDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UpdateDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "updateDocResponse")
    public JAXBElement<UpdateDocResponse> createUpdateDocResponse(UpdateDocResponse value) {
        return new JAXBElement<UpdateDocResponse>(_UpdateDocResponse_QNAME, UpdateDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "createDoc")
    public JAXBElement<CreateDoc> createCreateDoc(CreateDoc value) {
        return new JAXBElement<CreateDoc>(_CreateDoc_QNAME, CreateDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleDateEnd }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "scaleDateEnd")
    public JAXBElement<ScaleDateEnd> createScaleDateEnd(ScaleDateEnd value) {
        return new JAXBElement<ScaleDateEnd>(_ScaleDateEnd_QNAME, ScaleDateEnd.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ScaleDateEndResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://WebService.rsoi/", name = "scaleDateEndResponse")
    public JAXBElement<ScaleDateEndResponse> createScaleDateEndResponse(ScaleDateEndResponse value) {
        return new JAXBElement<ScaleDateEndResponse>(_ScaleDateEndResponse_QNAME, ScaleDateEndResponse.class, null, value);
    }

}
