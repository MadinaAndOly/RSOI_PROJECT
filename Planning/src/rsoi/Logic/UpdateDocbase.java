package rsoi.Logic;

import org.hibernate.Session;
import rsoi.ConnectionAMQ;
import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.Util.HibernateUtil;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by madina on 12.05.14.
 */
public class UpdateDocbase extends fullDoc{
    protected StateProgDoc document;

    public void updateStateProgDoc(String doc, String state) throws SQLException {
        StateProgDoc fullDoc = getDoc(doc);
        if (fullDoc.getState() != Integer.valueOf(state)){
            fullDoc.setState(Integer.valueOf(state));
            document = fullDoc;
            Session session = HibernateUtil.getSessionFactory().getCurrentSession();
            session.beginTransaction();
            session.update(fullDoc);
            session.getTransaction().commit();
            Org executer = getOrgToId(document.getExecutor().getId());
            //?????????? JMS ?????????doc
            ConnectionAMQ.messageProduser(new String(executer.getCode() + executer.getINN()), document);
        }

    }

    public void editDoc(String doc, Date dateEnd) throws SQLException {
        StateProgDoc fullDoc = getDoc(doc);
        fullDoc.setDateEnd(dateEnd);
        document = fullDoc;
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.update(fullDoc);
        session.getTransaction().commit();
        Org executer = getOrgToId(document.getExecutor().getId());
        //?????????? JMS ?????????doc
        ConnectionAMQ.messageProduser(new String(executer.getCode() + executer.getINN()), fullDoc);
    }

}
