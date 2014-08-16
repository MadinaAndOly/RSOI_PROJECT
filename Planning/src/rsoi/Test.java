package rsoi;

import org.hibernate.Session;
import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.User;
import rsoi.Util.HibernateUtil;
import rsoi.WebService.WebServiceImp;
import rsoi.dao.Dao;

import java.sql.SQLException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

/**
 * Created by madina on 11.05.14.
 */
public class Test {

    public static boolean testUpdateDoc(){
        try {
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            String qr = "from StateProgDoc ";
            List<StateProgDoc> result  = session.createQuery(qr).list();
            session.getTransaction().commit();
            String doc = result.get(0).getNumberDoc() + "&" + result.get(0).getDateDoc();
            new WebServiceImp().updateDoc(doc,"0");
        }
        catch (Exception e){
            e.printStackTrace();
        }

        return true;
    }


    public static void main(String[] args) throws Exception {
      // testUpdateDoc();
        User user = new User();
        user.setGuid("USER");
        user.setLname("Omarova");
        user.setLogin("OMO");
        user.setPwd("2120");
        user.setName("Madina");
        user.setMname("O");
        //new Dao().registerNewUser(user);
      //  new Dao().authorizeUser("OMO","2120");
        //System.out.println(testInsertUser());
        User us = new Dao().authorizeUser("OMO", "2120");
        System.out.println(us);
        boolean b = new Dao().registerNewUser(null);
      //  System.out.println(b);
        List<StateProgDoc> alldoc = new Dao().getAllStateProgDoc();
        System.out.println(alldoc);
        List<StateProgDoc> subprog = new Dao().getSubProgram(alldoc.get(1));
        System.out.println(subprog);
        List<StateProgDoc> child = new Dao().getChildren(alldoc.get(1));
        System.out.println(child);
//        StateProgDoc parent = new Dao().getParent(child.get(1));
  //      System.out.println(parent);
        List<Org> allorg = new Dao().getAllOrg();
        System.out.println(allorg);
        /*boolean crdoc = new Dao().createProgramm(StateProgDoc doc);
        boolean crorg = new Dao().createOrg(Org org);
        boolean dlorg = new Dao().deleteOrg(Org org);
        boolean crsp = new Dao().createSubProgramm(StateProgDoc doc, StateProgDoc master);
        Org org = new Dao().getOrg(int id);*/


    }

}
