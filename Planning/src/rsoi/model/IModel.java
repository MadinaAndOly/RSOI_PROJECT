package rsoi.model;

import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.User;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import java.util.List;

/**
 * Created by madina on 05.06.14.
 */
@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface IModel {
    @WebMethod
    public User authorizeUser(String login, String pwd);
    @WebMethod
    public boolean registerNewUser(User newUser) throws Exception;
    @WebMethod
    public List<StateProgDoc> getAllStateProgDoc();
    @WebMethod
    public List<StateProgDoc> getSubProgram(StateProgDoc doc);
    @WebMethod
    public List<StateProgDoc> getChildren(StateProgDoc doc);
    @WebMethod
    public StateProgDoc getParent(StateProgDoc doc);
    @WebMethod
    public List<Org> getAllOrg();
    @WebMethod
    public boolean createProgramm(StateProgDoc doc);
    @WebMethod
    public  boolean createOrg(Org org);
    @WebMethod
    public boolean deleteOrg(Org org);
    @WebMethod
    public boolean createSubProgramm(StateProgDoc doc, StateProgDoc master);
    @WebMethod
    public Org getOrg(int id);
    @WebMethod
    public User testServise(User user);
    @WebMethod
    public User testDao(User user);


}
