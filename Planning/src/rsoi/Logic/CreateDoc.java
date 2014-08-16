package rsoi.Logic;

import org.hibernate.Session;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.StateProgDocChildren;
import rsoi.Util.HibernateUtil;

import java.sql.SQLException;

/**
 * Created by madina on 12.05.14.
 */
public class CreateDoc extends CreateStateProgDocBase{
    public void addStateProgDocChildren(StateProgDocChildren slave){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(slave);
        session.getTransaction().commit();
    }

    @Override
    public StateProgDoc createDoc(String progDoc, int documentClass) throws SQLException {
        StateProgDoc newDoc = super.createDoc(progDoc, documentClass);
        addStateProgDoc(newDoc);
        StateProgDocChildren slave = new StateProgDocChildren();
        slave.setMaster(getDoc(progDoc));
        slave.setSlave(newDoc);
        addStateProgDocChildren(slave);
        return newDoc;
    }
}
