package rsoi;

import javax.jms.*;

import org.apache.activemq.ActiveMQConnection;
import org.apache.activemq.ActiveMQConnectionFactory;
import rsoi.DataObject.StateProgDoc;

/**
 * Created by madina on 12.05.14.
 */
public class ConnectionAMQ {
    public static void messageProduser(String executer, StateProgDoc doc) {
        try {
            // Create a ConnectionFactory
         /*   ConnectionDB connectionFactory=new ActiveMQConnectionFactory("admin", "admin", ActiveMQConnection.DEFAULT_BROKER_URL);
            // Create a Connection
            Connection connection = connectionFactory.createConnection();
            connection.start();
            // Create a Session
            Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);
            // Create the destination
            Destination destination = session.createQueue(executer);
            // Create a MessageProducer from the Session to the Queue
            MessageProducer producer = session.createProducer(destination);
            producer.setDeliveryMode(DeliveryMode.NON_PERSISTENT);
            // Create a messages
            ObjectMessage message = session.createObjectMessage(doc);
            producer.send(message);
            session.close();
            connection.close();
            System.out.println("Message sent");*/

        }
        catch (Exception e) {
            System.out.println(e);
            e.printStackTrace();
        }
    }
}
