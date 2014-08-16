
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "getOrgResponse", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "getOrgResponse", namespace = "http://model.rsoi/")
public class GetOrgResponse {

    @XmlElement(name = "return", namespace = "")
    private rsoi.DataObject.Org _return;

    /**
     * 
     * @return
     *     returns Org
     */
    public rsoi.DataObject.Org getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(rsoi.DataObject.Org _return) {
        this._return = _return;
    }

}
