package rsoi.WebService;

import org.w3c.dom.Element;
import rsoi.DataObject.DocumentClass;
import rsoi.DataObject.StateProgDoc;
import rsoi.Logic.mainLogic;

import javax.jws.WebMethod;
import javax.jws.WebService;
import java.sql.SQLException;
import java.util.Date;


/**
 * Created by madina on 11.05.14.
 */
@WebService(endpointInterface = "rsoi.WebService.IWebService")
public class WebServiceImp implements IWebService{
    public String updateDoc(String document, String state)  {
       return mainLogic.updateDoc(document, state);
    }

    public StateProgDoc createDoc(String document, int classDoc)  {
       try{
           return mainLogic.createDoc(document, classDoc);
       }
       catch (Exception e){
           e.printStackTrace();
       }
       return null;
    }

    public String scaleDateEnd(String document, Date dateEnd) {
        try{
            return mainLogic.scaleDateEnd(document, dateEnd);
            
        }
        catch (Exception e){
            e.printStackTrace();
        }
        return null;
    }
}
