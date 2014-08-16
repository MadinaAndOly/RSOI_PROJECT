package rsoi.Logic;

import org.hibernate.Session;
import rsoi.DataObject.StateProgDoc;
import rsoi.DataObject.StateProgDocChildren;
import rsoi.Util.HibernateUtil;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by madina on 12.05.14.
 */
public class UpdateDoc extends  UpdateDocbase {

    public List<StateProgDoc> getChildren(int parentId){
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from StateProgDoc doc where doc.parent=" + parentId ;
        List<StateProgDoc> result  = session.createQuery(qr).list();
        session.getTransaction().commit();
        return result;
    }

    public List<StateProgDoc> getSubProgram(int masterId){
        List<StateProgDoc> result = new ArrayList<StateProgDoc>();
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        String qr = "from StateProgDocChildren child where child.master=" + masterId ;
        List<StateProgDocChildren> children_list  = session.createQuery(qr).list();
        session.getTransaction().commit();
        for(StateProgDocChildren children: children_list){
            result.add(getStProgdoc(children.getSlave().getId()));
        }

        return result;
    }

    public void updateSubProgram(String state) throws SQLException {
        Iterator iterator = getSubProgram(document.getId()).iterator();
        while (iterator.hasNext()){
            StateProgDoc st = (StateProgDoc) iterator.next();
            updateStateProgDoc(st.getNumberDoc() + "&" + st.getDateDoc(), state);
        }
    }

    @Override
    public void updateStateProgDoc(String doc, String state) throws SQLException {
        super.updateStateProgDoc(doc, state);
        if(document != null){
            StateProgDoc progDoc = document;
            updateSubProgram(state);
            document = progDoc;
            Iterator i = getChildren(document.getId()).iterator();
            while (i.hasNext()){
                StateProgDoc st = (StateProgDoc) i.next();
                updateStateProgDoc(st.getNumberDoc() + "&" + st.getDateDoc(), state);
            }
        }

    }
}
