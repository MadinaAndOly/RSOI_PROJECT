package rsoi.Logic;

import org.hibernate.Session;
import rsoi.DataObject.DocumentClass;
import rsoi.DataObject.StateProgDoc;
import rsoi.Util.HibernateUtil;

import java.math.BigInteger;
import java.sql.SQLException;
import java.util.Calendar;

/**
 * Created by madina on 12.05.14.
 */
public abstract class CreateStateProgDocBase extends fullDoc{



    public StateProgDoc createDoc(String progDoc, int documentClass) throws SQLException {

        StateProgDoc doc = getDoc(progDoc);

        StateProgDoc newDoc = new StateProgDoc();
        newDoc.setNumberDoc(doc.getNumberDoc().add(BigInteger.ONE));
        newDoc.setCaption(doc.getCaption());
        newDoc.setDateDoc(Calendar.getInstance().getTime());
        newDoc.setDateStart(newDoc.getDateDoc());
        newDoc.setDateEnd(doc.getDateEnd());
        newDoc.setDocumentClass(new DocumentClass(documentClass,getClassCaption(documentClass)) );
        newDoc.setExecutor(doc.getExecutor());
        newDoc.setState(1);
        return newDoc;

    }

    public void addStateProgDoc(StateProgDoc doc) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        session.save(doc);
        session.getTransaction().commit();
    }


}
