package rsoi.Logic;

import rsoi.DataObject.DocumentClass;
import rsoi.DataObject.StateProgDoc;

import java.sql.SQLException;

/**
 * Created by madina on 12.05.14.
 */
public class CreateDocChild extends CreateStateProgDocBase {
    @Override
    public StateProgDoc createDoc(String progDoc, int documentClass) throws SQLException {
        StateProgDoc newDoc = super.createDoc(progDoc, documentClass);
        newDoc.setParent(getDoc(progDoc));
        addStateProgDoc(newDoc);
        new UpdateDocbase().updateStateProgDoc(progDoc, "3");
        return newDoc;
    }
}
