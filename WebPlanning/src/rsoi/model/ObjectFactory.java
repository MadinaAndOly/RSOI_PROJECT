
package rsoi.model;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the rsoi.model package. 
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

    private final static QName _GetSubProgramResponse_QNAME = new QName("http://model.rsoi/", "getSubProgramResponse");
    private final static QName _CreateProgramm_QNAME = new QName("http://model.rsoi/", "createProgramm");
    private final static QName _GetAllOrgResponse_QNAME = new QName("http://model.rsoi/", "getAllOrgResponse");
    private final static QName _GetAllStateProgDoc_QNAME = new QName("http://model.rsoi/", "getAllStateProgDoc");
    private final static QName _AuthorizeUser_QNAME = new QName("http://model.rsoi/", "authorizeUser");
    private final static QName _GetOrg_QNAME = new QName("http://model.rsoi/", "getOrg");
    private final static QName _DeleteOrgResponse_QNAME = new QName("http://model.rsoi/", "deleteOrgResponse");
    private final static QName _CreateOrgResponse_QNAME = new QName("http://model.rsoi/", "createOrgResponse");
    private final static QName _GetAllStateProgDocResponse_QNAME = new QName("http://model.rsoi/", "getAllStateProgDocResponse");
    private final static QName _CreateOrg_QNAME = new QName("http://model.rsoi/", "createOrg");
    private final static QName _CreateSubProgramm_QNAME = new QName("http://model.rsoi/", "createSubProgramm");
    private final static QName _GetParent_QNAME = new QName("http://model.rsoi/", "getParent");
    private final static QName _CreateSubProgrammResponse_QNAME = new QName("http://model.rsoi/", "createSubProgrammResponse");
    private final static QName _GetParentResponse_QNAME = new QName("http://model.rsoi/", "getParentResponse");
    private final static QName _TestServiseResponse_QNAME = new QName("http://model.rsoi/", "testServiseResponse");
    private final static QName _GetChildrenResponse_QNAME = new QName("http://model.rsoi/", "getChildrenResponse");
    private final static QName _CreateProgrammResponse_QNAME = new QName("http://model.rsoi/", "createProgrammResponse");
    private final static QName _GetSubProgram_QNAME = new QName("http://model.rsoi/", "getSubProgram");
    private final static QName _GetOrgResponse_QNAME = new QName("http://model.rsoi/", "getOrgResponse");
    private final static QName _GetChildren_QNAME = new QName("http://model.rsoi/", "getChildren");
    private final static QName _RegisterNewUserResponse_QNAME = new QName("http://model.rsoi/", "registerNewUserResponse");
    private final static QName _AuthorizeUserResponse_QNAME = new QName("http://model.rsoi/", "authorizeUserResponse");
    private final static QName _GetAllOrg_QNAME = new QName("http://model.rsoi/", "getAllOrg");
    private final static QName _RegisterNewUser_QNAME = new QName("http://model.rsoi/", "registerNewUser");
    private final static QName _Exception_QNAME = new QName("http://model.rsoi/", "Exception");
    private final static QName _TestDaoResponse_QNAME = new QName("http://model.rsoi/", "testDaoResponse");
    private final static QName _TestServise_QNAME = new QName("http://model.rsoi/", "testServise");
    private final static QName _TestDao_QNAME = new QName("http://model.rsoi/", "testDao");
    private final static QName _DeleteOrg_QNAME = new QName("http://model.rsoi/", "deleteOrg");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: rsoi.model
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link Exception }
     * 
     */
    public Exception createException() {
        return new Exception();
    }

    /**
     * Create an instance of {@link TestServise }
     * 
     */
    public TestServise createTestServise() {
        return new TestServise();
    }

    /**
     * Create an instance of {@link TestDaoResponse }
     * 
     */
    public TestDaoResponse createTestDaoResponse() {
        return new TestDaoResponse();
    }

    /**
     * Create an instance of {@link TestDao }
     * 
     */
    public TestDao createTestDao() {
        return new TestDao();
    }

    /**
     * Create an instance of {@link DeleteOrg }
     * 
     */
    public DeleteOrg createDeleteOrg() {
        return new DeleteOrg();
    }

    /**
     * Create an instance of {@link RegisterNewUserResponse }
     * 
     */
    public RegisterNewUserResponse createRegisterNewUserResponse() {
        return new RegisterNewUserResponse();
    }

    /**
     * Create an instance of {@link GetChildren }
     * 
     */
    public GetChildren createGetChildren() {
        return new GetChildren();
    }

    /**
     * Create an instance of {@link AuthorizeUserResponse }
     * 
     */
    public AuthorizeUserResponse createAuthorizeUserResponse() {
        return new AuthorizeUserResponse();
    }

    /**
     * Create an instance of {@link GetAllOrg }
     * 
     */
    public GetAllOrg createGetAllOrg() {
        return new GetAllOrg();
    }

    /**
     * Create an instance of {@link RegisterNewUser }
     * 
     */
    public RegisterNewUser createRegisterNewUser() {
        return new RegisterNewUser();
    }

    /**
     * Create an instance of {@link CreateProgrammResponse }
     * 
     */
    public CreateProgrammResponse createCreateProgrammResponse() {
        return new CreateProgrammResponse();
    }

    /**
     * Create an instance of {@link GetSubProgram }
     * 
     */
    public GetSubProgram createGetSubProgram() {
        return new GetSubProgram();
    }

    /**
     * Create an instance of {@link GetOrgResponse }
     * 
     */
    public GetOrgResponse createGetOrgResponse() {
        return new GetOrgResponse();
    }

    /**
     * Create an instance of {@link TestServiseResponse }
     * 
     */
    public TestServiseResponse createTestServiseResponse() {
        return new TestServiseResponse();
    }

    /**
     * Create an instance of {@link GetChildrenResponse }
     * 
     */
    public GetChildrenResponse createGetChildrenResponse() {
        return new GetChildrenResponse();
    }

    /**
     * Create an instance of {@link GetAllStateProgDocResponse }
     * 
     */
    public GetAllStateProgDocResponse createGetAllStateProgDocResponse() {
        return new GetAllStateProgDocResponse();
    }

    /**
     * Create an instance of {@link CreateOrg }
     * 
     */
    public CreateOrg createCreateOrg() {
        return new CreateOrg();
    }

    /**
     * Create an instance of {@link CreateSubProgramm }
     * 
     */
    public CreateSubProgramm createCreateSubProgramm() {
        return new CreateSubProgramm();
    }

    /**
     * Create an instance of {@link GetParent }
     * 
     */
    public GetParent createGetParent() {
        return new GetParent();
    }

    /**
     * Create an instance of {@link CreateSubProgrammResponse }
     * 
     */
    public CreateSubProgrammResponse createCreateSubProgrammResponse() {
        return new CreateSubProgrammResponse();
    }

    /**
     * Create an instance of {@link GetParentResponse }
     * 
     */
    public GetParentResponse createGetParentResponse() {
        return new GetParentResponse();
    }

    /**
     * Create an instance of {@link GetOrg }
     * 
     */
    public GetOrg createGetOrg() {
        return new GetOrg();
    }

    /**
     * Create an instance of {@link DeleteOrgResponse }
     * 
     */
    public DeleteOrgResponse createDeleteOrgResponse() {
        return new DeleteOrgResponse();
    }

    /**
     * Create an instance of {@link CreateOrgResponse }
     * 
     */
    public CreateOrgResponse createCreateOrgResponse() {
        return new CreateOrgResponse();
    }

    /**
     * Create an instance of {@link GetAllOrgResponse }
     * 
     */
    public GetAllOrgResponse createGetAllOrgResponse() {
        return new GetAllOrgResponse();
    }

    /**
     * Create an instance of {@link GetAllStateProgDoc }
     * 
     */
    public GetAllStateProgDoc createGetAllStateProgDoc() {
        return new GetAllStateProgDoc();
    }

    /**
     * Create an instance of {@link AuthorizeUser }
     * 
     */
    public AuthorizeUser createAuthorizeUser() {
        return new AuthorizeUser();
    }

    /**
     * Create an instance of {@link GetSubProgramResponse }
     * 
     */
    public GetSubProgramResponse createGetSubProgramResponse() {
        return new GetSubProgramResponse();
    }

    /**
     * Create an instance of {@link CreateProgramm }
     * 
     */
    public CreateProgramm createCreateProgramm() {
        return new CreateProgramm();
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
     * Create an instance of {@link User }
     * 
     */
    public User createUser() {
        return new User();
    }

    /**
     * Create an instance of {@link StateProgDoc }
     * 
     */
    public StateProgDoc createStateProgDoc() {
        return new StateProgDoc();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubProgramResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getSubProgramResponse")
    public JAXBElement<GetSubProgramResponse> createGetSubProgramResponse(GetSubProgramResponse value) {
        return new JAXBElement<GetSubProgramResponse>(_GetSubProgramResponse_QNAME, GetSubProgramResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgramm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createProgramm")
    public JAXBElement<CreateProgramm> createCreateProgramm(CreateProgramm value) {
        return new JAXBElement<CreateProgramm>(_CreateProgramm_QNAME, CreateProgramm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getAllOrgResponse")
    public JAXBElement<GetAllOrgResponse> createGetAllOrgResponse(GetAllOrgResponse value) {
        return new JAXBElement<GetAllOrgResponse>(_GetAllOrgResponse_QNAME, GetAllOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStateProgDoc }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getAllStateProgDoc")
    public JAXBElement<GetAllStateProgDoc> createGetAllStateProgDoc(GetAllStateProgDoc value) {
        return new JAXBElement<GetAllStateProgDoc>(_GetAllStateProgDoc_QNAME, GetAllStateProgDoc.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "authorizeUser")
    public JAXBElement<AuthorizeUser> createAuthorizeUser(AuthorizeUser value) {
        return new JAXBElement<AuthorizeUser>(_AuthorizeUser_QNAME, AuthorizeUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getOrg")
    public JAXBElement<GetOrg> createGetOrg(GetOrg value) {
        return new JAXBElement<GetOrg>(_GetOrg_QNAME, GetOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "deleteOrgResponse")
    public JAXBElement<DeleteOrgResponse> createDeleteOrgResponse(DeleteOrgResponse value) {
        return new JAXBElement<DeleteOrgResponse>(_DeleteOrgResponse_QNAME, DeleteOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createOrgResponse")
    public JAXBElement<CreateOrgResponse> createCreateOrgResponse(CreateOrgResponse value) {
        return new JAXBElement<CreateOrgResponse>(_CreateOrgResponse_QNAME, CreateOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllStateProgDocResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getAllStateProgDocResponse")
    public JAXBElement<GetAllStateProgDocResponse> createGetAllStateProgDocResponse(GetAllStateProgDocResponse value) {
        return new JAXBElement<GetAllStateProgDocResponse>(_GetAllStateProgDocResponse_QNAME, GetAllStateProgDocResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createOrg")
    public JAXBElement<CreateOrg> createCreateOrg(CreateOrg value) {
        return new JAXBElement<CreateOrg>(_CreateOrg_QNAME, CreateOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubProgramm }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createSubProgramm")
    public JAXBElement<CreateSubProgramm> createCreateSubProgramm(CreateSubProgramm value) {
        return new JAXBElement<CreateSubProgramm>(_CreateSubProgramm_QNAME, CreateSubProgramm.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParent }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getParent")
    public JAXBElement<GetParent> createGetParent(GetParent value) {
        return new JAXBElement<GetParent>(_GetParent_QNAME, GetParent.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateSubProgrammResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createSubProgrammResponse")
    public JAXBElement<CreateSubProgrammResponse> createCreateSubProgrammResponse(CreateSubProgrammResponse value) {
        return new JAXBElement<CreateSubProgrammResponse>(_CreateSubProgrammResponse_QNAME, CreateSubProgrammResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetParentResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getParentResponse")
    public JAXBElement<GetParentResponse> createGetParentResponse(GetParentResponse value) {
        return new JAXBElement<GetParentResponse>(_GetParentResponse_QNAME, GetParentResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestServiseResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "testServiseResponse")
    public JAXBElement<TestServiseResponse> createTestServiseResponse(TestServiseResponse value) {
        return new JAXBElement<TestServiseResponse>(_TestServiseResponse_QNAME, TestServiseResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildrenResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getChildrenResponse")
    public JAXBElement<GetChildrenResponse> createGetChildrenResponse(GetChildrenResponse value) {
        return new JAXBElement<GetChildrenResponse>(_GetChildrenResponse_QNAME, GetChildrenResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link CreateProgrammResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "createProgrammResponse")
    public JAXBElement<CreateProgrammResponse> createCreateProgrammResponse(CreateProgrammResponse value) {
        return new JAXBElement<CreateProgrammResponse>(_CreateProgrammResponse_QNAME, CreateProgrammResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetSubProgram }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getSubProgram")
    public JAXBElement<GetSubProgram> createGetSubProgram(GetSubProgram value) {
        return new JAXBElement<GetSubProgram>(_GetSubProgram_QNAME, GetSubProgram.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetOrgResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getOrgResponse")
    public JAXBElement<GetOrgResponse> createGetOrgResponse(GetOrgResponse value) {
        return new JAXBElement<GetOrgResponse>(_GetOrgResponse_QNAME, GetOrgResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetChildren }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getChildren")
    public JAXBElement<GetChildren> createGetChildren(GetChildren value) {
        return new JAXBElement<GetChildren>(_GetChildren_QNAME, GetChildren.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "registerNewUserResponse")
    public JAXBElement<RegisterNewUserResponse> createRegisterNewUserResponse(RegisterNewUserResponse value) {
        return new JAXBElement<RegisterNewUserResponse>(_RegisterNewUserResponse_QNAME, RegisterNewUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AuthorizeUserResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "authorizeUserResponse")
    public JAXBElement<AuthorizeUserResponse> createAuthorizeUserResponse(AuthorizeUserResponse value) {
        return new JAXBElement<AuthorizeUserResponse>(_AuthorizeUserResponse_QNAME, AuthorizeUserResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link GetAllOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "getAllOrg")
    public JAXBElement<GetAllOrg> createGetAllOrg(GetAllOrg value) {
        return new JAXBElement<GetAllOrg>(_GetAllOrg_QNAME, GetAllOrg.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link RegisterNewUser }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "registerNewUser")
    public JAXBElement<RegisterNewUser> createRegisterNewUser(RegisterNewUser value) {
        return new JAXBElement<RegisterNewUser>(_RegisterNewUser_QNAME, RegisterNewUser.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link Exception }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "Exception")
    public JAXBElement<Exception> createException(Exception value) {
        return new JAXBElement<Exception>(_Exception_QNAME, Exception.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestDaoResponse }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "testDaoResponse")
    public JAXBElement<TestDaoResponse> createTestDaoResponse(TestDaoResponse value) {
        return new JAXBElement<TestDaoResponse>(_TestDaoResponse_QNAME, TestDaoResponse.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestServise }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "testServise")
    public JAXBElement<TestServise> createTestServise(TestServise value) {
        return new JAXBElement<TestServise>(_TestServise_QNAME, TestServise.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link TestDao }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "testDao")
    public JAXBElement<TestDao> createTestDao(TestDao value) {
        return new JAXBElement<TestDao>(_TestDao_QNAME, TestDao.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DeleteOrg }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://model.rsoi/", name = "deleteOrg")
    public JAXBElement<DeleteOrg> createDeleteOrg(DeleteOrg value) {
        return new JAXBElement<DeleteOrg>(_DeleteOrg_QNAME, DeleteOrg.class, null, value);
    }

}
