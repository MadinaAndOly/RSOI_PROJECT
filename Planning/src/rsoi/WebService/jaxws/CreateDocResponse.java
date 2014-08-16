
package rsoi.WebService.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "createDocResponse", namespace = "http://WebService.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "createDocResponse", namespace = "http://WebService.rsoi/")
public class CreateDocResponse {

    @XmlElement(name = "return", namespace = "")
    private rsoi.DataObject.StateProgDoc _return;

    /**
     * 
     * @return
     *     returns StateProgDoc
     */
    public rsoi.DataObject.StateProgDoc getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(rsoi.DataObject.StateProgDoc _return) {
        this._return = _return;
    }

}
