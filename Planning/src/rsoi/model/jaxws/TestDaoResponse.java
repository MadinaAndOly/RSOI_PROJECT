
package rsoi.model.jaxws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "testDaoResponse", namespace = "http://model.rsoi/")
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "testDaoResponse", namespace = "http://model.rsoi/")
public class TestDaoResponse {

    @XmlElement(name = "return", namespace = "")
    private rsoi.DataObject.User _return;

    /**
     * 
     * @return
     *     returns User
     */
    public rsoi.DataObject.User getReturn() {
        return this._return;
    }

    /**
     * 
     * @param _return
     *     the value for the _return property
     */
    public void setReturn(rsoi.DataObject.User _return) {
        this._return = _return;
    }

}
