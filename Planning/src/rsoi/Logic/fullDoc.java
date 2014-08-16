package rsoi.Logic;

import org.hibernate.Session;
import rsoi.DataObject.DocumentClass;
import rsoi.DataObject.Org;
import rsoi.DataObject.StateProgDoc;
import rsoi.Util.HibernateUtil;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by madina on 12.05.14.
 */
public class fullDoc {

    public StateProgDoc getDoc(String doc) throws SQLException {
       /* ResultSet rs = ConnectionDB.getStatement().executeQuery("SELECT * FROM Planning pl where "+
                "pl.numberDoc="+doc.getNumberDoc() +" and pl.dateDoc="+doc.getDateDoc());
        while (rs.next()){
            return (StateProgDoc)rs;
        }*/
        String number = doc.substring(0,doc.indexOf("&"));
        String date = doc.substring(doc.indexOf("&")+1, doc.length());
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from StateProgDoc doc where doc.numberDoc=" + number  +
                " and doc.dateDoc='" + date.substring(0,10)+"'";
        List<StateProgDoc> result  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return result.get(0);
    }

    public String getClassCaption(int doc_class){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from DocumentClass dc where dc.classDoc=" + doc_class ;
        List<DocumentClass> result  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return result.get(0).getCaption();
    }

    public Org getOrgToId(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from Org o where o.id=" + id ;
        Org result  = (Org) session.createQuery(qr).list().get(0);
        session.getTransaction().commit();
        return result;
    }

    public DocumentClass getDocClassToId(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from DocumentClass dc where dc.id=" + id ;
        DocumentClass result  = (DocumentClass) session.createQuery(qr).list().get(0);
        session.getTransaction().commit();
        return result;
    }

    public StateProgDoc getStProgdoc(int id){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from StateProgDoc doc where doc.id=" + id ;
        StateProgDoc result  = (StateProgDoc) session.createQuery(qr).list().get(0);
        session.getTransaction().commit();
        return result;
    }
}
