package rsoi.WebService;

/**
 * Created by madina on 11.05.14.
 */

import org.w3c.dom.Element;
import rsoi.DataObject.DocumentClass;
import rsoi.DataObject.StateProgDoc;

import java.util.Date;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;


@WebService
@SOAPBinding(style = Style.DOCUMENT)
public interface IWebService {
    @WebMethod
    public  String updateDoc(String document, String state);

    @WebMethod
    public StateProgDoc createDoc(String document, int classDoc);

    @WebMethod
    public String scaleDateEnd(String document, Date dateEnd);
}

