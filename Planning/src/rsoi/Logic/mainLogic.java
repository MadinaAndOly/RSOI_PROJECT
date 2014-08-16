package rsoi.Logic;

import rsoi.DataObject.StateProgDoc;

import java.sql.SQLException;
import java.util.Date;

/**
 * Created by madina on 11.05.14.
 */
public class mainLogic {
    public static StateProgDoc createDoc(String doc, int docClass) throws SQLException {

        if (Integer.valueOf(doc.substring(0, doc.indexOf("&"))) == docClass){
            return new CreateDocChild().createDoc(doc.substring(doc.indexOf("&")+1, doc.length()), docClass);
        }
        else
            return new CreateDoc().createDoc(doc.substring(doc.indexOf("&")+1, doc.length()), docClass);
    }


    public static String updateDoc(String document, String state) {
       String result = "yes";
       try {
           new UpdateDoc().updateStateProgDoc(document, state);
       }
       catch (Exception e){
          result = e.getMessage().toString();
       }
       return result;
    }

    public static String scaleDateEnd(String document, Date dateEnd) throws SQLException {
        String result = "yes";
        new UpdateDoc().editDoc(document, dateEnd);
        return result;
    }
}
