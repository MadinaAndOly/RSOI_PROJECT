import com.sun.org.apache.xerces.internal.jaxp.datatype.XMLGregorianCalendarImpl;
import rsoiExc.DataObject.Programms;
import rsoiExc.Listener;
import rsoiExc.Util.UtilHibernate;
import rsoi.webservice.*;

import javax.jms.*;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Session;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by madina on 11.05.14.
 */
public class main {
    public static StateProgDoc getStateProgDoc(Programms pr){
        StateProgDoc doc = new StateProgDoc();

        doc.setCaption(pr.getCaption());
        doc.setDateEnd(new XMLGregorianCalendarImpl(pr.getDateEnd()));
        doc.setDateStart(new XMLGregorianCalendarImpl(pr.getDateStart()));
      //  doc.setDateDoc(new XMLGregorianCalendarImpl(pr.getDateDoc()));
        doc.setNumberDoc(pr.getNumberDoc());
        doc.setExecutor(new Org());
        return doc;
    }

    public static void main(String[] args) {
       /* List<Programms> list = new ArrayList<Programms>();

        org.hibernate.Session session =  UtilHibernate.getSessionFactory().getCurrentSession();
        session.beginTransaction();
        list = session.createQuery("from Programms ").list();
        session.getTransaction().commit();

        WebServiceImpService service = new WebServiceImpService();
        IWebService port = service.getWebServiceImpPort();
        String key_doc = list.get(0).getNumberDoc() + "&" + list.get(0).getDateDoc();
        String result = port.updateDoc(key_doc, "5");
        System.out.println(result);*/
        getMQ();

    }

    public static void getMQ() {
        try {
            // Create a ConnectionFactory
            ConnectionFactory connectionFactory = new ActiveMQConnectionFactory(
                    "admin", "admin", ActiveMQConnection.DEFAULT_BROKER_URL);
            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();
            // Create a Session
            Session session = connection.createSession(false,
                    Session.AUTO_ACKNOWLEDGE);
            // Create the destination
            Destination destination = session.createQueue("0012123143365");
            // Create a MessageConsumer from the Session to the Queue
            MessageConsumer consumer = session.createConsumer(destination);
            // Wait for a message
            Listener msg = new Listener();
            consumer.setMessageListener(msg);
           // Message message = consumer.receive(1000);
            /*if (message instanceof TextMessage) {
                TextMessage textMessage = (TextMessage) message;
                String text = textMessage.getText();
                System.out.println("Text Message is " + text);

            }
            else {
                System.out.println(message);
            }*/
            consumer.close();
            session.close();
            connection.close();

                } catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }

}
