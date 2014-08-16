package rsoi.dao;


import org.hibernate.Session;
import rsoi.ConnectionDB;
import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.StateProgDocChildren;
import rsoi.DataObject.User;
import rsoi.Logic.fullDoc;
import rsoi.Util.HibernateUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by madina on 05.06.14.
 */
public class Dao {


    public Session getSession(){
        return HibernateUtil.getSessionFactory().getCurrentSession();
    }

    public User authorizeUser(String login, String pwd) {
        User user = null;
       /* Session session = getSession();
        session.beginTransaction();
        List<User> list_user = session.createQuery("from User usr where usr.login =" + login + "and usr.pwd =" +  pwd  ).list();
        session.getTransaction().commit();
        if (list_user.size() != 0){
            user = list_user.get(0);
        }*/

        try{
            Connection con = ConnectionDB.getInstance().getConnection();
            PreparedStatement stmt = con.prepareStatement("SELECT  `USER_GUID`,`USER_LOGIN`, `USER_PWD`, " +
                    "`USER_NAME`, `USER_LNAME`, `USER_MNAME`, `LAST_UPDATE_DT` FROM `user` WHERE `USER_LOGIN`= ? and `USER_PWD`= ?");
            int k=0;
            stmt.setString(++k, login);
            stmt.setString(++k, pwd);
            ResultSet rs = stmt.executeQuery();
            if(rs.next())
            user = new User(rs.getString(1),rs.getString(2),rs.getString(3),rs.getString(4),rs.getString(5),rs.getString(6));
        }
        catch (Exception exception){
            exception.printStackTrace();
            return null;
        }
        return user;
    }

    public boolean registerNewUser(User newUser) throws Exception {
        /*Session session = getSession();
        session.beginTransaction();
        session.save(newUser);
        session.getTransaction().commit();*/
        try{
             Connection con = ConnectionDB.getInstance().getConnection();
             PreparedStatement stmt = con.prepareStatement("INSERT INTO `user` (`id`, `USER_GUID`, `USER_LOGIN`, `USER_PWD`, " +
                        "`USER_NAME`, `USER_LNAME`, `USER_MNAME`, `LAST_UPDATE_DT`) VALUES (NULL, ?, ?, ?, ?, ?, ?, CURRENT_TIMESTAMP)");
             int k=0;
             stmt.setString(++k, newUser.getGuid());
             stmt.setString(++k, newUser.getLogin());
             stmt.setString(++k, newUser.getPwd());
             stmt.setString(++k, newUser.getName());
             stmt.setString(++k, newUser.getLname());
             stmt.setString(++k, newUser.getMname());
             stmt.execute();

        }
        catch (Exception exception){
        throw new Exception(exception);
        }
        return true;
    }

    public List<StateProgDoc> getAllStateProgDoc(){
        List<StateProgDoc> result = new ArrayList<StateProgDoc>();
        Session session = getSession();
        session.beginTransaction();
        String qr = "from StateProgDoc " ;
        List<StateProgDoc> doc_list  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return doc_list;
    }



    public List<StateProgDoc> getSubProgram(StateProgDoc doc){
        List<StateProgDoc> result = new ArrayList<StateProgDoc>();
        Session session = getSession();
        session.beginTransaction();
        String qr = "from StateProgDocChildren child where child.master=" + doc.getId() ;
        List<StateProgDocChildren> children_list  = session.createQuery(qr).list();
        session.getTransaction().commit();
        for(StateProgDocChildren children: children_list){
            result.add(new fullDoc().getStProgdoc(children.getSlave().getId()));
        }

        return result;

    }

    public List<StateProgDoc> getChildren(StateProgDoc doc){
        List<StateProgDoc> result = new ArrayList<StateProgDoc>();
        Session session = getSession();
        session.beginTransaction();
        String qr = "from StateProgDoc doc where doc.parent=" + doc.getId() ;
        List<StateProgDoc> children_list  = session.createQuery(qr).list();
        session.getTransaction().commit();

        return children_list;
    }

    public StateProgDoc getParent(StateProgDoc doc){
        List<StateProgDoc> result = new ArrayList<StateProgDoc>();
        Session session = getSession();
        session.beginTransaction();
        String qr = "from StateProgDoc doc where doc.id=" + doc.getParent() ;
        List<StateProgDoc> parent  = session.createQuery(qr).list();
        session.getTransaction().commit();

        return parent.get(0);
    }

    public List<Org> getAllOrg(){
        List<Org> result = new ArrayList<Org>();
        Session session = getSession();
        session.beginTransaction();
        String qr = "from Org " ;
        List<Org> org_list  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return org_list;
    }

    public boolean createProgramm(StateProgDoc doc){
        Session session = getSession();
        session.beginTransaction();
        session.save(doc);
        session.getTransaction().commit();
        return true;
    }

    public  boolean createOrg(Org org){
        Session session = getSession();
        session.beginTransaction();
        session.save(org);
        session.getTransaction().commit();
        return true;
    }

    public boolean deleteOrg(Org org){
        Session session = getSession();
        session.beginTransaction();
        session.delete(org);
        session.getTransaction().commit();
        return true;
    }

    public boolean createSubProgramm(StateProgDoc doc, StateProgDoc master){
        createProgramm(doc);
        StateProgDocChildren slave = new StateProgDocChildren();
        slave.setSlave(doc);
        slave.setMaster(master);
        Session session = getSession();
        session.beginTransaction();
        session.save(slave);
        session.getTransaction().commit();
        return true;
    }

    public Org getOrg(int id){
        Session session = getSession();
        session.beginTransaction();
        String qr = "from Org o where o.id="+id ;
        List<Org> org_list  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return org_list.get(0);
    }

}
