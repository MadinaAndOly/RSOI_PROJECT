package rsoi;

import javafx.util.converter.DateTimeStringConverter;
import rsoi.model.Exception_Exception;
import rsoi.model.IModel;
import rsoi.model.ModelImpService;
import rsoi.model.User;
import sun.util.calendar.Gregorian;

import javax.rmi.CORBA.Util;
import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Created by madina on 06.06.14.
 */
public class Test {

    public static XMLGregorianCalendar getXMLDate(GregorianCalendar date)  {
        try {
            DatatypeFactory factory = DatatypeFactory.newInstance();
            return factory.newXMLGregorianCalendar(date);
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;

    }
    public static void main(String[] args) throws Exception_Exception {
        ModelImpService service = new ModelImpService();
        IModel port = service.getModelImpPort();
        User user = new User();
        user.setLname("Omarova");
        user.setLogin("OMO");
        user.setPwd("2120");
        user.setName("Madina");
        user.setMname("O");
        /*GregorianCalendar calendar = new GregorianCalendar();
        calendar.setTimeInMillis((new Date()).getTime());
        user.setLastUpdate(getXMLDate(calendar));*/
        user.setGuid("USER");

      //  System.out.println(port.authorizeUser("OMO","2120"));

        System.out.println(port.registerNewUser(user));

        System.out.println(port.testDao(user).getLogin());
    }


}
