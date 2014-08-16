package rsoiExc;

/**
 * Created by madina on 26.05.14.
 */

import rsoi.webservice.StateProgDoc;

import javax.jms.Message;
import javax.jms.MessageListener;
import javax.jms.ObjectMessage;

public class Listener implements MessageListener {

    @Override
    public void onMessage(Message message) {
       try{
           if(message instanceof ObjectMessage){
               StateProgDoc doc = (StateProgDoc) ((ObjectMessage) message).getObject();
           }
       } catch (Exception e){
           e.printStackTrace();
       }
    }
}
