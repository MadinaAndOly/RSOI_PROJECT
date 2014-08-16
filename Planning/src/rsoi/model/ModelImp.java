package rsoi.model;

import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.User;
import rsoi.dao.Dao;
import rsoi.dao.test;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.util.List;

/**
 * Created by madina on 05.06.14.
 */
@WebService(endpointInterface = "rsoi.model.IModel")
public class ModelImp implements IModel {

    public User authorizeUser(String login, String pwd){
        return new Dao().authorizeUser(login, pwd);
    }

    public boolean registerNewUser(User newUser) throws Exception {
        Dao dao = new Dao();
        return   dao.registerNewUser (newUser);
    }

    public List<StateProgDoc> getAllStateProgDoc(){
        return new Dao().getAllStateProgDoc();
    }

    public List<StateProgDoc> getSubProgram(StateProgDoc doc){
        return new Dao().getSubProgram(doc);
    }

    public List<StateProgDoc> getChildren(StateProgDoc doc){
        return new Dao().getChildren(doc);
    }

    public StateProgDoc getParent(StateProgDoc doc){
        return new Dao().getParent(doc);
    }

    public List<Org> getAllOrg(){
        return new Dao().getAllOrg();
    }


    public boolean createProgramm(StateProgDoc doc){
        return new Dao().createProgramm(doc);
    }

    public  boolean createOrg(Org org){
        return new Dao().createOrg(org);
    }

    public boolean deleteOrg(Org org){
        return new Dao().deleteOrg(org);
    }

    public boolean createSubProgramm(StateProgDoc doc, StateProgDoc master){
        return new Dao().createSubProgramm(doc, master);
    }
    public Org getOrg(int id){
        return new Dao().getOrg(id);
    }

    public User testServise(User user){
     return user;
    }
    public User testDao(User user){
        test t = new test();
        return t.getUser(user);
    }
}
