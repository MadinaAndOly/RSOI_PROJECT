
package rsoi.model.jaxws;

import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getAllStateProgDocResponse", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getAllStateProgDocResponse", namespace = "http://model.rsoi/")
public class GetAllStateProgDocResponse {

    @XmlElement(name = "return", namespace = "")
    private List<rsoi.DataObject.StateProgDoc> _return;

    /**
     * 
     * @return
     *     returns List<StateProgDoc>
     */
    public List<rsoi.DataObject.StateProgDoc> getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(List<rsoi.DataObject.StateProgDoc> _return) {
        this._return = _return;
    }

}
